package spring.db.data;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao implements BoardDaoInter {

	@Autowired
	private SqlSession session;
	
	//��ü����
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("TotalCountOfBoard");
	}

	//num�� max��, null�� ��� 0
	@Override
	public int getMaxNum() {
		// TODO Auto-generated method stub
		return session.selectOne("MaxNumOfBoard");
	}

	//���� �׷� �� step���� ū �����ʹ� ��� +1
	@Override
	public void updateRestep(int regroup, int restep) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("regroup", regroup);
		map.put("restep", restep);
		
		session.update("UpdateStepOfBoard", map);
	}

	//insert
	@Override
	public void insertBoard(BoardDto dto) {
		// TODO Auto-generated method stub
		int num = dto.getNum(); //dto�� ���� num ���� �޾��� ��� 0:���� , 1���� Ŭ���� : ���
		int regroup = dto.getRegroup();
		int restep = dto.getRestep();
		int relevel = dto.getRelevel();
		
		if(num==0) { //����
			
			regroup = getMaxNum()+1;
			restep = 0;
			relevel=0;
		}
		else { //���
			
			//���� �׷� �� ���� ���� restep���� ū �۵��� +1
			this.updateRestep(regroup, restep);
			
			//���޹��� step level +1
			restep++;
			relevel++;
			
		}
		
		//�ٲ� ���� �ٽ� dto ���
		dto.setRegroup(regroup);
		dto.setRestep(restep);
		dto.setRelevel(relevel);
		
		session.insert("InsertOfBaord", dto);
		
	}

	//list
	@Override
	public List<BoardDto> getList(int start, int perpage) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("start", start);
		map.put("perpage", perpage);
		
		return session.selectList("SelectPagingListOfBoard", map);
	}

	//��ȸ��
	@Override
	public void updateReadCount(int num) {
		// TODO Auto-generated method stub
		session.update("UpdateReadCountOfBoard", num);
	}

	//num -> �������������� / content��
	@Override
	public BoardDto getOneData(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("getDataOfBoard", num);
	}

	//passüũ
	@Override
	public int getCheckPass(int num, int pass) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("num", num);
		map.put("pass", pass);
		
		return session.selectOne("CheckEqualPassOfBoard", map);
	}

	//�����ϱ�
	@Override
	public void updateBoard(BoardDto dto) {
		// TODO Auto-generated method stub
		session.update("UpdateOfBoard", dto);
	}

	//����
	@Override
	public void deleteBoard(int num) {
		// TODO Auto-generated method stub
		session.delete("DeleteOfBoard", num);
	}

}
