package spring.db.may;

import java.util.List;

public interface SpringCarDaoInter {
	
	//�߻�޼��� �����
	public int getTotalCount ();
	
	//insert
	public void insertCar(SpringCarDto dto);
	
	//��ü ��ȸ
	public List<SpringCarDto> getAllCarDatas();
	
	//num �� �������� -> updateform ��������
	public SpringCarDto getData(String num);
	
	//�����ϱ�
	public void updateMyCar(SpringCarDto dto);
	
	//�����ϱ�
	public SpringCarDto deleteCar(String num);

}
