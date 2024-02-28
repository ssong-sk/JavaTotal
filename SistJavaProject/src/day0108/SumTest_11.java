package day0108;

public class SumTest_11 {

	public static void main(String[] args) {
		// 반복문안에서 합계구하기
		
		
		int sum = 0; //sum 값은 무조건 0으로 값 설정해주기(합계를 구한것이기 떄문)
		
		for(int i = 1; i <= 10; i++) {
			
			//sum = sum + i; //잘 사용하지 않음
			sum += i;
		}

		System.out.println("1~10까지의 합은 : " + sum + "입니다."); //for문에서 나와서 출력해야됨.
		
		
		//while
		
		int n = 1;
		int tot = 0; //총합
		
		while(n <= 10) {
			tot += n;
			n++;
		}
		System.out.println("1~10까지의 합은 : " + tot + "입니다.");
			
		
		
		
		System.out.println("for문으로 1~10까지문 2씩 증가할 경우의 합계를 구하시오");
		
		int z = 0;
		
		for(int a = 1; a <=10; a +=2) {
			z += a;
			
		}System.out.println("총 합은 : " + z);
		
			
		
		
		
		
	}

}
