package boot.data.service;

import java.util.List;

import boot.data.dto.AnswerMboardDto;

public interface AnsMboardServiceInter {

	// insert
	public void insertAnswer(AnswerMboardDto dto);

	// list
	public List<AnswerMboardDto> getAllAnswer(String num);

	// idx넘기기
	public AnswerMboardDto getAnswer(String idx);

	// 업데이트
	public void updateAnswer(AnswerMboardDto dto);

	// 삭제
	public void deleteAnswer(String idx);
}
