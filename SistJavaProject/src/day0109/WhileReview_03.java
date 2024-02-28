package day0109;

import java.util.Scanner;

public class WhileReview_03 {

	public static void main(String[] args) {
		/*
		 * 반복적으로 나이를 입력한다 0이 되면 종료
		 * 나이가 50세 이상일 경우 a 변수 증가
		 * 나이가 30세 이상일 경우 b 변수 증가
		 * 그외에는 c 변수 증가
		 * 
		 * 빠져나온 후 출력내용
		 * 50세이상 : 3명
		 * 30세이상 : 2명
		 * 그 외 : 3명 //30세가 안되는 경우에만 출력이 됨.
		 */

		Scanner in = new Scanner(System.in);

		int old;
		int old1 = 0;
		int old2 = 0;
		int old3 = 0;

		while(true){

			System.out.println("나이를 입력하세요");
			old = in.nextInt();

			if(old == 0) 
			break;

			if(50 <= old)
				old1 += 1;

			if(30 <= old) 
				old2 += 1;

			else
				old3 += 1;
				
		

		} System.out.println("50세이상 : " + old1 + "\n30세 이상 : " + old2 + "\n그 외 : " + old3);


		/*
		 * Scanner in = new Scanner(System.in);

		int old;
		int old1 = 0;
		int old2 = 0;
		int old3 = 0;

		while(true){

			System.out.println("나이를 입력하세요");
			old = in.nextInt();

			if(old ==0)
			break;

			//조건
		 *  if(old >= 50)
		 *  old1++;
		 *  else if(old >=30)
		 *  old2++;
		 *  else
		 *  old3++;
		 */



	}
}
