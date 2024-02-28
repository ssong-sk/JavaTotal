package day0108;

public class DoWhile_08 {

	public static void main(String[] args) {
		// 선조건 후조건 차이
		
		int n = 1;
		
		System.out.println("**While문 결과**");
		
		while(n<5) {
			n++; // n 1 증가 단, 후위증가이므로 이후 해당 변수명을 쓸떄 반영 
			System.out.print(n); //조건이 맞지 않으면 한번도 출력이 안됨.
		
		}
		
		
		
		System.out.println("\n**do~While문 결과**");
		
		n = 1;
		
		do {
			System.out.println(n++); //조건이 맞지 않아도 do부분 먼저 실행되므로 한번은 수행하여 출력됨.
			
		}while(n >= 5);
		
		
	}

}
