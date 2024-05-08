package spring.db.may;

import java.util.List;

public interface SpringCarDaoInter {
	
	//추상메서드 만들기
	public int getTotalCount ();
	
	//insert
	public void insertCar(SpringCarDto dto);
	
	//전체 조회
	public List<SpringCarDto> getAllCarDatas();
	
	//num 값 가져오기 -> updateform 가져오기
	public SpringCarDto getData(String num);
	
	//수정하기
	public void updateMyCar(SpringCarDto dto);
	
	//삭제하기
	public SpringCarDto deleteCar(String num);

}
