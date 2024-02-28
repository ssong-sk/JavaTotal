package day0112;
//abstract를 추상클래스라고 함

//추상클래스는 new로 생성 못함.
//abstract메서드는 abstract 클래스에서만 존재할 수 있다.
//abstract 클래스는 일반메서드 추상메서드 둘 다 포함이 가능하다.

abstract class Fruit {

	public static final String MRSSAGE = "오늘은 추상클래스 배우는날~~~~";

	// 일반메서드
	public void showTilte() {
		System.out.println("일반메서드 입니다.");
	}

	// 추상메서드(미완의 메서드 구현부가 없다.) 오버라이딩 목적
	abstract public void showMessage();
}

///////////////////////
class Apple extends Fruit {
	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println(Fruit.MRSSAGE);
		System.out.println("Apple_MRSSAGE");
	}

}
//////////////////

class Banana extends Fruit {
	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Banana_MRSSAGE");
	}

}

//////////////////

class Orange extends Fruit {
	@Override
	public void showMessage() {
// TODO Auto-generated method stub
		System.out.println("Orange_MRSSAGE");
	}

}

public class Abstract_11 {

	public static void main(String[] args) {
		// 일반생성출력(자식으로 선언, 자식으로 생성)
		Apple apple = new Apple();
		apple.showMessage();
		
		Banana banana = new Banana();
		banana.showMessage();
		
		Orange orange = new Orange();
		orange.showMessage();
		
		
		
		//다형성으로 출력 (부모로선언, 자식으로 생성) _ 장점은 변수가 하나
		//부모클래스명 변수명 = new 자식클래스명
		Fruit fruit;
		
		fruit = new Apple();
		fruit.showMessage();
		fruit.showTilte(); //생성이 안된 앞쪽으로 보내면 생성된 변수가 없기 떄문에 에러가 발생... 
		//생성된 다음 호출을 해야 출력이 가능하다.
		
		fruit = new Banana();
		fruit.showMessage();
		
		fruit = new Orange();
		fruit.showMessage();
		
		
	

	}

}
