package j0114;

import java.util.Random;

public class RandomClass_16 { //0109_05

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		System.out.println("0~9사이 난수 5개 발생");
		
		for(int i = 1; i <= 5; i++) {
			int a = r.nextInt(10);
			System.out.print(a + " ");
		}
		System.out.println("\n=======================================");
		
		System.out.println("0~99사이 난수 5개 발생");
		
		for(int i = 1; i <= 5; i++) {
			int a = r.nextInt(100);
			System.out.print(a + " ");
		}
		System.out.println("\n=======================================");
		
		System.out.println("1~10까지 난수 5개 발생");
		
		for(int i = 1; i <= 5; i++) {
			int a = r.nextInt(10)+1;
			System.out.print(a + " ");
		}
		System.out.println("\n=======================================");
		
		System.out.println("65~90사이의 난수 5개 발생");
		
		for(int i = 1; i <= 5; i++) {
			int a = r.nextInt(26)+65;
			System.out.print(a + " ");
		}
		
		System.out.println("\n=======================================");
		
		System.out.println("65~90사이의 난수 5개를 아스키코드로 발생");
		
		for(int i = 1; i <= 5; i++) {
			int a = r.nextInt(26)+65;
			System.out.print((char)a);
		}

	}

}
