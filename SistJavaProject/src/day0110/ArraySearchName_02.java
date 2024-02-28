package day0110;

import java.util.Scanner;

public class ArraySearchName_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names = {"유재석", "지석진", "하하", "김종국", "송지효", "양세찬", "빅명수", "정준하", "전소민", "이광수"};
		
		Scanner in = new Scanner(System.in);
		
		String na;
		boolean flag;
				
		while(true) {
			
			System.out.println("이름을 입력하시오");
			na = in.nextLine();
		
			//다른 이름 입력시 종료
			if(na.equals("q")) {
				System.out.println("종료합니다.");
				break;
			}
			flag = false;
			//값 찾기
			for(int i = 0; i < names.length; i++ ) {
				if(na.equals(names[i])) {
					flag = true;
					System.out.println((i+1) + "번째에서 검색");
				}
				
			}
			if(!flag) {
				System.out.println(na + "데이터가 없습니다.");
			}
			
		}
		

	}

}
