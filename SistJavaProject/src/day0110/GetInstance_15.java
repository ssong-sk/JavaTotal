package day0110;

import java.util.Calendar;

class Test {
	
	private Test() {
		System.out.println("디폴트 생성자");
	}
	
	//생성자 대신 인스턴스를 반환해주는 메서드
	
	public static Test getInstance() { //static을 넣으면 생성을 안해도됨.(정적메서드)
		return new Test();
	}
	
	
	public void writeMessage() { //static으로 생성을 했기 때문에 가져다가 사용 가능.
		System.out.println("안녕~~~~~~~~~~");
	}
}

public class GetInstance_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test t1 = new Test();
		Test t1 = Test.getInstance(); //정적메서드를 만들어서 그안에서 생성을 해서 메서드를 가지고 와서 사용
		t1.writeMessage();

		Calendar cal = Calendar.getInstance(); //누구나 가져가서 사용할 수 있게 만들어 놓음.
		int year = cal.get(cal.YEAR);

		System.out.println(year + "년도");
	}

}
