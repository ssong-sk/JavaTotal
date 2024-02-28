package j0114;

import java.util.Scanner;

public class QuizFor_06 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. 1,2,3,4,5,6,7,8,9,10 (contunue)활용");

		for (int x = 1; x <= 10; x++) {
			if (x % 3 != 0) {
				continue;	
			}
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("2. 홀수 1,3,5,7,9 출력");
		for(int y = 1; y <= 10; y +=2) {
			System.out.print(y + " ");
		}
		
		System.out.println();
		System.out.println("3. 점수를 입력 후 합계를 구하는데 0을 입력하면 빠져나와서 합계 출력 _ while(ture)");
		
		Scanner in = new Scanner(System.in);
		
		int score;
		int sum = 0;
		
		while(true) {
			
			System.out.println("점수를 입력하세요");
			score = in.nextInt();
			
			if(score == 0) {
				break;
				
			}
			else {
				sum += score;
			}
			
		}System.out.println(sum);
	
			
		

	}

}
