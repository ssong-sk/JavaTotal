package mycar.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import mycar.data.MyCarDto;

@Repository
@AllArgsConstructor //모든 생성자값 그대로 가져오기
public class MyCarDao {

	MyCarDaoInter daoInter;
	
	//db저장
	public void insertMyCar(MyCarDto dto) {
		
		daoInter.save(dto);
	}
	
	//전체출력
	public List<MyCarDto> getAllCars() {
		
		//return daoInter.findAll();  //전체출력
		return daoInter.findAll(Sort.by(Sort.Direction.DESC, "carprice")); //가격 비싼것 부터 출력
	}
	
	//num
	public MyCarDto getData(Long num) {
		
		return daoInter.getReferenceById(num);
	}
	
	//삭제
	public void deleteMyCar(Long num) {
		
		daoInter.deleteById(num);
	}
	
	//수정
	public void updateMyCar(MyCarDto dto) {
		
		daoInter.save(dto);
	}
}
