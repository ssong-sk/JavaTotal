package spring.db.answerdata;

import java.util.List;

public interface AnswerDaoInter {
	
	//insert
	public void insertAnswer(AnswerDto dto);
	
	//select
	public List<AnswerDto> getAnswerList(int num);
	
	//비밀번호 체크
	public int getCheckPass(int idx, String pass);
	
	//delete
	public void deleteAnswer(int idx);

}
