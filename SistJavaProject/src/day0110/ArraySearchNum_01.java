package day0110;

import java.util.Scanner;

public class ArraySearchNum_01 {

	public static void main(String[] args) {
		// 배열중에서 숫자 입력하여 찾기
		// boolean을 사용하여 논리적으로 전개하여 먼저 해당 숫자가 있는지 먼저 파악
		// 있는기 찾기, 없으면 없다고 표시 / 있으면 몇번째에 있는지 출력
		// 0 입력시 종료

		int[] data = { 2, 5, 4, 14, 44, 405, 99, 76, 840, 2 }; // []앞에 써도 되고 뒤에 써도 가능함 //초깃값을 입력할때는 {} 사용

		boolean flag = false; // 논리에 대한 변수

		Scanner in = new Scanner(System.in);
		int su; // 숫자 입력 변수

		while (true) {
			System.out.println("검색할 숫자 입력");
			su = in.nextInt();

			// 0입력시 종료
			if (su == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			flag = false; // = false라는 초깃값을 주기 위한 표시 / 찾으면 true로 변경

			// 값 찾기

			for (int i = 0; i < data.length; i++) {
				if (su == data[i]) {
					flag = true;
					System.out.println((i + 1) + "번째에서 검색");
				}
			}

			if (!flag) {
				// flag == false 반환한 값
				System.out.println(su + "데이터에 없습니다.");
			}

		}

	}

}
