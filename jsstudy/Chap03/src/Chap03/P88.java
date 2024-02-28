package Chap03;

import java.util.Scanner;

public class P88 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("점수를 입력하세요 : ");
		int score = in.nextInt();

		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70) // 70점 미만이면서 60점 이상일 떄 라는데,, >=은 같거나 큰뜻인데...
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		System.out.println("당신의 학점은 " + grade);

	}
}
