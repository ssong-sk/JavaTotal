package j0110;

import java.util.Scanner;

public class QuizOper_15 { //0105

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int x, y, z, max;
		
		System.out.println("3개의 숫자를 입력하시오");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		System.out.println("**if문**");
		if(x > y && x > z) {
			max = x;
		}
		else if(y > x && y > z) {
			max = y;
		}
		else {
			max = z;
		}
		System.out.println("3개의 숫자 중 가장 큰 값은 : " + max );
		
		System.out.println("**삼항연산식**");
		
		max = x > y && x > z ? x : y > x && y > z ? y : z;
		System.out.println("max = " + max );
		
		
	}

}
