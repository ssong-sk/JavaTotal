package j0111;

import java.util.Calendar;
import java.util.Scanner;

public class OperReView_02 { //0108

	public static void main(String[] args) {
		// 나이와 띠 구하기
		
		Scanner in = new  Scanner(System.in);
		
		int year, age;
		String name, ddi;
		
		System.out.println("이름 입력");
		name = in.nextLine();
		
		System.out.println("태어난 년도");
		year = in.nextInt();
		
		Calendar cal = Calendar.getInstance();
		age = cal.get(cal.YEAR) - year;
		
		
		//삼항연산자
		ddi = year % 12 == 0 ? "원숭이" :
			year % 12 == 1 ? "닭" :
				year % 12 == 2 ? "개" :
					year % 12 == 3 ? "돼지" :
						year % 12 == 4 ? "쥐" :
							year % 12 == 5 ? "소" :
								year % 12 == 6 ? "호랑이" :
									year % 12 == 7 ? "토끼" :
										year % 12 == 8 ? "용" :
											year % 12 == 9 ? "뱀" :
												year % 12 == 10 ? "말" : "양";
		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("띠 : " + ddi + "띠");

	
		
	}

}
