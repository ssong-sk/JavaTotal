package j0114;

import java.util.Scanner;

public class IfTest_04 { //0105

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int x;
		
		System.out.println("당신이 좋아하는 숫자는?");
		x = in.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("그 숫자는 짝수입니다.");
		}
		else {
			System.out.println("그 숫자는 홀수입니다.");
		}
	
		
		
		switch(x % 2) {
			case 0 :
				System.out.println("짝수입니다.");
				break;
			case 1 :
				System.out.println("홀수입니다.");
		}
	}

}
