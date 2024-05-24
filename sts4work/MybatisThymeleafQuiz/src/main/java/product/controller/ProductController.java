package product.controller;

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
import product.dto.ProductDto;
import product.service.ProductService;

@Controller
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService proService;
	
	//LIST / 기본화면
	@GetMapping("/")
	public String list(Model model) {
		
		//갯수
		int totalCount = proService.getTotalCount();
		
		//list
		List<ProductDto> list = proService.getAllProduct();
		
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("list", list);
		
		return "product/productlist";
	}
	//저장폼
	@GetMapping("/form")
	public String form() {
		
		return "product/addform";
	}

	//저장하기
	@PostMapping("/insert")
	public String insert(@ModelAttribute ProductDto dto, @RequestParam MultipartFile upload, HttpServletRequest request) {
		
		// 실제경로
		String realPath = request.getServletContext().getRealPath("/productimage");
		System.out.println(realPath);

		if (upload.getOriginalFilename().equals("")) {

			dto.setPro_image(null);
		} else {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String phtoname = sdf.format(new Date()) + upload.getOriginalFilename();

			dto.setPro_image(phtoname);

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
		proService.insertProduct(dto);
		
		
		return "redirect:/";
	}
	
	//detail 페이지
	@GetMapping("/detail")
	public String detail(@RequestParam int pro_num, Model model) {

		ProductDto dto = proService.getData(pro_num);
		model.addAttribute("dto", dto);

		return "product/productdetail";
			
		}
}
