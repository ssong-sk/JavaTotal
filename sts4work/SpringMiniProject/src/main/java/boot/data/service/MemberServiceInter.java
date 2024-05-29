package boot.data.service;

import java.util.List;
import java.util.Map;

import boot.data.dto.MemberDto;

public interface MemberServiceInter {
	
	//insert
	public void insertMember(MemberDto dto);
	
	//전체출력
	public List<MemberDto> getAllMembers();
	
	//id검색
	public int getSerchId(String id);
	
	// name 반환
	public String getName(String id);

	// 아이디, 비번 체크(로그인)
	public int loginIdPassCheck(String id, String pass);

	// 데이터 넘기기 -> 정보(로그인)
	public MemberDto getDataById(String id);
	
	//삭제
    public void deleteMember(String num);

}
