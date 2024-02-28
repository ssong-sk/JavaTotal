package day0109;

import java.util.Random;

public class RandomClass_05 {

	public static void main(String[] args) {
		// 2번째 방법 random이라는 클래스를 이용

		Random r = new Random(); //import해주고 랜덤을 생성해서 사용해야함. -> 랜덤에 있는 메서드를 활용하기 위해서 사용 // 객체선언 

		System.out.println("0~9사이의 난수 5개 발생");

		for(int i = 1; i <= 5 ; i++) {
			int a = r.nextInt(10); //r이라는 참조변수를 이용해서 사용한다는 뜻. ->반환값은 Int임 //0~9
			System.out.println(a);
		}

		System.out.println("=========================================");

		System.out.println("0~99사이의 난수 5개 발생");

		for(int i = 1; i <= 5 ; i++) {
			int a = r.nextInt(100); //0~99
			System.out.println(a);
		}

		System.out.println("=========================================");

		System.out.println("1~10사이의 난수 5개 발생");

		for(int i = 1; i <= 5 ; i++) {
			int a = r.nextInt(10)+1; //1~10 //10까지 하려면 1을 더해주면 됨.
			//(10)만 입력할 경우 0~9 (10)+1 일경우 1~10범위!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			System.out.println(a);
		}

		System.out.println("=========================================");

		System.out.println("65~90사이의 난수 5개 발생");

		for(int i = 1; i <= 5 ; i++) {
			int a = r.nextInt(26)+65; //90에서 65를 뺴주면 25이고, 1을 더해서 26을 입력해줘야함. 65가 시작지점임.
			//시작지점은 +**임.
			System.out.println(a);
		}

		System.out.println("=========================================");

		System.out.println("65~90사이의 난수 5개 발생");

		for(int i = 1; i <= 5 ; i++) {
			int a = r.nextInt(26)+65; 
			System.out.println((char)a); //아스키코드로 출력됨. 앞에 타입을 대입하면 됨.
		}
		System.out.println("=========================================");
	}

}
