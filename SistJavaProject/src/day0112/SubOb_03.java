package day0112;

public class SubOb_03 extends SuperOb_03{ //extends 입력후 부모 클래스 명칭 가져오기.
	
	
	String addr;
	public SubOb_03(String name, int age, String addr) { //부모상속에다가 자녀 매게변수도 입력.)
		super(name, age);
		// 부모 생성을 호출해서 반드시 가져와서 사용해야한다. super 디폴트 값이 숨겨져 있음.
		this.addr = addr; //명시적 생성자는 부모 생성자를 가지고 온 것에 밑에다가 써줘야함.
	}

	public SubOb_03( ) {
	
	}
	
	public void writeData( ) {
		System.out.println("이름 " + this.name);
		System.out.println("나이 " + this.age);
		System.out.println("주소 " + this.addr);
	}

}
