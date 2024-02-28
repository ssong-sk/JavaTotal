package day0115;




import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ShopArrayList_10 {
	
	//ipgo 메서드 입력
	List<Shop_10> list = new Vector<Shop_10>();
	


	public void ipgo() {
		Scanner in = new Scanner(System.in);
		String sangName;
		int su;
		int dan;
		
		System.out.println("상품명?");
		sangName = in.nextLine();
		System.out.println("가격?");
		dan = Integer.parseInt(in.nextLine());
		System.out.println("수량?");
		su = Integer.parseInt(in.nextLine());
		
		Shop_10 data = new Shop_10(sangName, su, dan);
		list.add(data);
		
		System.out.println("현재입고된 상품개수 : " + list.size() + "개 입니다");

		
	}
	//출력메서드 
	public void jego() {
		System.out.println("**상품 재고 현황**");
		System.out.println();
		System.out.println("번호\t상품명\t가격\t수량\t수량");
		System.out.println("--------------------------------------------------");
		for(int i = 0; i < list.size(); i++) {
			Shop_10 s = list.get(i);
			System.out.printf((i+1) + "\t" + s.getSangName() + "\t" + s.getDan() + "\t" + s.getSu() + "\t" + s.getTot());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		ShopArrayList_10 sh = new ShopArrayList_10();
		Scanner in = new Scanner(System.in);
		int n;
		
		
		while(true ) {
			System.out.println("1.상품입고 2.상품재고 3.종료");
			n = Integer.parseInt(in.nextLine());
			
			
			if(n == 1) {
				sh.ipgo();
			}
			else if (n ==2) {
				sh.jego();
			}
			else if(n == 3) {
				System.out.println("종료");
				break;
			}
		}
	}
	

}
