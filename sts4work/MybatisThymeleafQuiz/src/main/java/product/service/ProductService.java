package product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import product.dto.ProductDto;
import product.mapper.ProductMapper;

@Service
@AllArgsConstructor
public class ProductService {
	
	private final ProductMapper promapper;
	
	//갯수
	public int getTotalCount() {
		
		return promapper.getTotalCount();
	}
	
	//insert
	public void insertProduct(ProductDto dto) {
		
		promapper.insertProduct(dto);
	}
	
	//list
	public List<ProductDto> getAllProduct() {
		
		return promapper.getAllProduct();
	}
	
	//num 반환
	public ProductDto getData(int pro_num) {
		
		return promapper.getData(pro_num);
	}

}
