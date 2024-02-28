package day0104;

import java.util.Calendar;

public class Calender_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 카렌더를 불러와야 import가 자동적으로 형성됨.
		Calendar cal = Calendar.getInstance(); // ca1은 참조변수
		
		System.out.println("지금은 " + cal.get(cal.YEAR) + "년도 입니다.");
		System.out.println("지금은 " + (cal.get(cal.MONTH)+1) + "월 입니다."); //월은 +1
		System.out.println("지금은 " + cal.get(cal.DATE) + "일 입니다.");
		System.out.println("지금은 " + cal.get(cal.DAY_OF_MONTH) + "일 입니다.");
		System.out.println("시간은 " + cal.get(cal.HOUR_OF_DAY) + "시" + cal.get(cal.MINUTE) + "분");
		
		
		
		
		
	}

}
