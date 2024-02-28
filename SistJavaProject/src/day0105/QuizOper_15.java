package day0105;

import java.util.Scanner;

public class QuizOper_15 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력하여 가장 큰 값 max 값을 구하시오.
		// if문과 삼항연산식 구할것
		/*
		 * 3개의 숫자를 입력하시오
		 * 3 5 4
		 * **if **
		 * **삼항연산자 **
		 * max = 5
		 */

		Scanner sc = new Scanner(System.in);

		int x, y, z, max;

		System.out.println("3개의 숫자를 입력하시오 ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		//if문

		if (x > y && x > z) {
			max = x;
		} else if (y > x && y > z) {
			max = y;
		} else {
			max = z;
		}

		System.out.println("max = " + max);

		//삼항연산자

		max = x > y && x > z ? x : y > x && y > z ? y : z;
		System.out.println("max = " + max);

		System.out.println("================================================");

		Test();
	}

	public static void Test() {
		// 3개의 숫자를 입력하여 가장 큰 값 max 값을 구하시오.
		// if문과 삼항연산식 구할것
		/*
		 * 3개의 숫자를 입력하시오
		 * 3 5 4
		 * **if **
		 * **삼항연산자 **
		 * max = 5
		 */

		Scanner in = new Scanner(System.in);

		int x, y, z, max, tot;

		System.out.println("3개의 숫자를 입력하시오");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();

		System.out.println("**if문**");

		if (x > y && x > z) {
			max = x;
		} else if (y > x && y > z) {
			max = y;
		} else {
			max = z;
		}
		System.out.println("3개의 숫자 중 가장 큰 숫자는 " + max + "입니다.");
		System.out.println("**if문 종료**");

		System.out.println("**삼항연산자**");

		tot = x > y && x > z ? x : y > x && y > z ? y : z; //먼저 비교를 해야할것이 몇가지가 있는지 생각해서 대입!!!!
		System.out.println("3개의 숫자 중 가장 큰 숫자는 " + tot + "입니다.");
		System.out.println("**삼항연산자 종료**");

		//switch문은 이 공식을 사용할 수 없는 건지 궁금... 범위 조건은 안되고, 정확한 값으로만 판단 가능,, 그래서 사용 못함.!!!!!!!
	}
}
