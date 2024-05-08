package spring.db.carmember;

import java.util.List;

public interface CarMemberDaoInter {
	
	//insert
	public void insertMember(CarMemberDto dto);
	
	//전체조회
	public List<CarMemberDto> getAllDatas();
	
	//추상메서드 만들기
    public int getTotalCount ();

}
