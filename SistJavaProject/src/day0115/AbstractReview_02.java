package day0115;

abstract class Game {
	abstract public void play(); //abstract랑 일반이랑 같은 기능
	abstract public void stop(); 
}
/////////////////////////////////
class Kim extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("kim 게임시작");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("kim 게임중지");
	}
	
	
}

//////////////////////////////////////
class Lee extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("lee 게임시작");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("lee 게임중지");
	}
	
}
/////////////////////////////////////
class Choi extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("choi 게임시작");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("choi 게임중지");
	}
	
}

//////////////////////////////////////
public class AbstractReview_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Game game = null;
		game = new Kim();
		game.play();
		game.stop();
		
		game = new Lee();
		game.play();
		game.stop();

		game = new Choi();
		game.play();
		game.stop();*/
		
		//배열
		
		Game [] game = new Game[3];
		game [0] = new Kim();
		game [1] = new Lee();
		game [2] = new Choi();
		
		for(int i = 0; i <game.length; i++) {
			game[i].play();
		}
		System.out.println("===========================");
		
		
		//역순계산
		for(int i = game.length-1; i >= 0; i--) {
			game[i].stop();
		}
	}

}
