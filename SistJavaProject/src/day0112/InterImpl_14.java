package day0112;

interface InterA {

	public void sigasong();

	public void draw();

}
//////////////////////////

interface InterB {
	public void playgame();

	public void write();

}

/////////////////////
class Implei implements InterA, InterB { // 임플리로 인포페이스를 가지고와서 사용.

	@Override
	public void playgame() {
		// TODO Auto-generated method stub
		System.out.println("게임하기");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("공부하기");
	}

	@Override
	public void sigasong() {
		// TODO Auto-generated method stub
		System.out.println("게임하기");

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("그림그리기");

	}

}

//////////////////////////
public class InterImpl_14 {

	public static void main(String[] args) {
		// 다형성 생성

		Implei im = new Implei();
		im.sigasong();
		im.draw();
		im.write();
		im.playgame();
		
		
	}

}
