package j0114;

import java.util.Scanner;

public class QuizOper_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int x;
		
		System.out.println("알바비는 : ");
		x = in. nextInt();
		
		System.out.println("만원 : " + x/10000);
		System.out.println("천원 : " + (x%10000) / 1000 );
		System.out.println("천원 : " + (x%1000) / 100 );
		System.out.println("천원 : " + (x%100) / 10 );
		System.out.println("천원 : " + (x%10) / 1 );
		
		
		
		Scanner in1 = new Scanner(System.in);
		
		int y;
		
		System.out.println("알바비는 : ");
		y = in1.nextInt();
		
		System.out.println("만원 : " + y / 100000);
		System.out.println("천원 : " + (y % 10000) / 1000);
		System.out.println("백원 : " + (y % 1000) / 100);
		System.out.println("십원 : " + (y % 100) / 10);
		System.out.println("일원 : " + (y % 10) / 1);
		

	}

}
