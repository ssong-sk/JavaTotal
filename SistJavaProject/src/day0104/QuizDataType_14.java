package day0104;



public class QuizDataType_14 {

	public static void main(String[] args) {
		// 실행단계에서 상품명, 수량, 단가를 입력한 후 다음과 같이 출력하세요
		/*
		 * 상품명 : 아이폰15
		 * 수량 : 2개
		 * 단가 : 1200000원
		 * 총금액 : 2400000원
		 */
		
		
		//1. 변수선언
		
		String x = args[0];
		int y = Integer.parseInt(args[1]) ;
		int z = Integer.parseInt(args[2]);
		
		
		//2. 계산
		
		int s = y * z;
		
		//3. 출력
		
		System.out.println("상품명 : " + x);
		System.out.println("수량 : " + y + "개");
		System.out.println("단가 : " + z + "원");
		System.out.println("총금액 : " + s + "원");
		
		System.out.printf("상품명 : %s\n 수량 : %d개\n 단가 : %d원\n 총금액 : %d원",x,y,z,s);
		

	}

}
