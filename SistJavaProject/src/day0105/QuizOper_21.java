package day0105;

import java.util.Scanner;

public class QuizOper_21 {

	public static void main(String[] args) {
		/*
		 * (평가 90점 이상은 참잘함  80점 이상은 좀더 노력하세요~~~~~  80점 미만 불합격)
		 * 이름을 입력하세요
		 * 손흥민
		 * 국, 영, 수 점수를 입력하세요
		 * 88
		 * 99
		 * 77
		 * 
		 * =====================================
		 * [손흥민 님의 기말고사 성적]
		 * 총점 : **점
		 * 평균 : **.*점
		 * 평가 : 좀더 노력하세요~~~~~
		
		 */

		Scanner sc = new Scanner(System.in);

		String x, tot;
		int y, z, s, m;
		double n;

		System.out.println("이름을 입력하세요");
		x = sc.nextLine();
		System.out.println("국, 영, 수 점수를 입력하세요");
		y = sc.nextInt();
		z = sc.nextInt();
		s = sc.nextInt();

		System.out.println("===============================");
		System.out.println("[손흥민님의 기말고사 성적]");

		m = y + z + s;
		n = (m / 3);

		System.out.println("총점 : " + m + "점");
		System.out.printf("평균 : %.1f 점", n);

		if (n >= 90) {
			tot = "참 잘함";
		} else if (n >= 80) {
			tot = "좀 더 노력하세요~~~~";
		} else {
			tot = "불합격";
		}

		System.out.println("\n평가 : " + tot);

	}

}
