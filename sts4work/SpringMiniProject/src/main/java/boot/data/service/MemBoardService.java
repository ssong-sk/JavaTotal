package boot.data.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.data.dto.MemBoardDto;
import boot.data.mapper.MemBoardMapperInter;

@Service
public class MemBoardService implements MemBoardServiceInter {

	@Autowired
	MemBoardMapperInter mapperInter;
	
	//갯수
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return mapperInter.getTotalCount();
	}

	//insert
	@Override
	public void insertMemBoard(MemBoardDto dto) {
		// TODO Auto-generated method stub
		mapperInter.insertMemBoard(dto);
	}

	//리스트
	@Override
	public List<MemBoardDto> getlist(int start, int perpage) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("perpage", perpage);
		
		return mapperInter.getlist(map);
	}

	//num값 넘기기
	@Override
	public MemBoardDto getData(String num) {
		// TODO Auto-generated method stub
		return mapperInter.getData(num);
	}

	
	@Override
	public void updateReadCount(String num) {
		// TODO Auto-generated method stub
		mapperInter.updateReadCount(num);
	}

	@Override
	public int getMaxNum() {
		// TODO Auto-generated method stub
		return mapperInter.getMaxNum();
	}

}