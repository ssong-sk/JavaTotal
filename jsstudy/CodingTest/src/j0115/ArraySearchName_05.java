package j0115;

import java.util.Scanner;

public class ArraySearchName_05 { //0110 _ 02

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names = {"유재석", "지석진", "김종국", "송지효", "하하", "양세찬"};
		
		Scanner in = new Scanner(System.in);
		
		String na;
		boolean flag;
		
		while(true) {
			System.out.println("이름을 입력하시오");
			na = in.nextLine();
			
			if(na.equals("e")) {
				System.out.println("종료");
				break;
			}
			
			flag = false;
			
			for(int i = 0; i < names.length; i++) {
				if(na.equals(names[i])) {
					flag = true;
					System.out.println((i+1) + "번째에서 검색");
				}
			}
			if(!flag) {
				System.out.println(na + " 데이터가 없습니다.");
			}
		}

	}

}
