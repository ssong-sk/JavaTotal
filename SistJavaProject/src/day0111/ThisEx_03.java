package day0111;

//1. this : 객체 생성 후 메모리에 생성된 자기자신의 인스턴스를 의미
//인스턴스 변수와 지역변수(로컬변수)명이 동일한 경우에 this. 인스턴스변수명
//2. 생성자에서 다른 오버로딩 생성자를 호출하는 경우..this(); 값이 있으면 쓰고 없으면 쓰지않고 반드시 생성자의 첫라인에 입력!
class Test {

	private String name;
	private int grade;

	// 생성자(명시적 생성자)

	public Test(String name) {
		this(name, 4); // 현재 나는 name만 있고 밑에 있는 생성자의 인자값을 불러와서 사용 가능하다.
		// 4라는 grade 초기값을 호출해서 입력 가능 하다.
		//생성자에서 다른 생성자를 호출할떄도 this로 사용하고 여러개 사용 가능하다.
	}

	public Test(String name, int grade) {
		this.name = name;
		this.grade = grade;

	}

	// getter 메서드
	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

}

public class ThisEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test("홍길동"); //setter을 해주지 않았어도 this로 생성자를 수정하게끔 만들어줘서 사용 가능
		System.out.println("이름은 : " + t1.getName() + "이고, 학년은 : " + t1.getGrade() + "학년입니다");
		

	}

}
