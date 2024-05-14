package spring.db.answerdata;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerDao implements AnswerDaoInter {
	
	@Autowired
	private SqlSession session;
	
    //insert
	@Override
	public void insertAnswer(AnswerDto dto) {
		// TODO Auto-generated method stub
		session.insert("insertOfAnswer", dto);
	}

	//select
	@Override
	public List<AnswerDto> getAnswerList(int num) {
		// TODO Auto-generated method stub
		return session.selectList("selectNumOfAnswer", num);
	}

	//delete
	@Override
	public void deleteAnswer(int idx) {
		// TODO Auto-generated method stub
		session.delete("deleteOfAnswer", idx);
	}

	//비밀번호 체크
	@Override
	public int getCheckPass(int idx, String pass) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("idx", idx);
		map.put("pass", pass);
		
		return session.selectOne("PassCheckOfAnswer", map);
	}
	

}
