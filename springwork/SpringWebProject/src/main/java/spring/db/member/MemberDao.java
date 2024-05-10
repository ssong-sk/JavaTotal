package spring.db.member;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao implements MemberDaoInter {

	@Autowired
	private SqlSession session;
	
	//id check
	@Override
	public int getIdCheck(String id) {
		// TODO Auto-generated method stub
		return session.selectOne("idCheckOfMember", id);
	}

	//insert
	@Override
	public void insertMember(MemberDto dto) {
		// TODO Auto-generated method stub
		session.insert("idInsertOfMember", dto);
		
	}

	//전체list 
	@Override
	public List<MemberDto> getAllDatas() {
		// TODO Auto-generated method stub
		return session.selectList("allDataOfMember");
	}

	//num 값 -> 수정폼
	@Override
	public MemberDto getOneData(String num) {
		// TODO Auto-generated method stub
		return session.selectOne("selectOneOfMember", num);
	}

	//갯수가져오기
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("totalCountMember");
	}

	//비밀번호체크
	@Override
	public int passCheck(String num, String pass) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("num", num);
		map.put("pass", pass);
		
		return session.selectOne("passCheckOfMember", map);
	}

	//수정하기
	@Override
	public void updateMember(MemberDto dto) {
		// TODO Auto-generated method stub
		
		session.update("updateOfMember", dto);
	}

}
