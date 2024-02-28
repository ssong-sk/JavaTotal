package j0116;

class Outer {
	
	String name = "강동원";
	int age = 35;
	
	//member 내부1
	class Inner1 { //내부클래스에서는 외부 클래스의 멤버 변수 사용가능
		public void disp() {
			System.out.println("**Inner1 내부클래스**");
			System.out.println("이름 : " + name + ", 나이 : " + age);
		}
	}
	///////////////////////////
	//member 내부2
	class Inner2 {
		public void disp2() {
			System.out.println("**Inner2 내부클래스**");
			System.out.println("이름 : " + name + ", 나이 : " + age);
		}
	}
	
	//외부클래스 메서드
	public void write() {
		Inner1 in1 = new Inner1();
		in1.disp();
		
		Inner2 in2 = new Inner2();
		in2.disp2();
	}
}
///////////////////////////////////////////
public class InnerObj_08 { //0116_05

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer out = new Outer();
		out.write();
		
		System.out.println("-----------------------------");
		System.out.println("개별적으로 내부 클래스 추출");
		System.out.println();
		
		//내부 클래스 추출
		Outer.Inner1 in1 = new Outer().new Inner1();
		in1.disp();
		
		Outer.Inner2 in2 = new Outer().new Inner2();
		in2.disp2();

	}

}
