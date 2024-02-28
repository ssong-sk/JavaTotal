package j0116;

class OuterObject {
	
	int a = 10; //인스턴스 변수
	static int b = 20; //정적변수
	
	//////////////////////////////
	class InnerObject {
		int c = 30;
		
		public void write() {
			System.out.println("외부 인스턴스 변수 a = " + a);
			System.out.println("외부 정적 변수 b = " + b);
			System.out.println("내부 인스턴스 변수 c = " + c);
		}
	}
	
	static class InnerObject2 {
		int d = 40;
		static int e = 50;
		
		public void write2() {
			//System.out.println("외부 인스턴스 변수 a = " + a); //오류발생, 외부일반변수 접근 안됨.
			System.out.println("외부 정적 변수 b = " + b);
			//System.out.println("내부 인스턴스 변수 c = " + c); //오류발생, 다른 내부클래스에 있는 변수는 접근 안됨.
			System.out.println("내부 일반 변수 d = " + d);
			System.out.println("내부 정적 변수 e = " + e);
			
		}
	}

	
}
//////////////////////////////////////
public class InnerClass_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterObject.InnerObject in1 = new OuterObject().new InnerObject();
		in1.write();
		
		OuterObject.InnerObject2 in2 = new OuterObject.InnerObject2(); //클래스가 static!! 이므로 new 생성 안함!
		in2.write2();

	}


}
