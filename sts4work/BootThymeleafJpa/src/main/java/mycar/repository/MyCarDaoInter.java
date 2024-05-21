package mycar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import mycar.data.MyCarDto;

public interface MyCarDaoInter extends JpaRepository<MyCarDto, Long>{

	//직접 쿼리문 작성 _ 수정메서드
	//자동차명, 가격, 색상만 수정하는 메서드를 작성
	
	@Query(value = "update mycar set carname=:carname, carprice=:carprice, carcolor=:carcolor where num=:num",nativeQuery = true)
	@Modifying //insert, update, delete뿐 아니라  ddl 이라는 구분을 사용할 때 반드시 표기
	@Transactional // update, delete 할 때 표기 해줘야 정상 작동됨
	public void updateMycarNoPhoto(@Param("num") Long num, 
			@Param("carname") String carname, 
			@Param("carprice") int carprice, 
			@Param("carcolor") String carcolor);
		
		
		
	
}
