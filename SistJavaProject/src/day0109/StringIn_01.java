package day0109;

import java.util.Scanner;

public class StringIn_01 {

	public static void main(String[] args) {
		// 반복적으로 이름을 입력해서 김씨가 몇명인지?...... 끝이라고 쓰면 좋료
		//반복적이라는 말이 들어가면 break 꼭 필수로 넣기

		Scanner in = new Scanner(System.in);

		String name; //입력값 변수 설정
		int cnt = 0; //갯수 변수설정

		while(true) {

			System.out.println("이름입력 "); //출력 입력
			name = in.nextLine();

			//break (먼저 break를 걸어두고 작업하면 밑에까지 내려가지 않기 떄문에 처음에 입력하는게 좋음)
			if(name.equals("끝"))   // (string) 문자입력할때 쓰는 메서드
				break;   //반복문에는 break를 꼭 붙여야함.

			if(name.startsWith("김"))   //boolean으로 김으로 시작하는 사람이 있다면...첫글자가/endWith는 마지막 글자가
				cnt += 1;  //갯수 증가
		}System.out.println("김씨 성을 가진 사람은 총 : " + cnt + "명 입니다");

	}

	public static void Teat() {
		
		
		
	}
}
