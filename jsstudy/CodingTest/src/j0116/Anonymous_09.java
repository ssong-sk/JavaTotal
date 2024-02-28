package j0116;
//익명클래스는 
//추상클래스는 abstract를 붙여줌!!!

abstract class AbstEx {
	
	abstract public void draw();
}

///////////////////////////////////////

class OuterEx {
	AbstEx ab = new AbstEx() { //오버라이드 자체적으로 자동 생성
		
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("익명 내부 클래스");
		}
	};
}
public class Anonymous_09 { //0116_06

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterEx out = new OuterEx();
		out.ab.draw(); //ab.을 해줘야 draw접근 가능 (오버라이드 접근)

	}

}
