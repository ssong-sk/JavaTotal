package day0110;

class Info {

	// worker mathod를 이용해서 사용하는것을 캡슐화라고 한다 (get과 set)
	// 인스턴스 변수
	private String stuName;
	private int stuAge;

	// setter메서드
	// 1. 데이터 수정을 할 목적 - set변수명
	// 2. 저장용도이므로 결과값 return 값이 없다
	// 3. return 값이 없으므로 void라고 지정해야 한다.

	public void setName(String stuName) {
		this.stuName = stuName; // 이름이 다를경우엔 this 생략 가능 (인스턴스변수와 인자값이 다를경우)
								// 이름이 같을경우에는 this (인스턴스변수와 인자값이 같은경우)

	}

	public void setAge(int stuAge) {
		this.stuAge = stuAge;
	}

	// getter메서드
	// 1. 데이터를 조회할 목적(출력할 목적) _ get변수명
	// 2. 데이터를 얻는 목적이므로 인자값이 없다
	// 3. 실행결과값을 돌려주므로 "return 결과값"으로 지정

	public String getName() { // 인자값이 없음.
		return stuName;
	}

	public int getAge() { // 인자값이 없음.
		return stuAge;
	}

}

public class WorkerMethod_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Info in1 = new Info();
		// in1.stuName = "홍길동"; 인스턴스 변수에 private이 붙으면 변수 접근이 안된다.(생성을 하더라도)
		// in1.stuAge = 33;
		// private를 입력해서 메서드를 입력한것을 캡슐화
		
		//setter 메서드를 이용해서 값 수정
		in1.setName("최민영");
		in1.setAge(22);
		
		//getter 메서드를 이용해서 값 얻기
		String name = in1.getName(); //스트링 변수를 줘서 만들 수있음
		int age = in1.getAge();
		
		System.out.println(name + ", " + age); //setter메서드의 값을 불러와서 getter메서드로 출력
		

	}

}
