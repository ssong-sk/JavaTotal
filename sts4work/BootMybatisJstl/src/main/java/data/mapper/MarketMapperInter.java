package data.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import data.dto.MarketDto;

@Mapper
public interface MarketMapperInter {

	//갯수
	public int getTotalCount();
	
	//insert
	public void insertMarket(MarketDto dto);
	
	//전체출력
	public List<MarketDto> getAllDatas();
	
	//num
	public MarketDto getData(String num);
	
	//update
	public void updateMarket(MarketDto dto);
	
	//삭제
	public void deleteMarket(String num);
}
