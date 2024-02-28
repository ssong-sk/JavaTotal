package j0114;

import java.util.Scanner;

public class Randonsu_16 { //0109_06

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		int rnd = (int)(Math.random()*10+1);
		int su;
		int sum = 0;
		
		while(true) {
			sum++;
			System.out.println(sum + "회 : ");
			su = in.nextInt();
			
			if(su > rnd) {
				System.out.println(su + "보다 작습니다.");
			}
			else if(su < rnd) {
				System.out.println(su + "보다 큽니다.");
			}
			else {
				System.out.println("정답입니다. 정답은 " + rnd + "입니다.");
				break;
			}
			System.out.println("종료");
			
		}

	}

}
