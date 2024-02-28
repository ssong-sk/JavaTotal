package j0111;

import java.util.Scanner;

public class OperYoon_04 {

	public static void main(String[] args) {
		//윤년 공식 if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)

		Scanner in = new Scanner(System.in);
		int year, month, day;

		System.out.println("년도와 월을 입력해주세요");
		year = in.nextInt();
		month = in.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "윤년입니다.");
		} else {
			System.out.println(year + "평년입니다.");
		}
		
		

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		} else if (month == 2) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				day = 29;
			} 
			else {
				day = 28;
			}

			
		} 
		else {
			day = 31;
		}

		System.out.println(year + "년 " + month + "월은 " + day + "일 까지 있습니다.");

	}

}
