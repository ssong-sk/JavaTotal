package boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import boot.data.BookMapperInter;

@Controller
public class BookController {
	
	@Autowired
	BookMapperInter mapper;
	
	//root 설정
	@GetMapping("/") 
	public String start() {
		
		return "redirect:book/list";
	}
	
	//list 띄우기
	@GetMapping("/book/list")
	public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		
		//갯수
		int totalCount = mapper.getTotalCount();
		
		//저장하기
		mview.addObject("totalCount", totalCount);
		
		//포워드
		mview.setViewName("book/booklist");
		
		return mview;
	}

}
