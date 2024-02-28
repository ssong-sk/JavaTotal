package day0108;

public class For_09 {

	public static void main(String[] args) {
		// 가로로 1~10까지 출력
		
		
		for(int x = 1; x <= 10; x++ ) {
			System.out.print(x + "  ");
		}
		
		System.out.println();
		
		
		//10 ~1까지 출력
		 
		for(int x = 10; x >= 1; x--) {
			System.out.print(x + "  ");
		}
		
		
		System.out.println();
		
		
		
		//5배수
		
		for(int x = 5; x <= 50 ; x += 5 ) {
		 System.out.print(x + "  ");
		}
		
		System.out.println();
		
		
		
		//continue
		
		for(int x = 1; x <= 20; x++) { //컨티뉴를 쓸때에는 1증가 1감소만 사용한다.
			
			//1 2 3 4 6 7 8 9 ....... 20
			//5의 배수 뺴고 출력
			
			if(x % 5 == 0)
				continue; //continue 아래 문장은 수행하지 않고 i++로 이동
			System.out.print(x + "  ");
		} 
		
		
	}

}
