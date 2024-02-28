package j0114;

import java.util.Scanner;

public class Book131_10 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1. 증송 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
		    System.out.println("선택 : ");
		    
		    String strNum = in.nextLine();
		    
		    if("1".equals(strNum)) {
		    	speed++;
		    	System.out.println("현재 속도 = " + speed);
		    }
		    else if("2".equals(strNum)) {
		    	speed--;
		    	System.out.println("현재 속도 = " + speed);
		    }
		    else if("3".equals(strNum)) {
		    	run = false;
		    }
		    System.out.println("프로그램 종료");
		}
		
	}

}
