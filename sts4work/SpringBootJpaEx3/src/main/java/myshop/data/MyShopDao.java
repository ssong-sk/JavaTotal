package myshop.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyShopDao {

	@Autowired
	MyShopDaoInter daoInter;
	
	//insert
	public void insertShop(MyShopDto dto) {
		
		daoInter.save(dto); //id타입 유무에 따라서 자동으로 insert, 또는 update
	}
	
	//전체출력
	public List<MyShopDto> getAllSangpums() {
		
		return daoInter.findAll();
	}
	
	//num에 따른dto 값을 가져오기 -> num에 대한 dto 반환 (수정폼)
	public MyShopDto getData(Long num) {
		
		return daoInter.getReferenceById(num);
	}
	
	//수정하기
	public void updateShop(MyShopDto dto) {
		
		daoInter.save(dto); //num이 포함되어있으므로 수정이 됨.
	}

	public void deleteShop(Long num) {
		// TODO Auto-generated method stub
		
		daoInter.deleteById(num);
		
	}
	
}
