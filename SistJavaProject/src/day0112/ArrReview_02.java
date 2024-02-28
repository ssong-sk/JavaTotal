package day0112;

class Shop {

	private String reName;
	private int won;
	private String color;

	static int no;

	public Shop(String re, int wo, String co) {
		this.reName = re;
		this.won = wo;
		this.color = co;

	}

	public static void getShop() {
		System.out.println("[");
		System.out.println("번호\t상품명\t가격\t색상");
		System.out.println("================================");
	
	}

	// 출력
	public void showSangPums() {
		no++;
		System.out.println(no + "\t" + reName + "\t" + won + "\t" + color);
	}

}

//
public class ArrReview_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shop[] sh = { new Shop("요가매트", 25000, "pink"), 
				new Shop("아령", 18000, "black"),
				new Shop("레깅스", 45000, "beige"), 
				new Shop("나시", 22000, "white") };

		Shop.getShop();
		for(Shop s : sh) {
			s.showSangPums();
		}
		
		for(int i = 0; i < sh.length; i++) {
			sh[i].showSangPums();
		}
	}
}

