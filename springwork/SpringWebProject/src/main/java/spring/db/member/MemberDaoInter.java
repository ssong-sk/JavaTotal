package spring.db.member;

import java.util.HashMap;
import java.util.List;

public interface MemberDaoInter {
	
	//id 체크하기
	public int getIdCheck(String id);
	
	//insert
	public void insertMember(MemberDto dto);
	
	//전체 list 출력
	public List<MemberDto> getAllDatas();
	
	//num 가져오기 (수정폼)
	public MemberDto getOneData(String num);
	
	//추상메서드 만들기 (갯수)
    public int getTotalCount();
    
    //비밀번호 체크
    public int passCheck(String num, String pass);
    
    //수정하기
    public void updateMember(MemberDto dto);

}
