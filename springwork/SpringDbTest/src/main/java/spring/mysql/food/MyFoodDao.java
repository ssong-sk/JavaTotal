package spring.mysql.food;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyFoodDao implements MyFoodDaointer {

	@Autowired //sql문에있는 메서드를 가져다가 쓸 수있음 -> 자동으로 완성
	private SqlSession session;
	
	@Override
	public List<MyFoodDto> getAllList() {
		// TODO Auto-generated method stub
		return session.selectList("getAllMyFood");
	}

}
