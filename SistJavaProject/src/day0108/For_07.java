package day0108;

public class For_07 {

	public static void main(String[] args) {
		// while문과 for문 비교

		int i = 10;

		while(i >= 0) {
			System.out.print(i-- + " ");
		}

		System.out.println("\n**for문으로 10~0 출력**");

		
		

		for (int a = 10 ; a >= 0 ; a--) {
			System.out.print(a + " ");
		}

		System.out.println(" \n**for문 1~10 종료");


		
		
		for (int a = 1 ; a <= 10; a++) {
			System.out.print(a + "  ");

		} System.out.println("종료");


		
		
		System.out.println("\n** while문 1~10 종료");

		int c = 1;

		while(c <= 10) {
			System.out.print(c++ + " ");
		}

		int d = 1;

		while(true) {
			System.out.println(d++);
			if(d <= 10)
				break;
		}
		System.out.println("종료");


		
		
		System.out.println("**for문 1,4,7,10**");

		for(int x = 1 ; x <= 10 ; x += 3) {
			System.out.print(x + " ");
		}
		System.out.println();


		
		
		System.out.println("**for문 5 4 3 2 1**");

		for(int y = 5; y >= 1; y--) {
			System.out.print(y + " ");
		}


		
		
		System.out.println("\n**while문 5 4 3 2 1**");

		int z = 5;

		while(z>0) {
			System.out.print(z-- + " ");
		}
	
		
		
		
		System.out.println("\n**for문 HelloJava를 5번 반복**");
		
		
		int m = 1; //변수를 따로 쓸 수 있음
		
		for(; m <= 5; m++) { //초기값을 따로 빼도 세미콜론을 꼭 입력해줘야함
			System.out.print("HelloJava  ");
		}
		
		}

	}
