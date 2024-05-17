package board.data;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class BoardController {

	@Autowired
	BoardDao dao;
	
	@GetMapping("/")
	public String home() {
		
		return "redirect:board/list"; //처음 시작할때는 폴더경로까지 입력
	}
	
	@GetMapping("/board/list")
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView();
		
		List<BoardDto> list = dao.getAllDatas();
		
		model.addObject("list", list);
		model.addObject("count", list.size());
		
		model.setViewName("board/boardlist");
		
		return model;
	}
	
	//저장폼
	@GetMapping("/board/addform")
	public String form() {
		
		return "board/writeform";
	}
	
	//insert
	@PostMapping("/board/add")
	public String insert(@ModelAttribute BoardDto dto, @RequestParam MultipartFile upload, HttpSession session) {
		
		//실제경로
		String realPath = session.getServletContext().getRealPath("/save");
		System.out.println(realPath);
		
		String uploadName = upload.getOriginalFilename();
		
		if(upload.isEmpty()) {
			
			dto.setPhoto("no");
		}
		else {
			
			dto.setPhoto(uploadName);
			
			//실제 업로드 
			try {
				upload.transferTo(new File(realPath + "\\" + uploadName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//db저장
		dao.insertBoard(dto);
		
		return "redirect:list";
	}
	
	//디테일 페이지
	@GetMapping("/board/detail")
	public String detail(@RequestParam Long num, Model model) {
		
		BoardDto dto = dao.getData(num);
		model.addAttribute("dto", dto);
		
		return "board/detail";
	}
}
