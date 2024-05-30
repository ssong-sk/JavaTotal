package boot.data.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import boot.data.dto.MemBoardDto;
import boot.data.service.MemBoardService;
import boot.data.service.MemberService;

@Controller
public class BoardController {

	@Autowired
	MemBoardService service;
	
	//dto에 있는 값을 받기 위해서 불러옴
	@Autowired
	MemberService mservice;
	
	@GetMapping("/board/list")
	public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		
		//갯수
		int totalCount = service.getTotalCount();
		
		mview.addObject("totalCount", totalCount);
		
		//포워드
		mview.setViewName("/board/boardlist");
		
		return mview;
	}
	
	//저장폼
	@GetMapping("/board/form")
	public String form() {
		
		return "/board/writeform";
	}
	
	//insert 
	@PostMapping("/board/insert")
	public String insert(@ModelAttribute MemBoardDto dto, HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/boardphoto");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		if(dto.getUpload().getOriginalFilename().equals("")) {
			
			dto.setUploadfile("no");
		}
		else {
			
			String uploadfile = sdf.format(new Date())+dto.getUpload().getOriginalFilename();
			
			dto.setUploadfile(uploadfile);
			
			
			try {
				dto.getUpload().transferTo(new File(path+"\\"+uploadfile));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//세션에서 아이디 얻어서 dto 저장
		String myid = (String)session.getAttribute("myid");
		dto.setMyid(myid); 
		
		//이름
		String name = mservice.getName(myid);
		dto.setName(name);
		
		//최종 insert
		service.insertMemBoard(dto);
		
		return "redirect:list";
	}
}
