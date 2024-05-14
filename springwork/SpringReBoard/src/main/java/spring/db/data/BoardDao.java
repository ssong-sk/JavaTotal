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
	
	//전체갯수
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("TotalCountOfBoard");
	}

	//num의 max값, null일 경우 0
	@Override
	public int getMaxNum() {
		// TODO Auto-generated method stub
		return session.selectOne("MaxNumOfBoard");
	}

	//같은 그룹 중 step보다 큰 데이터는 모두 +1
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
		int num = dto.getNum(); //dto로 부터 num 값을 받았을 경우 0:새글 , 1보다 클떄는 : 답글
		int regroup = dto.getRegroup();
		int restep = dto.getRestep();
		int relevel = dto.getRelevel();
		
		if(num==0) { //새글
			
			regroup = getMaxNum()+1;
			restep = 0;
			relevel=0;
		}
		else { //답글
			
			//같은 그룹 중 전달 받은 restep보다 큰 글들은 +1
			this.updateRestep(regroup, restep);
			
			//전달받은 step level +1
			restep++;
			relevel++;
			
		}
		
		//바뀐 값들 다시 dto 담기
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

	//조회수
	@Override
	public void updateReadCount(int num) {
		// TODO Auto-generated method stub
		session.update("UpdateReadCountOfBoard", num);
	}

	//num -> 수정폼가져오기 / content폼
	@Override
	public BoardDto getOneData(int num) {
		// TODO Auto-generated method stub
		return session.selectOne("getDataOfBoard", num);
	}

	//pass체크
	@Override
	public int getCheckPass(int num, int pass) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("num", num);
		map.put("pass", pass);
		
		return session.selectOne("CheckEqualPassOfBoard", map);
	}

	//수정하기
	@Override
	public void updateBoard(BoardDto dto) {
		// TODO Auto-generated method stub
		session.update("UpdateOfBoard", dto);
	}

	//삭제
	@Override
	public void deleteBoard(int num) {
		// TODO Auto-generated method stub
		session.delete("DeleteOfBoard", num);
	}

}
