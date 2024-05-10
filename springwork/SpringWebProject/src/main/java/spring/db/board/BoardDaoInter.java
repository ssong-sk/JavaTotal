package spring.db.board;

import java.util.List;

public interface BoardDaoInter {
    
	
	//��ü����
	public int getTotalCount();
	
	//���������� �Խù� ����
	public int getMaxNum();
	
	//insert
	public void insertBoard(BoardDto dto);
	
	//��ü��ȸ
	public List<BoardDto> getAllList();
	
	//�󼼺���
	public BoardDto getData(int num);
	
	//readcount
	public void updateReadCount(int num);
	
	//����¡
	public List<BoardDto> getList(int start, int perpage);
}
