package boot.data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import boot.data.dto.IpgoDto;

@Mapper
public interface IpgoMapperInter {
	
	//갯수구하기 
	public int getTotalCount(); //메서드명이 sql의 id가 된다
	
	//insert
	public void insertIpgo(IpgoDto dto);
	
	//list
	public List<IpgoDto> getAllDatas();

}
