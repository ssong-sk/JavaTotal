package day0108;

public class For_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		
		for(; i <=10; i++) {
			System.out.print(i + "   ");
		}
		
		System.out.println("\nfor문 빠져 나온 i의 값은 " + i ); //for문에서 빠져나오면 그 다음 값은 11이 추출됨.
	
        
		
		int a =10;
		
		for(; a <= 50; a += 5) {
			System.out.print(a + "   ");
		}
	
		System.out.println("\n빠져 나온 a값 : " + a);
		
		
		
		System.out.println("1~10까지 숫자중에서 짝수만 출력");
		
		for(int n = 1; n <= 10; n++) {
			if(n % 2 == 0)
				System.out.print(n + "  "); // 조건식에 맞는것만 출력됨
		}
			
		
		
		
		System.out.println("\n1~10까지 숫자중에서 짝수만 출력 _ continue");
			
		for(int n = 1; n <= 10; n++) {
			if(n % 2 != 0 )  // or (n % 2 == 1)
				continue; //조건식이 맞으면 skip되서 증감식으로 넘어감, 조건식에 맞지 않으면 출력됨
			System.out.print(n + "  ");
		}
	}

}
