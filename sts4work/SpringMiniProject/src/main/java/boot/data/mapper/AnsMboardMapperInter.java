package boot.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.AnswerMboardDto;

@Mapper
public interface AnsMboardMapperInter {

	//insert
	public void insertAnswer(AnswerMboardDto dto);
	
	//list
	public List<AnswerMboardDto> getAllAnswer(String num);
	
	//idx넘기기
	public AnswerMboardDto getAnswer(String idx);
	
	//업데이트
	public void updateAnswer(AnswerMboardDto dto);
	
	//삭제
	public void deleteAnswer(String idx);
	
}
