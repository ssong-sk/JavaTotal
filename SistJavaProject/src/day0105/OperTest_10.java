package day0105;

import java.util.Scanner;

public class OperTest_10 {

	public static void main(String[] args) {
		// 신체검사를 하는데 이름과 키, 몸무게 입력하면 
		/*
		 * 표준 몸무게를 출력해 보기(키에서 -100)*0.9.... 표준몸무게는 소수점 한자리로 출력
		 * 
		 * 
		 * 당신의 이름? 이효리
		 * 키? 165
		 * 몸무게? 55
		 * 
		 * 이효리님의 표준몸무게는 55키로 입니다.
		 * 
		 */

		
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y, z;
		double s;
		
		System.out.print("당신의 이름? ");
		x = sc.nextLine();
		System.out.print("키? ");
		y = sc.nextInt();
		System.out.print("몸무게? ");
		z = sc.nextInt();
		
		
		s = (y-100)*0.9;
		
		
		System.out.println("이효리님의 표준 몸무게는 " + s + "키로 입니다.");
		
	    System.out.printf("%s님의 표준 몸무게는 %.1f키로 입니다.",x,s);
		
		
	    
	    
	    /*
	     * Scanner sc = new Scanner(System.in);
	     * String x;
	     * double y,z,s;
	     * 
	     *System.out.print("당신의 이름? ");
	     * x = sc.nextLine();
	     * System.out.print("키? ");
	     * y = sc.nextDouble();
	     * System.out.print("몸무게? ");
	     * z = sc.nextDouble();
	     * 
	     * s = (y-100)*0.9;
	     *
	     *System.out.printf("%s님의 표준몸무게는 %.1f 키르입니다.", x,s);
	     * 
	     */
	}

}
