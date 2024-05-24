package myshop.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import myshop.dto.ShopDto;
import myshop.service.MyShopService;

@Controller
@RequiredArgsConstructor //무조건 final을 적용해서 사용 가능
public class MyShopController {

	private final MyShopService shopService;
	
	@GetMapping("/")
	public String list(Model model) {
		
		//갯수
		int totalCount = shopService.getTotalCount();
		
		//list
		List<ShopDto> list = shopService.getAllSangpums();
		
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("list", list);
		
		return "myshop/shoplist";
	}
	
	//저장폼
	@GetMapping("/addform")
	public String form() {
		
		return "myshop/shopform";
	}
	
	//저장 insert하기
	@PostMapping("/insert")
	public String insert(@ModelAttribute ShopDto dto, @RequestParam MultipartFile upload, HttpServletRequest request) {

		// 실제경로
		String realPath = request.getServletContext().getRealPath("/photo");
		System.out.println(realPath);

		if (upload.getOriginalFilename().equals("")) {

			dto.setPhoto(null);
		} else {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String phtoname = sdf.format(new Date()) + upload.getOriginalFilename();

			dto.setPhoto(phtoname);

			try {
				upload.transferTo(new File(realPath + "\\" + phtoname));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// db insert
		shopService.insertShop(dto);

		return "redirect:/";
	}
	
	
	//detail 페이지
	@GetMapping("/detail")
	public String detail(@RequestParam int num, Model model) {
		
		ShopDto dto = shopService.getData(num);
		model.addAttribute("dto", dto);
		
		return "myshop/shopdetail";
		
	}
	
	@GetMapping("/delete")
	public String delete(@ModelAttribute ShopDto dto, HttpSession session, @RequestParam int num) {
		
		String oldFileName = shopService.getData(num).getPhoto();
		String realPath = session.getServletContext().getRealPath("/photo");
		
		File file = new File(realPath+"\\"+oldFileName);
		
		if(file.exists()) {
			
			file.delete();
		}
		
		//db delete
		shopService.deleteShop(dto);
		
		return "redirect:/";
	}
}
