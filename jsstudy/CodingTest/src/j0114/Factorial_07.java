package j0114;

import java.util.Scanner;

public class Factorial_07 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 1;
		
		for(int i = 1; i <= 10; i++ ) {
			sum *= i;
			System.out.println(i + "!" + "=" + sum);
		}

		
		Scanner in = new Scanner(System.in);
		
		int num;
		int result = 0;
		
		System.out.println("숫자입력");
		num = in.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			result += num;
		}System.out.println("1부터" + num + "까지의 합은 " + result);
		
		
		
		
	}

}
