package spring.db.data;

import java.util.List;

public interface BoardDaoInter {
	
	//��ü����
	public int getTotalCount();
	
	//num�� max��, null�� ��� 0
	public int getMaxNum();
	
	//���� �׷� �� step���� ū �����ʹ� ��� +1
	public void updateRestep(int regroup, int restep);
	
	//insert
	public void insertBoard(BoardDto dto);
	
	//list
	public List<BoardDto> getList(int start, int perpage);
	
	//��ȸ��
	public void updateReadCount(int num);
	
	//num �� �������� -> ������ / content��
	public BoardDto getOneData(int num);

}
