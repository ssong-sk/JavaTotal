package day0108;

import java.util.Scanner;

public class OperYoon_04 {

	public static void main(String[] args) {
		//윤년 공식 if문 :  year % 4 ==0 && year % 100 != 0 || year % 400 == 0
		//연도를 입력해서 그 해가 윤년인지 평년인지 출력하고 해당 달이 몇일까지 있는지 출력해라


		Scanner in = new Scanner(System.in);

		int year, month, days;
		boolean flag;

		System.out.println("년도와 월을 입력해주세요.");
		year = in.nextInt();
		month = in.nextInt();

		//월 잘못 입력시 프로그램 종료
		if (month < 1 || month > 12) {
			System.out.println("월을 잘못 입력했어요 !!");
			return; //메인 메서도 종료
		}

		//윤년 구하기 

		flag = year % 4 ==0 && year % 100 != 0 || year % 400 == 0;

        // 조건식 ( 1 == 1 ) == ( true ) / ( 1 == 2 ) == ( false )
		// if ( 조건 ) , 조건 = true / false , true ,
	    // flag = true / false -> if ( true )
		// flag == ture일떄 부정처리 !flag == false  
		if(flag) //if는 기본적으로 true를 포함하고 있음(true 생략가능) / false 인경우는 if(!flag)
			System.out.println(year + "년도는 윤년입니다.");
		else
			System.out.println(year + "년도는 평년입니다.");

		//해당 년도 월이 몇일까지 있는지 구하기

		if(month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		}

		else if (month ==2) {
			if(flag)
				days = 29;
			else
				days = 28;
		}
		
		else {
			days = 31;
		}
		System.out.println(year + "년 " + month + "월은 " + days + "일 까지 있습니다.");


	}

}
