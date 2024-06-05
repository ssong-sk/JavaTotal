package boot.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.IpgoDto;
import boot.data.dto.SmartDto;

@Mapper
public interface SmartMapperInter {

	    //갯수구하기 
		public int getTotalCount(); //메서드명이 sql의 id가 된다
		
		//insert
		public void insertSmart(SmartDto dto);
		
		//list
		public List<SmartDto> getAllDatas();
		
		//num 가져오기
		public SmartDto getData(String num);

		//update
		public void updateSmart(SmartDto dto);
	
}
