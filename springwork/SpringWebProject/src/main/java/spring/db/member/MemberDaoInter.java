package spring.db.member;

import java.util.List;

public interface MemberDaoInter {
	
	//id 체크하기
	public int getIdCheck(String id);
	
	//insert
	public void insertMember(MemberDto dto);
	
	//전체 list 출력
	public List<MemberDto> getAllDatas();
	
	//num 가져오기 (갯수)
	public MemberDto getOneData(String num);
	
	//추상메서드 만들기
    public int getTotalCount();

}
