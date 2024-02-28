package Pro;

import java.util.Scanner;

public class P122_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.print("나이 입력 : ");
		int x = in.nextInt();

		if (x >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");

	}

}
