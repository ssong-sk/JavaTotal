package spring.db.member;

import java.util.List;

public interface MemberDaoInter {
	
	//id üũ�ϱ�
	public int getIdCheck(String id);
	
	//insert
	public void insertMember(MemberDto dto);
	
	//��ü list ���
	public List<MemberDto> getAllDatas();
	
	//num �������� (����)
	public MemberDto getOneData(String num);
	
	//�߻�޼��� �����
    public int getTotalCount();

}
