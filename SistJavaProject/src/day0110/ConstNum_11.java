package day0110;

//생성자(Constructor) : 객체 생성시 자동호출되는 메서드
//1. 일반메서드와 차이점 : 리턴형이없다
//2.반드시 클래스명과 같다.
//3. 오버로딩(Overloding)이 가능하다 _ 메서드 이름이 같지만 매게변수나 타입이 다른것
//오버로딩은 여러개의 생성자 만들 수 있다.
//4. 생성자가 없을 경우 기본생성자로 생성 가능
//5. 멤버값들이 주로 초기화를 담당

class Numb {

	int num; // 0

	// 디폴트 생성자
	public Numb() { // 디폴트 생성자는 필요하면 만들어줘야함.
		System.out.println("디폴트 생성자 호출");

	}

	// 인자있는 생성자 만들기(변수타입 매개변수)
	public Numb(int num) {
		this.num = num; // 인스턴스 자기자신을 의미하는 레퍼런스변수인 this (나자신)
		System.out.println("인자있는 생성자 호출");

	}

	// 메서드
	public int getNumber() { //출력문은 get을 가져와서 사용, set은 내보내서 사용
		num = 50;
		return num;
	}
}

public class ConstNum_11 { // 처음 지정한 클래스명은 public을 지우고 다른 클래스를 만들 수 없음
							// public은 클래스 1곳에서만 사용가능(맨 처음 만든 클래스에)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numb n1 = new Numb();

		Numb n2 = new Numb(30);
		System.out.println(n2.num);

		Numb n3 = new Numb();
		System.out.println(n3.getNumber());
	}

}
