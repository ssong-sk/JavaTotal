package j0111;

import java.util.Scanner;

public class YoonYear_03 { //0108

	public static void main(String[] args) {
		// 윤년 구하는 공식
		/*
		 * 1. 년도가 4로 나누어 떨어지면 윤년이다 ==> 년도 4로 나누면 나머지가 0
		 * 2. 년도를 100으로 나누어서 나머지가 0이 아니거나
		 * 3. 년도를 400으로 나누어서 나머지가 0이면 -윤년
		 */
		
		Scanner in = new Scanner(System.in);
		int year;
		
		System.out.println("년도입력");
		year = in.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  //
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}

	}

}
