package day0112;

//부모클래스  
//컬러가 부모, 색깔이 자식
class Color {

	public void hello() {
		System.out.println("안녕하세요~~~~");
	}

}
////////////////////////////////

class Red extends Color {
	public void process() {
		System.out.println("나의 차는 빨간색이야");
	}

}

///////////////////////////////

class Green extends Color {
	public void process() {
		System.out.println("나의 차는 초록색이야");
	}
}

////////////////////////////////

class Blue extends Color {
	public void process() {
		System.out.println("나의 차는 파란색이야");
	}
}

////////////////////////////////
class Pink extends Color {
	public void process() {
		System.out.println("나의 차는 분홍색이야");
	}
}

/////////////////////
public class Inherit_09 {

	public static void main(String[] args) {
		// 자식클래스 extends 부모 / 자식클래스로 4개 선언
		// 변수는 4개로 됨(자식이 4개)
		// 현재 선언은 자식클래스, 생성도 자식클래스
		System.out.println("1.Red로 선언하고 Red로 생성한 경우");
		Red red = new Red();
		red.hello();
		red.process();

		System.out.println("2.Green으로 선언하고 Green으로 생성한 경우");
		Green green = new Green();
		green.hello();
		green.process();

		System.out.println("3.Blue로 선언하고 Blue으로 생성한 경우");
		Blue blue = new Blue();
		blue.hello();
		blue.process();

		System.out.println("4.Pink로 선언하고 Pink으로 생성한 경우");
		Pink pink = new Pink();
		pink.hello();
		pink.process();

		// 여러개의 자식이 있는경우 부모로 선언하고 자식클래스로 생성만 해줌.
		// 부모가 가지고 있는 메소드 호출 가능
		// 메서드가 오버라이드 된경우 호출 가능
		// 부모한텐 없고 자식만 갖고 있는 경우는 메서드 호출 안됨!!!!
		
		Color color;
		color = new Red();
		
		color.hello();
		//color.process(); 호출안됨. 부모한테는 프로세스가 없고 자식만 가지고 있기 때문에 에러가 뜸.

	}

}
