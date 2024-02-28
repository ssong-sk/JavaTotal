package j0114;

import java.util.Scanner;

public class ArrDateInOut_20 { //0109 _12

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int[] data;
		data = new int[5];

		int sum = 0;

		for (int i = 0; i < data.length; i++) {
			System.out.print((i + 1) + "번째 값 : ");
			data[i] = in.nextInt();
			sum += data[i];
		}

		System.out.println();
		System.out.println("**입력값**");

		for (int i = 0; i < data.length; i++) {
			System.out.println(i + " ===> " + data[i]);
		}

		System.out.println("=======================");
		System.out.println("총 합계는 : " + sum);

	}

}
