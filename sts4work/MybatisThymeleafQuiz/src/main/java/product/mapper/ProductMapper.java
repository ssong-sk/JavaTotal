package product.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import product.dto.ProductDto;

@Mapper
public interface ProductMapper {
	
	//갯수
	public int getTotalCount();
	
	//insert
	public void insertProduct(ProductDto dto);
	
	//list (쿼리로 sql작성 -> myshopSql 작성하지 않아도됨...)
	@Select("select * from product order by pro_num desc")
	public List<ProductDto> getAllProduct();

	// detail -> num 넘기기
	@Select("select * from product where pro_num=#{pro_num}")
	public ProductDto getData(int num);

}
