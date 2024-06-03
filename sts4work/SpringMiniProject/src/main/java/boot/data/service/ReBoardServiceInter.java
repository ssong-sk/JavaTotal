package boot.data.service;

import java.util.List;
import java.util.Map;

import boot.data.dto.ReBoardDto;

public interface ReBoardServiceInter {
	
	// 갯수 및 검색
	public int getTotalCount(String searchcolumn, String searchword);

	// insert
	public void insertReBoard(ReBoardDto dto);

	// 페이징 처리
	public List<ReBoardDto> getPagingList(String searchcolumn, String searchword, int start, int perpage);

	// num값 넘기기
	public ReBoardDto getData(int num);

	// 최신글이 위에 올라오더라도 내가 쓴 글이 위에 정렬하기위해서 사용
	public void updateRestep(int regroup, int restep);

	// 페이징 처리
	public void updateReadCount(int num);

	// 마지막 페이징처리(상세보기에 가야하기 때문)
	public int getMaxNum();

	// 삭제
	public void deleteBoard(int num);

	// 좋아요 카운트
	public void likesUpdte(int num);

}
