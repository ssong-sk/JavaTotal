package day0105;

import java.util.Calendar;
import java.util.Scanner;

public class QuizMyAgeInOut_02 {

	public static void main(String[] args) {
		/*
		 * 당신의 이름은? ==> 이수연
		 * 당신이 태어난 연도는 ==> 1988
		 * 당신이 사는 지역은? ==> 경기
		 * 
		 * =============================
		 * [이수연 님의 개인정보]
		 * =============================
		 * 이름 : 이수연
		 * 태어난 연도 : 1988
		 * 나이 : **세
		 * 지역 : 경기
		 */

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		// 2.변수
		String x, y;
		int z, s, n;

		// 3. 입력
		System.out.print("당신의 이름은? ==> ");
		x = sc.nextLine();
		System.out.print("당신이 태어난 년도는 ==> ");
		// s = sc.nextInt();
		s = Integer.parseInt(sc.nextLine()); // 그 다음 출력값이 String 이므로 형변환
		// Integer.parseInt("1988")=1980 : String ->int
		// sc.nextLine() 는 키보드의 버퍼나 엔터를 먼저 읽어서 없애준다.
		System.out.print("당신이 사는 지역은? ==> ");
		y = sc.nextLine();

		// 4.계산
		z = cal.get(cal.YEAR); // 2024
		n = z - s;

		// 5.결과출력
		System.out.println("=======================");
		System.out.println("[이수연님의 개인정보]");
		System.out.println("=======================");
		System.out.println("이름 : " + x);
		System.out.println("태어난 년도 : " + s);
		System.out.println("나이 : " + n);
		System.out.println("지역 : " + y);

	}

}
