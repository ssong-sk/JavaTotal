package boot.data.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.data.dto.AnswerMboardDto;
import boot.data.service.AnsMboardService;
import boot.data.service.MemberService;

@RestController
public class AnswerBoardRestController {

	@Autowired
	AnsMboardService service;
	
	@Autowired
	MemberService mservice;
	
	//insert
	@PostMapping("/board/ainsert")
	public void insert(@ModelAttribute AnswerMboardDto dto, HttpSession session) {
		
		//글쓴사람 id 아닌 로그인한 id를 불러옴
		String myid = (String)session.getAttribute("myid");
		
		//작성자 이름
		String name = mservice.getName(myid);
		
		//dto에 넣기
		dto.setMyid(myid);
		dto.setName(name);
		
		//insert
		service.insertAnswer(dto);
		
	}
	
	//전체출력
	
	//수정
	
	//삭제
}
