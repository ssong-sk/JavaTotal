package day0115;

import day0112.InterImpl_14;

interface InterAA { //상수, 추상메서드만 가능

	public void play();

}

///////////////////////////////
interface InterBB { //BB 가 AA를 받음 

	public void draw();
}
	/////////////////////////////
	class InterImple_01 implements InterAA, InterBB { //오버라이드 

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("나는 그림을 그린다");
		}

		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("나는 게임을 한다");
		}

	}

	////////////////////////////////
public class InheritReview_01 { //전역변수는 자동초기화 

	public static void main(String[] args) { //지역변수는 자동초기화가 되지 않음.
		// TODO Auto-generated method stub
		
		InterImple_01 imp1 = new InterImple_01();
		imp1.draw();
		imp1.play();
		
		System.out.println("**다형성으로 출력**");
		InterAA aa = new InterImple_01();
		aa.play();
		
		InterBB bb = new InterImple_01();
		bb.draw();
				

	}
}


