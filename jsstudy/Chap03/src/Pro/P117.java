package Pro;

import java.util.Scanner;

public class P117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result;
		int n;

		Scanner in = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		n = in.nextInt();

		result = 1;

		while (n > 0) {
			result = result * n;
			n--;
		}

		System.out.println(result);

		/*while (true) {
			if (n <= 0)
				break;
			result = result * n;
			n--;*/

	}
}
