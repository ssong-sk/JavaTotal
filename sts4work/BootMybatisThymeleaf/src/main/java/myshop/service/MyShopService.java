package myshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import myshop.dto.ShopDto;
import myshop.mapper.MyShopMapper;

@Service
@AllArgsConstructor
public class MyShopService {

	private final MyShopMapper shopMapper;
	
	//갯수
	public int getTotalCount() {
		
		return shopMapper.getTotalCount();
	}
	
	//insert
	public void insertShop(ShopDto dto) {
		
		shopMapper.insertShop(dto);
	}
	
	//list
	public List<ShopDto> getAllSangpums() {
		
		return shopMapper.getAllSangpums();
	}
	
	//num
	public ShopDto getData(int num) {
		
		return shopMapper.getData(num);
	}
	
	//delete
	public void deleteShop(ShopDto dto) {
		
		shopMapper.deleteShop(dto);
	}
}
