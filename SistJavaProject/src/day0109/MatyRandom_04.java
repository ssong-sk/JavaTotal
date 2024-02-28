package day0109;

public class MatyRandom_04 {

	public static void main(String[] args) {
		// 자바에서 랜덤수(난수)를 구하는 방법
		//1. Math.random() 메서드를 이용하는 방법 //new 굳이 생성하지 않아도됨. //실수타입
		//2. Random 이라는 클래스를 이용 //new로 생성을 해서 사용해야함.

		System.out.println("기본 램덤수 5개 발생");

		for(int i = 1; i <= 5; i++) {
			double a = Math.random(); //반환값은 double 임 / 0.0****~0.9****->절대 1이 될수 없는 실수
			System.out.println(a); //재생을 누르면 계속 랜덤 5개가 출력이 됨.
		}
		System.out.println("==========================================");

		System.out.println("0~9 사이의 랜덤수 5개 발생");

		for(int i = 1; i <= 5; i++) {
			int a = (int)(Math.random()*10); // 형을 변환하여 int로 변환한 다음 //값을 보기 위해서 10을 곱한것
			System.out.println(a);	
		}

		System.out.println("==========================================");

		System.out.println("0~99 사이의 랜덤수 5개 발생"); //100은 절대로 나올 수 없는 랜덤

		for(int i = 1; i <= 5; i++) {
			int a = (int)(Math.random()*100); // 형을 변환하여 int로 변환한 다음 //99까지 구하려면 100을 곱해주면됨
			System.out.println(a);	
		}

		System.out.println("==========================================");

		System.out.println("1~10 사이의 랜덤수 5개 발생"); 

		for(int i = 1; i <= 5; i++) {
			int a = (int)(Math.random()*10)+1; //뒤에 더하기1을 해주면 10까지 추출이 됨. (가장 많이 사용하는 공식)
			                                   //어떤 사이의 값까지 구하고싶으면 예로 10넣은 자리에 50, 100, 200 설정해주면됨.
			System.out.println(a);
		}
		
		System.out.println("==========================================");

		System.out.println("1~100 사이의 랜덤수 5개 발생"); 

		for(int i = 1; i <= 5; i++) { // 5번을 반복해서 랜덤수 발생
			int a = (int)(Math.random()*100)+1; //1~100 // int를 붙여준 이유는 random은 태생이 더블이기 떄문에 변환해줘야함.
			System.out.println(a);
		}
	}

}
