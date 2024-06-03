package boot.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.ReBoardDto;

@Mapper
public interface ReBoardMapperInter {

	//갯수 및 검색
	public int getTotalCount(Map<String, String> map);
	
	//insert
	public void insertReBoard(ReBoardDto dto);
	
	//페이징 처리
	public List<ReBoardDto> getPaginglist(Map<String, Object> map);
	
	//num값 넘기기
	public ReBoardDto getData(int num);
	
	
	//최신글이 위에 올라오더라도 내가 쓴 글이 위에 정렬하기위해서 사용
	public void updateRestep(Map<String, Integer> map);
	
	//페이징 처리
	public void updateReadCount(int num);
	
	//마지막 페이징처리(상세보기에 가야하기 때문)
	public int getMaxNum();
	
	//삭제
	public void deleteBoard(int num);
	
	//좋아요 카운트
	public void likesUpdte(int num);
}
