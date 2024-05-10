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
}
