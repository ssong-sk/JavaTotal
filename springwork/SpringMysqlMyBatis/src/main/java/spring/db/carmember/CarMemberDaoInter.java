package spring.db.carmember;

import java.util.List;

public interface CarMemberDaoInter {
	
	//insert
	public void insertMember(CarMemberDto dto);
	
	//��ü��ȸ
	public List<CarMemberDto> getAllDatas();
	
	//�߻�޼��� �����
    public int getTotalCount ();

}
