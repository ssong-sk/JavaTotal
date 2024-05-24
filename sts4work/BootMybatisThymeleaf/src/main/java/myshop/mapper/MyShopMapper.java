package myshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import myshop.dto.ShopDto;

@Mapper //bean 등록하
public interface MyShopMapper {

	//갯수
	public int getTotalCount();
	
	//insert
	public void insertShop(ShopDto dto);
	
	//list (쿼리로 sql작성 -> myshopSql 작성하지 않아도됨...)
	@Select("select * from my_shop order by num desc")
	public List<ShopDto> getAllSangpums();
	
	//detail -> num 넘기기
	@Select("select * from my_shop where num=#{num}")
	public ShopDto getData(int num);
	
	//delete
	@Delete("delete from my_shop where num=#{num}")
	public void deleteShop(ShopDto dto); 
}
