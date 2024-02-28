package day0116;


//익명 내부클래스 : 클래스 선언과 객체생성을 동시에 하는 이름 없는 클래스(일회용으로 사용할 때 제일 많이 사용 / 가볍기 때문 -> 용량차지비율이 낮음)
//이벤트 발생 시 생성을 했다가 끝나면 메모리에서 제거 _ 메모리 효율적 관리가 쉽다.

abstract class AbstEx {
	
	abstract public void draw();
		
	
}
//////////////////////////////////////
class OuterEx {
	
	AbstEx ab = new AbstEx() { //anony를 누르면 자체적으로 클래스 선언 및 객체까지 생성해줌,,, 오버라이드 자동 완성
		
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("익명 내부 클래스");
			
		}
	};
	
	
}
////////////////////////////////////////
public class Anonymous_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterEx ex = new OuterEx(); //명칭이 정해지지 않았기 때문에 
		ex.ab.draw(); //ab.을해 줘야 draw 접근이 가능하다.
	}

}
