package j0110;

import java.util.Scanner;

public class IfReturn_18 { //0105

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int score;
		
		System.out.println("점수입력");
		score = in.nextInt();
		
		if(score < 1 || score > 100 ) {
			System.out.println("잘못입력했습니다.");
			return;
		}
		else {
			System.out.println("점수는 : " + score);
		}
	}

}
