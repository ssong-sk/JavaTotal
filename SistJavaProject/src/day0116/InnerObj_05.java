package day0116;

import day0116.OuterObj.ineerObj;

class Outer {
	
	String name = "승경";
	int age = 22;
	
	//member 내부1
	class Inner1 {
		//내부클래스에서 외부 클래스의 멤버 변수 사용 가능하다.
		public void disp() {
			System.out.println("**Inner1 내부클래스**");
			System.out.println("이름 : " + name + ", 나이 : " + age + "세");
		}

	}
	
	//member 내부2
	class Inner2 {
		
		public void disp2() {
			System.out.println("**Inner2 내부클래스**");
			System.out.println("이름 : " + name + ", 나이 : " + age + "세");
			
		}

	}
	//외부클래스 메서드
	public void write() {
		//외부 메서드에서 내부 클래스 선언
		Inner1 in1 = new Inner1();
		in1.disp();
		
		Inner2 in2 = new Inner2();
		in2.disp2();
	}

}

///////////////////////////////
public class InnerObj_05 {

	public static void main(String[] args) {
		// 외부 생성
		
		Outer out = new Outer();
		out.write();
		
		System.out.println("-----------------------------------------");
		System.out.println("개별적으로 내부 클래스 추출");
		System.out.println();
		
		//내부 클래스 내용 추출
		Outer.Inner1 in1 = new Outer().new Inner1();
		in1.disp();
		
		Outer.Inner2 in2 = out.new Inner2();
		in2.disp2();
		
		//******************프로젝트 저장한 곳 들어가서 bin들어가면 $표시 있으면 ineer클래스 사용했다는 뜻으로 표기가 됨!!!!!

	}

}
