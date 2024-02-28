package Chap03;

import java.util.Scanner;

public class P87 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // if~else문
		System.out.print("숫자를 입력하세요 :");
		int number = in.nextInt();

		if (number % 2 == 0)
			System.out.println("짝수!");
		else
			System.out.println("홀수!");
		System.out.println("종료");
	}
}
