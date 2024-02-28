package day0105;

import java.util.Scanner;

public class IfOper_13 {

	public static void main(String[] args) {
		// 삼항연산자
		//구하려는 값=수식1 ? "참":"거짓"

		//if문과 삼항연산자 비교

		int score = 80; //점수
		char grade; //학점

		if (score >= 90) {
			grade = 'A';

		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("학점은 : " + grade);

		//삼항연산자 하는 방법 

		/* grade = score >= 90 ? 'A' : 
			    score >= 80 ? 'B' : 
			    	score >= 70 ? 'C' : 
			    		score >= 60 ? 'D' : 'F' ; //마칠때만 세미콜론 입력하기
		
		
		System.out.println("학점은 " + grade + "입니다.");*/

		/*switch (score / 10) {
			case 10 :
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 :
				grade = 'D';
				break;
			default :
				grade = 'F';*/

		System.out.println("======================================");

		//Test();
		Test1();
	}

	public static void Test() {
		// 삼항연산자
		//구하려는 값=수식1 ? "참":"거짓"

		//if문 / 삼항연산자 / switch 문
		/*
		 * 90점 부터 70점까지 적고 나머지는 F
		 */

		int score = 80; //점수
		char grade; //학점

		System.out.println("**if문**");

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) { //score가 80보다 작거나 같으면의 뜻 >= 작거나 같다 / <= 크거나 같다 기억하기!!
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("if문 학점은 : " + grade);

		System.out.println("**삼항연산자**");

		grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : 'D';

		System.out.println("삼항연산자 학점은 : " + grade);

		System.out.println("**switch**");

		switch (score / 10) {
			case 10 :
			case 9 :
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			default : //switch에서 그 외에 값들은 default 값으로 지정해줘야 한다!!!!!!
				grade = 'D';
		}
		System.out.println("switch문 학점은 : " + grade);

	}

	public static void Test1() {
		// 삼항연산자
		//구하려는 값=수식1 ? "참":"거짓"

		//if문 / 삼항연산자 / switch 문
		/*
		 * 90점 부터 70점까지 적고 나머지는 F
		 */

		Scanner in = new Scanner(System.in);

		int score;
		String grade;

		System.out.println("점수를 입력하시오");
		score = in.nextInt();

		System.out.println("**if문**");

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("if문의 학점은 : " + grade);

		System.out.println("**삼항연산자**");

		grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "F";

		System.out.println("삼항연산자의 학점은 : " + grade);

		System.out.println("**switch문**");

		switch (score / 10) {
			case 10 :
			case 9 :
				grade = "A";
			case 8 :
				grade = "B";
			case 7 :
				grade = "C";
			default :
				grade = "F";
		}
		System.out.println("switch문 학점은 : " + grade);
	}
}
