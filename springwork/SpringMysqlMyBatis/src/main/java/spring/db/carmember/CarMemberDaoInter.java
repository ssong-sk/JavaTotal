package spring.db.carmember;

import java.util.List;

public interface CarMemberDaoInter {
	
	//insert
	public void insertMember(CarMemberDto dto);
	
	//전체조회
	public List<CarMemberDto> getAllDatas();
	
	//추상메서드 만들기
    public int getTotalCount ();

    //num하나값 넘기기 -> 수정폼
    public CarMemberDto getOneData(String num);
    
    //수정
    public void updateCarMember(CarMemberDto dto);
    
    //삭제
    public void deleteMember(String num);
}
