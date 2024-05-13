package spring.db.data;

import java.util.List;

public interface BoardDaoInter {
	
	//전체갯수
	public int getTotalCount();
	
	//num의 max값, null일 경우 0
	public int getMaxNum();
	
	//같은 그룹 중 step보다 큰 데이터는 모두 +1
	public void updateRestep(int regroup, int restep);
	
	//insert
	public void insertBoard(BoardDto dto);
	
	//list
	public List<BoardDto> getList(int start, int perpage);
	
	//조회수
	public void updateReadCount(int num);
	
	//num 값 가져오기 -> 수정폼 / content폼
	public BoardDto getOneData(int num);

}
