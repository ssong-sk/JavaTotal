package day0108;

import java.util.Scanner;

public class Factorial_13 {

	public static void main(String[] args) {
		// 1~10까지의 팩토리얼 구하기

		int result = 1;

		for (int i = 1; i <= 10; i++) {
			result *= i;
			System.out.println(i + "!" + " = " + result);
		}

		Scanner in = new Scanner(System.in);

		int sum = 0;
		int myNum;
		int youNum;

		System.out.println("숫자를 입력하세요 : ");
		youNum = in.nextInt();

		System.out.println("숫자를 입력하세요 : ");
		myNum = in.nextInt();

		if (youNum > myNum) {

			System.out.println("초기값 " + youNum + "이 범위값 " + myNum + "보다 큽니다.");

		} else {

			//  for(int i = 10; 10 <= 3; i++)
			for (int i = youNum; i <= myNum; i++) { //for문과 if문은 
				sum += i;
			}

			System.out.println(youNum + "부터" + myNum + "까지의 합 = " + sum);

		}
	}
}
