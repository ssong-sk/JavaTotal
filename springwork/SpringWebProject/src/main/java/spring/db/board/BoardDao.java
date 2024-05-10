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
	
	//전체갯수
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("totalCountOfBoard");
	}

	//페이징당 게시물 갯수
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

	//전체조회
	@Override
	public List<BoardDto> getAllList() {
		// TODO Auto-generated method stub
		return session.selectList("selectAllOfBoard");
	}

	//상세보기
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

	//페이징
	@Override
	public List<BoardDto> getList(int start, int perpage) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("start", start);
		map.put("perpage", perpage);
		
		return session.selectList("selectPagingListOfMember", map);
	}

}
