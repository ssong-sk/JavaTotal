package boot.guest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boot.guest.dto.GuestDto;

@Mapper
public interface GuestMapper {
	
	//count 갯수
	public int getTotalCount();
	
	//insert
	public void insertGuest(GuestDto dto);
	
	//select 전체출력
	public List<GuestDto> getAllDatas();
	
	//pass 비교
	public int isEqualPassCheck(int num, String pass);
	
	//delete
	public void deleteGuest(int num);

}
