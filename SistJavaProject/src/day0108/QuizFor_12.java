package day0108;

import java.util.Scanner;

public class QuizFor_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. 1 2 3 4 5 7 8 10 (continue 활용)");

		for (int x = 1; x <= 10; x++) {
			if (x % 3 != 0)
				
			continue;

			System.out.println(x + "  ");

		}

		System.out.println("2. 홀수값:1  홀수값:3  홀수값:5  홀수값:7  홀수값:9");

		for (int y = 1; y <= 10; y += 2) {

			System.out.print("홀수값 : " + y);
		}

		
		
		System.out.println("3. 점수를 입력 후 합계를 구하는데 0을 입력하면 빠져나와서 합계 출력_while(true) ");

		Scanner in = new Scanner(System.in);

		int score;
		int sum = 0;

		while (true) {
			System.out.println("점수를 입력하세요");
			score = in.nextInt();

			if (score == 0)
				break;

			sum += score;

		}
		System.out.println("총 합계는  " + sum);
		
		
		

		int tot = 0;
		int score1;
	

		while (true) {

			System.out.println("점수를 입력하세요");
			score1 = in.nextInt();

			if(score1 == 0) {
				break;
			}
			
			
			if (score1 < 0 || score1 > 100) {
				System.out.println("다시 입력해주세요 (1~100)");
				continue;

			}

			tot += score1;

		}
		System.out.println("총합계 : " + tot);

	}

}
