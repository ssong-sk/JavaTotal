package day0111;

class Apple {
	public Apple() {
		System.out.println("Apple__디폴트 생성자");

	}

}

class Banana {

	public Banana(String str) {
		System.out.println("생성자 호출 : " + str);
	}

}

class Orange {

	// 생성자 오버로딩 (생성자, 메서드명이 같게 생성 / 인자값은 달라야 오류가 발생하지 않음)
	public Orange() {
		System.out.println("Orange의 디폴트 생성자 호출");

	}

	public Orange(String str) {
		System.out.println("Orange의 2번쨰 생성자 : " + str);

	}

	public Orange(int n) {
		this(); // 이름이 똑같은 생성자를 가지고 오려면 동일하게 가져오고, 인자가 있는 생성자에서 기본생성자 호출
		// this는 반드시 첫줄에 입력을 해야함.
		System.out.println("Orange의 3번쨰 생성자 : " + n);

	}
}

public class ConstTest_02 {

	public static void main(String[] args) {

		Apple apple = new Apple(); // 디폴트 생성자는 생성만 하는것.
		Banana banana = new Banana("바나나"); // str 값을 지정해줘야 생성이 되므로 바나나 입력
		Orange orange1 = new Orange(); // 디폴트 생성자
		Orange orange2 = new Orange("오렌지"); // 인자값이 있으면 인자까지 생성해주는것
		Orange orange3 = new Orange(22); // this()값을 입력해줘야하기 떄문에 입력. int이므로 정수 입력

		// 객체지향 _ 하나하나씩 만들어놓고 메서드를 형성하여 필요한것을 가져와서 사용하는것이 목적
		// 생성자는 new에다가 생성해서 만든것이라고 간단하게 생각.

	}

}
