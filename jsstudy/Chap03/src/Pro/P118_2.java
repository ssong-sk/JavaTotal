package Pro;

import java.util.Scanner;

public class P118_2 {

	public static void main(String[] args) {

		int result;
		int n;
		Scanner in = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		n = in.nextInt();

		result = factorial(n);

		System.out.println(result);
	}

	static int factorial(int x) {
		int r = 1;

		while (x > 0) {
			r = r * x;

			x--;
		}

		return r;

	}

}
