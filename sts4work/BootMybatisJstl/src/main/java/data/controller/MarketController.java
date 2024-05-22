package data.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import data.dto.MarketDto;
import data.mapper.MarketMapperInter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MarketController {
	
	@Autowired //자동주입
	MarketMapperInter mapper;
	
	//root
	@GetMapping("/")
	public String start() {
		
		return "redirect:market/list";
	}
	
	//list띄우기
	@GetMapping("/market/list")
	public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		
		//db로부터 총 갯수 얻기
		int totalCount = mapper.getTotalCount();
		
		//list 가져오기
		List<MarketDto> list = mapper.getAllDatas();
		
		//저장하기
		mview.addObject("totalCount", totalCount);
		mview.addObject("list", list);
		
		//포워드
		mview.setViewName("market/marketlist");
		
		return mview;
	}
	
	//insert
	@GetMapping("/market/addform")
	public String form() {
		
		return "market/addform";
	}
	
	@PostMapping("/market/insert")
	public String insert(@ModelAttribute MarketDto dto, @RequestParam MultipartFile photo, HttpServletRequest request) {
		
		//실제경로
		String realPath = request.getServletContext().getRealPath("/photo");
		System.out.println(realPath);

		if (photo.getOriginalFilename().equals("")) {

			dto.setPhotoname(null);
		} else {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String phtoname = sdf.format(new Date())+photo.getOriginalFilename();
            
            dto.setPhotoname(phtoname);
            
            try {
				photo.transferTo(new File(realPath+"\\"+phtoname));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//db insert
		mapper.insertMarket(dto);
		
		return "redirect:list";
	}
	
	//update
	@GetMapping("/market/updateform")
	public ModelAndView uform(@RequestParam String num) {
			
		ModelAndView mveiw = new ModelAndView();
		
		MarketDto dto = mapper.getData(num);
		
		mveiw.addObject("dto", dto);
		
		mveiw.setViewName("market/updateform");
		
		return mveiw;
	}
	
	//수정하기
	@PostMapping("/market/update")
	public String update(@ModelAttribute MarketDto dto, @RequestParam MultipartFile photo, HttpServletRequest request) {
		
		//실제경로
		String realPath = request.getServletContext().getRealPath("/photo");
		System.out.println(realPath);

		if (photo.getOriginalFilename().equals("")) {

			dto.setPhotoname(null);
		} else {
			
			//수정전에 이전 사진 지우기
			String pre_photo = mapper.getData(dto.getNum()).getPhotoname();
			
			File file = new File(realPath+"\\"+pre_photo);
			
			if(file.exists()) {
				file.delete();
			}
			

			//파일수정 저장
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String phtoname = sdf.format(new Date())+photo.getOriginalFilename();
            
            dto.setPhotoname(phtoname);
            
            try {
				photo.transferTo(new File(realPath+"\\"+phtoname));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//db update
		mapper.updateMarket(dto);
		
		return "redirect:list";
	}

	//delete
	@GetMapping("/market/delete")
	public String delete(@RequestParam String num, HttpSession session) {
		
		String photo = mapper.getData(num).getPhotoname();
		
		if(photo!="no") {
			
			String path = session.getServletContext().getRealPath("/photo");
			
			File file = new File(path+"\\"+photo);
			
			if(file.exists()) {
				
				file.delete();
			}
		}
		
		mapper.deleteMarket(num);
		
		return "redirect:list";
	}
}
