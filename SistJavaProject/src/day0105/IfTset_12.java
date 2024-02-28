package day0105;

import java.util.Scanner;

public class IfTset_12 {

	public static void main(String[] args) {
		// 숫자하나를 입력하여 결과를 출력하시오
		/*
		 * 당신이 좋아하는 숫자는?
		 * 99
		 * 
		 * 그 숫자는 홀수입니다.
		 * 다음에 만나요.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int x;

		System.out.print("당신이 좋아하는 숫자는? ");
		x = sc.nextInt();

		if (x % 2 == 1) {
			System.out.println("그 숫자는 홀수 입니다.");
		}

		System.out.println("다음에 만나요.");

		System.out.println("****switch문*********");

		switch (x % 2) {
			case 0 :
				System.out.println("짝수");
				break;
			case 1 :
				System.out.println("홀수");

				System.out.println("=================================");
				//Test();
				Test1();
		}

	}

	public static void Test() {
		// 숫자하나를 입력하여 결과를 출력하시오
		/*
		 * 당신이 좋아하는 숫자는?
		 * 99
		 * 
		 * 그 숫자는 홀수입니다.
		 * 다음에 만나요.
		 * 
		 * if문과 switch문 각각 입력하기
		 * 
		 */

		Scanner in = new Scanner(System.in);

		int num;

		System.out.println("당신이 좋아하는 숫자는? ");
		num = in.nextInt();

		System.out.println("**if문**");

		if (num % 2 == 0) {
			System.out.println("그 숫자는 짝수입니다.");
		} else {
			System.out.println("그 숫자는 홀수입니다.");
		}
		System.out.println("다음에 만나요.");

		System.out.println("**switch문**");

		switch (num % 2) {
			case 0 : //나머지에 대한 결과값은 case 다음에 입력하기!!
				System.out.println("그 숫자는 짝수입니다.");
				break; //switch 문에는 break 꼭 걸어주기!!!!!
			case 1 :
				System.out.println("그 숫자는 홀수입니다.");
				break;

		}
		System.out.println("다음에 만나요.");

	}

	public static void Test1() {
		// 숫자하나를 입력하여 결과를 출력하시오
		/*
		 * 당신이 좋아하는 숫자는?
		 * 99
		 * 
		 * 그 숫자는 홀수입니다.
		 * 다음에 만나요.
		 * 
		 * if문과 switch문 각각 입력하기
		 * 
		 */

		Scanner in = new Scanner(System.in);

		int num;

		System.out.print("당신이 좋아하는 숫자는? ");
		num = in.nextInt();

		System.out.println("\n***if문***");

		if (num % 2 == 0) {
			System.out.println("그 숫자는 짝수입니다.");
		} else {
			System.out.println("그 숫자는 홀수입니다.");
		}
		System.out.println("다음에 만나요.");

		System.out.println("***swich문***");

		switch (num % 2) {
			case 0 :
				System.out.println("그 숫자는 짝수입니다.");
			case 1 :
				System.out.println("그 숫자는 홀수입니다.");
		}
		System.out.println("다음에 만나요.");

	}
}
