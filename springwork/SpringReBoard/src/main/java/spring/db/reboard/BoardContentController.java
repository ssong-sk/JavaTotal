package spring.db.reboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.db.answerdata.AnswerDaoInter;
import spring.db.answerdata.AnswerDto;
import spring.db.data.BoardDaoInter;
import spring.db.data.BoardDto;

@Controller
public class BoardContentController {
	
	@Autowired
	BoardDaoInter dao;
	@Autowired
	AnswerDaoInter adao;
	
	//content가져오기
	@GetMapping("/board/content")
	public ModelAndView content(@RequestParam int num, @RequestParam int currentPage) {
		
		ModelAndView mview = new ModelAndView();
		
		dao.updateReadCount(num);
		
		BoardDto dto = dao.getOneData(num);
		mview.addObject("dto", dto);
		mview.addObject("currentPage", currentPage);
		
		//num에 해당하는 댓글 db에 가져와서 보낸다
		List<AnswerDto> alist = adao.getAnswerList(num);
		
		//댓글이 있을 때만 보내기
		mview.addObject("alist", alist);
		mview.addObject("acount", alist.size());
		
		mview.setViewName("board/content");
		
		return mview;
	}

}
