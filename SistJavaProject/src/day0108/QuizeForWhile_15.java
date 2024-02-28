package day0108;

import java.util.Scanner;

public class QuizeForWhile_15 {

	public static void main(String[] args) {
		// 다른 메서드에 출력을 해도 메인 메서드에 출력이 없으면 출력이 안됨/ 출력은 메인 메서드에서만 가능

		// test1();
		// test2();
		// test3();
		test4();

	}

	public static void test1() {

		// 문제 : 1~100까지의 3의 배수 갯수 구하기

		int n = 0;
		int cnt = 0;

		while (true) {
			n++;

			// 3의 배수이면 cnt변수 1증가
			if (n % 3 == 0)
				cnt++;

			// 이 100이되면 while문 종료
			if (n == 100)
				break;
		}
		System.out.println("3의 배수 갯수 : " + cnt + "개");

	}

	public static void test2() {

		// 1~100까지의 짝수 합 구하기(while(true))

		int n = 0;
		int tot = 0;

		while (true) {

			n++;
			if (n % 2 != 0)
				continue; // 2의 배수가아니면 다음 반복 실행

			tot += n; // 2의 배수이면 tot 변수 입력값 저장

			if (n == 100) // 입력된값이 100이면 반복 종료
				break;

		}
		System.out.println("1~100까지의 짝수 합은 : " + tot);

	}

	public static void test3() {

		// for문 이용 1~100 까지의 홀수 합 구하기

		int sum = 0;

		for (int x = 1; x <= 100; x += 2) { // 1~100 반복이되 2씩 증가 반복 처리

			sum += x; // 반복문의 x값을 sum 변수에 저장
		}
		System.out.println("1~100까지의 홀수 합은 " + sum);

	}

	public static void test4() {

		/*(1~100까지만 입력) 총 5개의 점수를 입력받아 합계 구하기
		 * 1번 점수 : 90
		 * 2번 점수 : -70점
		 *         잘못입력했어요
		 * 2번 점수 : 85
		 * 3번 점수 : 120
		 *          잘못입력했어요  
		 * 3번 점수 : 88
		 * 4번 점수 : 98
		 * 5번 점수 : 75
		 * 총점 : ***
		 *                 
		 */

		Scanner in = new Scanner(System.in);

		int sum = 0;
		int score;

		for (int x = 1; x <= 5; x++) {

			System.out.println(x + "번 점수 : ");
			score = in.nextInt();

			if (score < 1 || score > 100) {

				System.out.println("잘못입력했습니다");
				x--;
				continue;
			}

			sum += score;

		}
		System.out.println("총점 : " + sum + "점");

	}
}
