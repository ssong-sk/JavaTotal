package day0109;

import java.util.Scanner;

public class QuizFor_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//quiz1();
		//quiz2();
		quiz3();
	}

	public static void quiz1() {
		/*
		 * Q.팩토리얼 구할 숫자를 입력하여 해당숫자에 대한 팩토리얼 구하기
		 * 
		 * 팩토리얼 구할 숫자 입력
		 * 3
		 * 3! = 6 등으로 3줄나오기
		 */

		//팩토리얼 구하는공식 *=

		Scanner in = new Scanner(System.in);

		int num = 0;
		int tot = 1;

		for (int j = 1; j <= 3; j++) { // 반복 3번 무조건
			System.out.println("숫자를 입력하세요"); // 무조건3번 입력란이 뜸
			num = in.nextInt();
			// 1 : 5입력 
			// 2 : 3
			// 3 : 4
			for (int i = 1; i <= num; i++) { // 1일부터 입력한 값까지 계산 ( 팩토리얼)
				// 1 : 1*1 = 1
				// 2 : 1*2 = 2
				// 3 : 2*3 = 6
				// 4 : 6*4 = 24
				// 5 : 24 * 5 = 120 = tot 
				tot *= i; // 입력한 값만큼 반복이 돌려서 값곱해줌

			}
			// 1 : 120 
			// 2 : 6
			// 3 : 24
			System.out.println(num + "!" + "=" + tot);

			tot = 1; //다시 초깃값으로 for문이 시작되어야 하기 떄문에 총 합을 다시 1로 지정

		}

	}

	public static void quiz2() {

		/*
		 * Q. 두 수 x,y를 입력 후 x의 y승 _ for 문을 이용해서 구하시오 (x를 y횟수만큼 곱하는것)
		 * 
		 * 두수 입력
		 * 3 3
		 * 3의 3승은 27입니다.
		 */

		Scanner in = new Scanner(System.in);

		int x, y;
		int sum = 1; //*는 0으로 하면 안되고 1부터 시작!!!!!!!!!!

		System.out.println("x값 입력 : "); // 한번만 돌리는 것이기 때문에 for문 시작전에 입력 / 여러번 입력값을 반복해야한다면 반복문 안에 입력
		x = in.nextInt();
		System.out.println("y값 입력 : ");
		y = in.nextInt();

		for (int i = 1; i <= y; i++) {
			sum *= x; //자기 자신을 계속 곱해줌

		}
		System.out.println(x + "의 " + y + "승은 " + sum + "입니다");

	}

	public static void quiz3() {

		/*
		 * Q. 1~100까지의 숫자를 짝수의 합과 홀수의 합을 구해서 출력해주세요.
		 */

		int sum1 = 0; //짝수합 변수
		int sum2 = 0; //홀수합 변수
		
		for(int i = 1; i <= 100; i++) { //1~100까지 범위에서 반복을 해야함, 
			
			if(i % 2 == 0) { //짝수 조건을 찾는 if문
				sum1 += i; 
			} 
			else if (i % 2 != 0) { //홀수 조건을 찾는 if문
				sum2 += i;
			} 	
		} 
		System.out.println("1~100 사이의 짝수 합은 : " + sum1);
		System.out.println("1~100 사이의 홀수 합은 : " + sum2);
	}
}
