package boot.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.data.dto.AnswerMboardDto;
import boot.data.mapper.AnsMboardMapperInter;

@Service
public class AnsMboardService implements AnsMboardServiceInter {

	@Autowired
	AnsMboardMapperInter mapper;
	
	//insert
	@Override
	public void insertAnswer(AnswerMboardDto dto) {
		// TODO Auto-generated method stub
		mapper.insertAnswer(dto);
	}

	//list
	@Override
	public List<AnswerMboardDto> getAllAnswer(String num) {
		// TODO Auto-generated method stub
		return mapper.getAllAnswer(num);
	}

	//idx 값 넘기기
	@Override
	public AnswerMboardDto getAnswer(String idx) {
		// TODO Auto-generated method stub
		return mapper.getAnswer(idx);
	}

	//update
	@Override
	public void updateAnswer(AnswerMboardDto dto) {
		// TODO Auto-generated method stub
		mapper.updateAnswer(dto);
	}

	//삭제
	@Override
	public void deleteAnswer(String idx) {
		// TODO Auto-generated method stub
		mapper.deleteAnswer(idx);
	}

}
