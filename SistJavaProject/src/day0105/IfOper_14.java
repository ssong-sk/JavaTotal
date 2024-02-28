package day0105;

import java.util.Scanner;

public class IfOper_14 {

	public static void main(String[] args) {
		// 삼항(조건)연산자
		// 형식조건식? 참일때의 값 : 거짓일때의 값

		Scanner sc = new Scanner(System.in);

		int x, y, max;

		System.out.println("**두개의 숫자를 입력하세요**");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.println("입력한 두수는  " + x + "," + y);

		/*if(x>y) {
			max = x;
			
		}
		
		else {
			max = y;
		}*/

		//삼항연산자

		max = x > y ? x : y; //공식
		System.out.println("두수중에서 더 큰 값은 " + max + "입니다.");

		System.out.println("첫번째 수가 더 " + (x > y ? "크다" : "작다")); //비교해서 결과도출

		System.out.println("============================================");

		Test1();
	}

	public static void Test1() {
		/*
		 * 두 수를 입력하여 더 큰값과 어떤 수가 더 큰지 비교해서 크다,작다에 대한 결과 도출
		 */
		Scanner in = new Scanner(System.in);

		int x, y;
		int max, com; // 더큰값에 대해서도 변수 지정

		System.out.println("두 수를 입력하시오");
		x = in.nextInt();
		y = in.nextInt();

		System.out.println("입력한 두 값은 " + x + ", " + y);
		System.out.println("**if문**");

		if (x > y) {
			max = x;
		} else {
			max = y;
		}
		System.out.println(max + "값이 더 큽니다.");

		if (x > y) {
			System.out.println(y + "이 작다");
		} else {
			System.out.println(x + "이 작다");
		}
		System.out.println("**if문 종료**");

		System.out.println("**삼항연산자**");

		max = x > y ? x : y;
		System.out.println(max + "값이 더 큽니다.");
		System.out.println("첫번쨰 수가 더 " + (x > y ? "크다" : "작다"));
		System.out.println("**삼항연산자 종료**");
	}

}
