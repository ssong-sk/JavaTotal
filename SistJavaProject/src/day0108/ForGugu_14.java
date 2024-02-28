package day0108;

import java.util.Scanner;

public class ForGugu_14 {

	public static void main(String[] args) {
		// 중첨 for문 이용한 구구단(2~9단)

		/*for(int dan = 2; dan <= 9; dan++) {
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(dan + "X" + j + "=" + dan*j);
			}
			
			System.out.println();
		}*/

		// break문을 이용한 구구단

		loop1 : for (int dan = 2; dan <= 9; dan++) {

			for (int j = 1; j <= 9; j++) {

				if (j == 5)
					// break; //현재의 반복문을 빠져나가 상위의 dan++로 이동
					break loop1; // 이름을 명시하여 여러반복문 빠져나가는것도 가능(레이블이 같은 이름의 반복문에서)
				System.out.println(dan + "*" + j + "=" + dan * j);
			}
			System.out.println();
		}

		System.out.println("Q. 단을 입력하면 해당 단이 나오게 해주세요 [5단]");

		int x;

		Scanner in = new Scanner(System.in);

		System.out.println("단을 입력해주세요");
		x = in.nextInt();

		System.out.println("[" + x + "단]");

		for (int x1 = 1; x1 <= 9; x1++) {

			System.out.println(x + "*" + x1 + "=" + x * x1);

		}
		System.out.println();

		System.out.println("Q. 단을 입력하면 해당 단이 나오게 해주세요 [5단] 2~9단까지 입력 후 0이 나오면 종료");

		while (true) {
			
			System.out.println("단을 입력해주세요");
			x = in.nextInt();

			// 종료조건

			if (x == 0) {
				System.out.println("프로그램을 좋료!!!");
				break; // 반복문 종료 
			}

			// 잘못입력한 경우
			if (x < 2 || x > 9) { // 입력값이 2~9 사이가 아닐때
				System.out.println("2~9단까지만 입력해주세요.");
				continue; // 다음 반복 실행
			}

			System.out.println("[" + x + "단]"); // 몇단인지 표기

			for (int x1 = 1; x1 <= 9; x1++) {

				// System.out.println(x + "*" + x1 + "=" + x * x1);
				System.out.printf("%d x %d = %2d\n", x, x1, x * x1);

			}
			System.out.println();

		}

		System.out.println("가로 방향으로 구구단 출력");

		/*
		 * 
		 * [2단]          [3단]    [4단] - 단일 for문
		 * 2 x 1= 2     3x1=3    4x1=4 - 다중 for문
		 * 2 x 2 = 4         
		 */

		System.out.println("");

		for (int d = 2; d <= 9; d++) {

			System.out.print("[" + d + "단]\t");
		}

		System.out.println();
		System.out.println();

		for (int i = 1; i <= 9; i++) { // 첫행 i = 1 고정 후 안쪽 반복문실행 -> 안쪽반복문 종료 후 1씩 증가 -> 반복
			for (int d = 2; d <= 9; d++) {
				System.out.print(d + "x" + i + "=" + d * i + "\t");
				                // 2 * 1  , 3 * 1 , 4 * 1 .... = i = 1 일떄   
				                // 2 * 2  , 3 * 2 , 4 * 2 .... = i = 2 일떄
				                // .... 
			}
			System.out.println();
		}

	}
}
