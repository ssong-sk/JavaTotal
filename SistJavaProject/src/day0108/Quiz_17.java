package day0108;

import java.util.Scanner;

public class Quiz_17 {

	public static void main(String[] args) {

		// quiz_1();
		quiz_2();
	}

	public static void quiz_1() {

		// Q. 반복해서 숫자를 입력하여 양수의 갯수와 음수의 갯수를 구하시오. (0입력시 종료)
		/* 
		 * 6
		 * -10
		 * 88
		 * 120
		 * -130
		 * 0
		 * 양수의 갯수 : 3개
		 * 음수의 갯수 : 2개
		 */

		Scanner in = new Scanner(System.in);

		int x;
		int y = 0; // 양의갯수
		int z = 0; // 음의갯수

		while (true) {

			System.out.println("숫자 입력 : ");
			x = in.nextInt();

			if (x > 0) {
				y += 1;
			} else if (x < 0) {
				z += 1;
			} else {
				System.out.println("시스템 종료");
				break;
			}

		}
		System.out.println("양의 갯수 : " + y);
		System.out.println("음의 갯수 : " + z);

	}

	public static void quiz_2() {

		/*
		 * 반복해서 점수를 입력하고 (1~100) 0을 입력시 빠져나와 총 갯수와 합계와 평균를 구하시오. 범위에 맞지 않는 점수는 횟수에서
		 * 제외되어야 한다.
		 */

		Scanner in = new Scanner(System.in);

		int score;
		int cnt = 0;
		int sum = 0;

		while (true) {

			System.out.println("점수입력 : ");
			score = in.nextInt();

			if (1 <= score && score <= 100) { // 1~100 일떄 처리 ( 건수 증가 및 입력값에 대한
												// 합계 )

				cnt += 1;
				sum += score;

				// } else { // 0 입력이거나 1~100 사잇값이 아닐때 종료
			} else if (score == 0) { // 입력된값이 '0' 이면 종료
				System.out.println("종료!!!!");
				break;
			}

		}
		System.out.println("총 입력한 갯수 : " + cnt + ", 총 합계 : " + sum + ", 평균 : " + ((double) sum / cnt));

	}

}
