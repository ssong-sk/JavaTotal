package day0104;

import java.util.Scanner;

public class KeyBoardIn_16 {

	public static void main(String[] args) {
		// 이름, 국, 영, 수 점수를 입력하고 결과 출력해보기

		Scanner scanner = new Scanner(System.in);

		// 변수는 미리 선언하거나 입력할 때 주어도 된다.

		String stuname;
		int kor, eng, mat;
		int tot;
		double avg;

		// 입력
		System.out.print("학생명? ");
		stuname = scanner.nextLine();
		System.out.print("국 영 수 점수를 입력하시오 ");
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();

		// 계산
		tot = kor + eng + mat;
		avg = tot / 3.0;

		// 최종출력
		System.out.println("--------------------------------");
		System.out.println("학생명 : " + stuname);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);

	}

}
