package day0109;

public class ForStar_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**다중 for문으로 star(*) 출력하기**");

		for(int i = 1; i <= 5; i++) { //행갯수

			for(int j = 1; j <=5; j++) {//열갯수
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("========================");

		//삼각형
		for(int i = 1; i <= 5; i++) { //행갯수

			for(int j = 1; j <= i; j++) { //열갯수 (i값 만큼만 반복)
				System.out.print("*");
			}System.out.println();
		} System.out.println();

		System.out.println("========================");
		//d역삼각형
		for(int i = 1; i <= 5; i++) { //행갯수

			for(int j = i; j <= 5; j++) { //열갯수 (i값 1일때 5번, i가 2일떄 4번....5일떄 1번)
				System.out.print("*");
			}System.out.println();
		} System.out.println();
	}

}
