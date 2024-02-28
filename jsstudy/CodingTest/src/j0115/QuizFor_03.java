package j0115;

import java.util.Scanner;

public class QuizFor_03 { //0109_17

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();

	}
	public static void test1() {
		/*
		 * 팩토리얼 구할 숫자입력하여 해당 숫자에 대한 팩토리얼 구하기
		 */
		
		Scanner in = new Scanner(System.in);
		
		int num = 0;
		int result = 1;
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("숫자를 입력하시오");
			num = in.nextInt();
			//i 1 = num 1!
			for(int j = 1; j <= num; j++) {
				result *= j;
			}//j =1  1*1 / j = 2   1 * 2  / j =3  2 * 3
			System.out.println(num + " ! " + " = " + result);
			result = 1;
		}
		
		
	}
	
	public static void test2() {
		/*
		 * 두 수 x,y를 입력 후 x의 y승 _for문
		 */
		
		Scanner in = new Scanner(System.in);
		
		int x, y;
		int sum = 1;
		
		System.out.println("두수를 입력하시오");
		x = in.nextInt();
		y = in.nextInt();
		
		for(int i = 1; i <= y; i++) {
			sum *= x;
		}
		System.out.println(x + "의 " + y + "승은 " + sum + " 입니다." );
		
		
	}
	
	public static void test3() {
		
		int sum = 0;
		int tot = 0;
		
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
			else {
				tot += i;
			}
		}
		System.out.println("짝수의 합은 " + sum + " 홀수의 합은 " + tot);
	}

}
