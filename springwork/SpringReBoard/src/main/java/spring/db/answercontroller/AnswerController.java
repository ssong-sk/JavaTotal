package spring.db.answercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.db.answerdata.AnswerDaoInter;
import spring.db.answerdata.AnswerDto;

@Controller
public class AnswerController {

	@Autowired
	AnswerDaoInter adao;
	
	//insert
	@PostMapping("/board/ainsert")
	public String answerinsert(@ModelAttribute AnswerDto dto, @RequestParam String currentPage) {
		
		//db�߰�
		adao.insertAnswer(dto);
		
		//���뺸��� �����̷�Ʈ
		return "redirect:content?num="+dto.getNum()+"&currentPage="+currentPage;
	}
	                        
}
