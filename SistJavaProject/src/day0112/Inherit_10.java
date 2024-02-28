package day0112;

class Work { // 부모클래스
	
	public void goodmorning() {
		System.out.println("안녕하세요~~~~!");
	}
	public void process() {
		System.out.println("아무것도 안하고 있음!!!");
	}
}

////////////////// 자식클래스 3개 생성
//부모가 가지고 있는 프로세스를 오버라이드를 해서 자식에 쓰임.
class Food1 extends Work {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("***음식담당****");
	}
}

////////////////////
class Clean extends Work {
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("***청소담당***");
	}
}
///////////////////////

class Sing extends Work {
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("***노래담당***");
	}
}

/////////////////////
public class Inherit_10 {

	public static void main(String[] args) {
		// 다형성
		// 부모 클래스로 선언하고 자식 클래스로 생성하는 경우를 다형성이라고 함!
		// 하나의 변수를 가지고 작업을 할떄 사용 
		
		Work work = null; //선언
		
		work = new Food1();
		work.goodmorning();
		work.process();
		System.out.println();
		
		work = new Clean();
		work.goodmorning();
		work.process();
		System.out.println();
		
		work = new Sing();
		work.goodmorning();
		work.process();
		System.out.println();
		

	}

}
