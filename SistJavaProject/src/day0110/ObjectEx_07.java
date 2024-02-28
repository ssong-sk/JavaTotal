package day0110;

public class ObjectEx_07 {

	// 멤버변수
	String name; // 인스턴스변수 (앞에 static이라는 변수가 없으면 인스턴스변수) /인스턴스변수는 반드시 생성을 한 후 쓸수있음
					// static은 무조건 써줘야함.
	static final String MESSAGE = "Happy day"; // MESSAGE는 대문자로 쓴 경우 상수라고 하면 됨. static 멤버변수 또는 클래스 멤버변수
	// final을 쓰면 상수는 아예 수정이 안됨.
	// 객체 생성 없이 바로 클래스 명으로 접근 가능

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("static 멤버 변수는 new 생성없이 호출 가능하다");
		System.out.println(MESSAGE); // 다른 클래스에서는 클래스명.변수명으로 가져와야 사용 가능하다.
										// ex ObjectEx_07.MESSAGE 입력해야 가져올수 있음.
		// MESSAGE = "Nice day!!!"; final이라 값 변경 안됨 / final을 안쓰면 변경은 가능

		// 인스턴스 변수는 객체 생성
		ObjectEx_07 ob7 = new ObjectEx_07();
		System.out.println(ob7.name); // 초기값안넣어도 자동으로 초기값이 입력되어 있음.
										// classs에서 변수는 자동초기화(0, null, false....)
		ob7.name = "홍길동";

		System.out.println(ob7.name);
		
		ObjectEx_07 ob8 = new ObjectEx_07(); //클래스를 이용해서 객체를 생성해서 계속 출력이 가능함.
		ob8.name = "이효리";
		System.out.println(ob8.name);
		
		
		

	}

}
