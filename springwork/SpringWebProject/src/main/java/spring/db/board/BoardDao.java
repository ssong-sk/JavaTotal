package spring.db.board;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public class BoardDao implements BoardDaoInter {

	@Autowired
	private SqlSession session;
	
	//��ü����
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("totalCountOfBoard");
	}

	//����¡�� �Խù� ����
	@Override
	public int getMaxNum() {
		// TODO Auto-generated method stub
		return session.selectOne("maxNumOfBoard");
	}

	//insert
	@Override
	public void insertBoard(BoardDto dto) {
		// TODO Auto-generated method stub
		session.insert("insertOfBoard", dto);
	}

	//��ü��ȸ
	@Override
	public List<BoardDto> getAllList() {
		// TODO Auto-generated method stub
		return session.selectList("selectAllOfBoard");
	}

	//�󼼺���
	@Override
	public BoardDto getData(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("SelectOneOfBoard", num);
	}

	//readcount
	@Override
	public void updateReadCount(int num) {
		// TODO Auto-generated method stub
		session.update("updateReadCountOfBoard", num);
	}

	//����¡
	@Override
	public List<BoardDto> getList(int start, int perpage) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("start", start);
		map.put("perpage", perpage);
		
		return session.selectList("selectPagingListOfMember", map);
	}

}
