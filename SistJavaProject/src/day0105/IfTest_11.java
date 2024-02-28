package day0105;

import java.util.Scanner;

public class IfTest_11 {

	public static void main(String[] args) {
		// 

		int a = 10;

		if (a > 5) {
			System.out.println(a + "는 5보다 크다"); //조건이 맞지 않으면 조건식 실행 안하고 종료됨.
		}

		int b = 9;

		if (b % 2 == 0) {

			System.out.println(b + "는 짝수입니다.");
		}

		else {
			System.out.println(b + "는 홀수입니다.");
		}

		System.out.println("if문 종료!!!!");

		Test();
	}

	public static void Test() {
		/*a가 5보다 크다라는 값 추출
		 * 
		 * 어떤 값을 입력했을 때 홀수 인지 짝수인지 비교하고나서 종료 실행
		 * 
		 */

		int a = 10;

		if (a > 5)
			System.out.println(a + "는 5보다 크다");

		Scanner in = new Scanner(System.in);

		int s;

		System.out.println("값을 입력 : ");
		s = in.nextInt();

		if (s % 2 == 0) {
			System.out.println(s + "는 짝수입니다.");
		} else {
			System.out.println(s + "는 홀수입니다.");
		}
		System.out.println("짝수, 홀수 비교 종료!!!");
	}
}
