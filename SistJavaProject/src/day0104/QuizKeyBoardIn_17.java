package day0104;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class QuizKeyBoardIn_17 {

	public static void main(String[] args) {
		/* 키보드에
		 * 상품명을 입력하세요 ==> 아이폰 15
		 * 가격은 얼마입니까? ==> 1200000
		 * 수량은 몇개입니까? ==> 5
		 * 
		 *  상품입고 
		 *  ==================================
		 *  입고상품명 : 아이폰 15
		 *  수량 : 5개
		 *  가격 : 1200000원
		 *  ==================================
		 *  총 가격 : 6000000원
		 *  
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		String x;
		int y;
		int z;
		int tot;
		
		
		System.out.print("상품명을 입력하세요 ==? ");
		x = scanner.nextLine();
		System.out.print("가격은 얼마입니까 ==? "); //그다음 출력문도 int 이기 떄문에 형변환 안해도됨.
		y = scanner.nextInt();
		System.out.print("수량은 몇개입니까 ==? ");
		z = scanner.nextInt();
		
		tot = y * z;
		
		System.out.println("상품입고\n=========================================");
		
		System.out.println("입고상품명 : " + x);
		System.out.println("수량 : " + z);
		System.out.println("가격 : " + y);
		System.out.println("=========================================");
		System.out.println("총 가격 : " + tot);
		
		

		
		
		
		
	}

}
