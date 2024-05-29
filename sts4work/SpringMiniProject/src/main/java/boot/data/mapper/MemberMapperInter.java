package boot.data.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.MemberDto;

@Mapper
public interface MemberMapperInter {

	//insert
	public void insertMember(MemberDto dto);
	
	//전체출력
	public List<MemberDto> getAllMembers();
	
	//id검색
	public int getSerchId(String id);
	
	//name 반환
	public String getName(String id);
	
	//아이디, 비번 체크(로그인)
	public int loginIdPassCheck(Map<String, String> map);
	
	//데이터 넘기기 -> 정보(로그인)
	public MemberDto getDataById(String id);
	
	//삭제
	public void deleteMember(String num);
	
	//num값 넘겨주기
	public MemberDto getDataByNum(String num);
	
	//회원사진만 변경
	public void updatePhoto(Map<String, String> map);
}
