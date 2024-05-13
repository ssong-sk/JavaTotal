package spring.db.board;

import java.util.List;

public interface BoardDaoInter {
    
	
	//전체갯수
	public int getTotalCount();
	
	//한페이지당 게시물 갯수
	public int getMaxNum();
	
	//insert
	public void insertBoard(BoardDto dto);
	
	//전체조회
	public List<BoardDto> getAllList();
	
	//상세보기
	public BoardDto getData(int num);
	
	//readcount
	public void updateReadCount(int num);
	
	//페이징
	public List<BoardDto> getList(int start, int perpage);
	
	//수정하기
	public void updateBoard(BoardDto dto);
	
	//삭제하기
	public void deleteBoard(int num);
	
	//아작스 리스트
	public List<BoardDto> getPhotoLists();
}
