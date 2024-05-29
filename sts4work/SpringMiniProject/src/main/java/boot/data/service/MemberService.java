package boot.data.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.data.dto.MemberDto;
import boot.data.mapper.MemberMapperInter;

@Service
public class MemberService implements MemberServiceInter {

	@Autowired
	MemberMapperInter mapperInter;
	
	//insert
	@Override
	public void insertMember(MemberDto dto) {
		// TODO Auto-generated method stub
		
		mapperInter.insertMember(dto);
	}

	//list
	@Override
	public List<MemberDto> getAllMembers() {
		// TODO Auto-generated method stub
		return mapperInter.getAllMembers();
	}

	//id 찾기
	@Override
	public int getSerchId(String id) {
		// TODO Auto-generated method stub
		return mapperInter.getSerchId(id);
	}

	//id 넘기기
	@Override
	public String getName(String id) {
		// TODO Auto-generated method stub
		return mapperInter.getName(id);
	}

	//id 및 pass 체크(로그인)
	@Override
	public int loginIdPassCheck(String id, String pass) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		map.put("id", id);
		map.put("pass", pass);
		
		return mapperInter.loginIdPassCheck(map);
	}

	//id 정보에 따라 데이터 넘기기(로그인)
	@Override
	public MemberDto getDataById(String id) {
		// TODO Auto-generated method stub
		return mapperInter.getDataById(id);
	}

	//삭제
	@Override
	public void deleteMember(String num) {
		// TODO Auto-generated method stub
		
		mapperInter.deleteMember(num);
	}

	//num 넘기기
	@Override
	public MemberDto getDataByNum(String num) {
		// TODO Auto-generated method stub
		return mapperInter.getDataByNum(num);
	}

	@Override
	public void updatePhoto(String num, String photo) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		map.put("num", num);
		map.put("photo", photo);
		
		mapperInter.updatePhoto(map);
	}

}
