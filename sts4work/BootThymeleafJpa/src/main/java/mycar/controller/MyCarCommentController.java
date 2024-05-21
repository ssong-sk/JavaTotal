package mycar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import mycar.data.MyCarCommentDto;
import mycar.data.MyCarDto;
import mycar.repository.MyCarCommentDao;

@RestController
@RequiredArgsConstructor //final 또는 @NonNull 멤버 변수만 자동 주입 (각 각의 dto 값에서)
public class MyCarCommentController {

	private final MyCarCommentDao commentDao;
	
	@GetMapping("/addcomment")
	public void addComment(@RequestParam Long num, @RequestParam String comment) {
		
		//먼저 mycardto에 num값을 넣은 후 mycarcommentdto에 넣어준다(외부키로 지정된 값)
		MyCarDto dto = MyCarDto.builder().num(num).build();
		
		//dto에 값 지정
		MyCarCommentDto commentDto = MyCarCommentDto.builder().comment(comment).mycar(dto).build();
		
		//db insert
		commentDao.insertCommentMyCar(commentDto);
		
	}
	
	
	//부모글에 달린 댓글 반환
	@GetMapping("/commentList")
	public List<MyCarCommentDto> commentList(@RequestParam Long num) {
		
		return commentDao.getMyCarCommentList(num);
	}
}
