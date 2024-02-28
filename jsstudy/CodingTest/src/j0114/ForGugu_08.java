package j0114;

import java.util.Scanner;

public class ForGugu_08 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int dan = 2; dan <= 9; dan++ ) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(dan + " x " + j + " = " + (dan * j));
			}
			System.out.println();
		}

		
		gugu: for(int dan = 2; dan <= 9; dan++ ) {
			for(int j = 1; j <= 9; j++) {
				if(dan == 5) { 
					break gugu;
				}
				System.out.println(dan + " x " + j + " = " + (dan * j));
			}
			System.out.println();
		}
		
		
		
		
		int x;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("단입력");
		x = in.nextInt();
		
		System.out.println("[" + x + "단]");
		
		for(int y = 1; y <= 9; y++) {
			System.out.println(x + " x " + y + " = " + (x * y));
		}
	}

}
