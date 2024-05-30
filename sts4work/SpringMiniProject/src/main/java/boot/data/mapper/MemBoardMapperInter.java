package boot.data.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.MemBoardDto;

@Mapper
public interface MemBoardMapperInter {
	
	//갯수
	public int getTotalCount();
	
	//insert
	public void insertMemBoard(MemBoardDto dto);
	
	//페이징처리
	public List<MemBoardDto> getlist(HashMap<String, Integer> map);
	
	//num값 넘기기
	public MemBoardDto getData(String num);
	
	//페이지 갯수
	public void updateReadCount(String num);
	
	//페이지 마지막
	public int getMaxNum();
}
