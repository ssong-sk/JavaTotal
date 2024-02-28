package day0112;


//부모 클래스에 멤버를 자식 클래스가 선언 없이 사용가능하다.
//private은 같은 패키지여도 상속 못받는다.
//자바는 단일 상속만 가능(1개만 가능하고 그 이상은 불가능하다)
//상속 extends라는 키워드로 표현 
//class 자식 클래스 extends 부모 클래스 / 부모클래스를 상속받아서 자식클래스가 더 커진다.


public class MainOb_03 {  //보이지는 않지만 오브젝트 상속을 받고 있음

	public static void main(String[] args) {
		// 부모보다 자식이 더커짐. 생성을 하려고 한다면 자식을 생성해서 사용해야한다.
		
		SubOb_03 sub = new SubOb_03("김선호", 22, "강남구");
		sub.writeData(); //자식 클래스에 있는 명시적 생성자를 불러와서 출력함.
		//public 을 사용하면 어디에서든 상속 받아서 사용가능하다.

	}

}
