package j0114;

import java.util.Scanner;

public class WhileReview_14 { //0109_03

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int old;
		int old1 = 0;
		int old2 = 0;
		int old3 = 0;

		while (true) {
			System.out.println("나이입력");
			old = in.nextInt();

			if (old == 0) {
				break;
			}
			
			if (old >= 50) {
				old1 += 1;
			}
			else if (old >= 30) {
				old2 += 1;
			}
			else {
				old3 += 1;
			}
		} 
		System.out.println("50세 이상은 " + old1 + ", 30세 이상은 " + old2 + ", 30세 미만은 " + old3);

	}

}
