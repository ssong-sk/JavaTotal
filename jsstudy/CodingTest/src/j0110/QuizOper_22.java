package j0110;

import java.util.Scanner;

public class QuizOper_22 { //0105

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String sang;
		int num, price, sum, tot;
		int dc = 0;
		
		System.out.print("상품명 입력 : ");
		sang = in.nextLine();
		System.out.print("수량 입력 : ");
		num = in.nextInt();
		System.out.print("1개당 금액은 : ");
		price = in.nextInt();
		
		System.out.println("==============================================");
		System.out.println("**5개 이상 구매시 10% 할인됩니다. **");
		
		sum = num * price;
		
		
		
		if(5 <= num) {
			dc = sum / 10;
			System.out.println("총 할인된 금액은 " + dc + "입니다.");
		}
		else {
			System.out.println("4개 이하는 할인이 없습니다.");
		}
		
		tot = sum - dc;
		System.out.printf("%s는 총 %d개 구매했고 총 가격은 %d원 입니다.",sang,num,tot); 
		
	
				
		
	}

}
