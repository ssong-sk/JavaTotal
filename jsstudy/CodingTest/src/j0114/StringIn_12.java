package j0114;

import java.util.Scanner;

public class StringIn_12 { //0109

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String name;
		int cnt = 0;
		
		while(true) {
			System.out.println("이름입력");
			name = in.nextLine();
			
			if(name.equals("끝")) {
				break;
			}
			if(name.endsWith("김") ) {
				cnt += 1;
			}
			System.out.println("김씨 성을 가진 사람은 총 : " + cnt);
				
		}
		
		String num;
		int sum = 0;
		
		while(true) {
			System.out.println("숫자입력");
			num = in.nextLine();
			
			if(num.equals("0")) {
				break;
			}
			if(num.startsWith("2")) {
				sum += 1;
			}
				System.out.println("2로 시작하는 갯수는" + sum);
		}
			
		
		while(true) {
			System.out.println("입력");
			
			if(num.equals(num)) {
				System.out.println();
			}
			if(num.startsWith(num)) {
				
			}
			if(num.endsWith(num) ) {
				
			}
		}
	}

}
