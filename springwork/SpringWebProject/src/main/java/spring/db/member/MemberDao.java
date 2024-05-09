package spring.db.member;

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

	//��ülist 
	@Override
	public List<MemberDto> getAllDatas() {
		// TODO Auto-generated method stub
		return session.selectList("allDataOfMember");
	}

	//num ��
	@Override
	public MemberDto getOneData(String num) {
		// TODO Auto-generated method stub
		return session.selectOne("selectOneOfMember");
	}

	//������������
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("totalCountMember");
	}

}
