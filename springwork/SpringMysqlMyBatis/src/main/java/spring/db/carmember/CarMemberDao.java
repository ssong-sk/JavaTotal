package spring.db.carmember;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarMemberDao implements CarMemberDaoInter {
	
	@Autowired
	private SqlSession sesstion;

	//insert
	@Override
	public void insertMember(CarMemberDto dto) {
		// TODO Auto-generated method stub
		sesstion.insert("insertCarMember", dto);
	}

	//��ü����Ʈ ���
	@Override
	public List<CarMemberDto> getAllDatas() {
		// TODO Auto-generated method stub
		return sesstion.selectList("allDataCarMember");
	}

	//����
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return sesstion.selectOne("totalCountMember");
	}

	//num�� �ѱ�� -> ������
	@Override
	public CarMemberDto getOneData(String num) {
		// TODO Auto-generated method stub
		return sesstion.selectOne("selectOneOfCarMemeber", num);
	}
	
    //�����ϱ�
	@Override
	public void updateCarMember(CarMemberDto dto) {
		// TODO Auto-generated method stub
		sesstion.update("updateOfCarMember", dto);
	}
    
	//����
	@Override
	public void deleteMember(String num) {
		// TODO Auto-generated method stub
		sesstion.delete("deleteOfCarMember", num);
	}

}