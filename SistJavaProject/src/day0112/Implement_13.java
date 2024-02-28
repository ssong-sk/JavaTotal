package day0112;
/*인터페이스는 상수 또는 추상메서드 에서만 사용가능
 * 클래스가 인터페이스를 구현해서 가져올떄는 implement 또 임플리먼트는 상속을 받아서 사용
 * 클래스가 인터페이스를 구현하지만, 인터페이스가 인터페이스를 상속해서 사용하지 않음 (extends)
 * 클래스가 인터페이스를 가져오면 다중 구현이 가능함.
 * 
 */

//interface는 상수와 추상 메서드만 가질 수 있다.
//class가 class는 : extends (상속)
//class가 interface를 : implement 
//interface가 interface를 : extends

interface FoodShop {

	String SHOPNAME = "남소관"; // 인터페이스에서 상수는 당연하게 생각하기 떄문에 파이널을 안넣어도 됨.

	public void order(); // 인터페이스에서는 abstrack 생략해서 사용해도 됨 (넣어도 오류는 아니지만 기본 public사용)

	public void bedal(); // 구현은 하면은 추상메서드가 아니기 떄문에 세미콜론으로 끝낸다. /오더와 배달은 추상메서드

}

/////////////////////

class Food2 implements FoodShop {

	@Override
	public void order() {
		// TODO Auto-generated method stub
		// SHOPNAME = "왕돈가스"; //상수만 들어갈 수 있으므로 파이널을 생략하더라도 상수로 인식되기 때문에 변경이 안됨.
		System.out.println("음식을 주문합니다.");
	}

	@Override
	public void bedal() {
		// TODO Auto-generated method stub
		System.out.println("음식을 배달합니다.");

	}

}

//////////////////////
class Food3 implements FoodShop {

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("키오스크 주문");

	}

	@Override
	public void bedal() {
		// TODO Auto-generated method stub
		System.out.println("쿠팡이츠 배달");

	}

}

public class Implement_13 {

	public static void main(String[] args) {
		// 다형성으로 출력하기....!!
		
		FoodShop fs;
		
		fs = new Food2();
		fs.order();
		fs.bedal();
		
		fs = new Food3();
		fs.order();
		fs.bedal();

	}

}
