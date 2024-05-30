package boot.data.service;

import java.util.HashMap;
import java.util.List;

import boot.data.dto.MemBoardDto;

public interface MemBoardServiceInter {
	
	// 갯수
	public int getTotalCount();
	
	//insert
	public void insertMemBoard(MemBoardDto dto);
	
	// 페이징처리
	public List<MemBoardDto> getlist(int start, int perpage);

	// num값 넘기기
	public MemBoardDto getData(String num);

	// 페이지 갯수
	public void updateReadCount(String num);

	// 페이지 마지막
	public int getMaxNum();

}
