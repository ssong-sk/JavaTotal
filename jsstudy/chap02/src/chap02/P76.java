package chap02;

import java.util.Scanner;

public class P76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int w;
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 :");
		w = in.nextInt();

		int s = w % 2;

		System.out.println((s == 0) ? "짝수" : "홀수");

	}

}
