package Pro;

import java.util.Scanner;

public class P122_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int w = 0;
		Scanner in = new Scanner(System.in);

		System.out.print("양의 정수를 입력하세요 : ");
		int x = in.nextInt();
		if (x < 0) {
			System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + w);
			return;
		}
		w = w + test(x);

		System.out.print("양의 정수를 입력하세요 : ");
		int y = in.nextInt();
		if (y < 0) {
			System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + w);
			return;
		}
		w = w + test(y);
		System.out.print("양의 정수를 입력하세요 : ");
		int z = in.nextInt();
		if (z < 0) {
			System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + w);
			return;
		}
		w = w + test(z);
		System.out.print("양의 정수를 입력하세요 : ");
		int s = in.nextInt();
		if (s < 0) {
			System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + w);
			return;
		}
		w = w + test(s);
		System.out.print("양의 정수를 입력하세요 : ");
		int m = in.nextInt();
		if (m < 0) {
			System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + w);
			return;
		}
		w = w + test(m);

		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + w);

	}

	private static int test(int x) {

		int n = 0;
		do {

			if (x % 2 == 0) {
				n = x;
				break;
			}
		} while (x % 2 == 0);

		return n; */
		
		
		
		Scanner in = new Scanner(System.in);
		
		int num;
		int sum = 0;
		
		do {
		
			System.out.println("양의 정수를 입력하세요 : ");
			num = in.nextInt();
			
			if(num % 2 == 0) {
				sum += num;
			
			} else if (num < 0) {
				break;
			}
		} while (true);
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
		
	}

}
