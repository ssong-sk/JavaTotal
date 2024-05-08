package spring.db.may;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SpringCarDao implements SpringCarDaoInter {

	@Autowired
	private SqlSession session;
	
	
	//갯수
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("totalCountOfCar");
	}
	
    //insert
	@Override
	public void insertCar(SpringCarDto dto) {
		// TODO Auto-generated method stub
		session.insert("insertOfMyCar", dto);
	}

	//천제조회
	@Override
	public List<SpringCarDto> getAllCarDatas() {
		// TODO Auto-generated method stub
		return session.selectList("getAllOfMyCar");
	}

	//num값 가져오기 -> updateform 나오게 하기
	@Override
	public SpringCarDto getData(String num) {
		// TODO Auto-generated method stub
		return session.selectOne("selectONeOfCar", num);
	}

	//수정하기
	@Override
	public void updateMyCar(SpringCarDto dto) {
		// TODO Auto-generated method stub
		session.update("updateOfCar", dto);
	}

	//삭제하기
	@Override
	public SpringCarDto deleteCar(String num) {
		// TODO Auto-generated method stub
		return session.selectOne("deleteOfCar", num);
	}

	

	

}
