package day0110;

class Ipgo { 
	private String sangName;
	private int Price;

	// 사과,2500 / 오렌지 4400

	// set메서드

	public void setName(String sangName) {
		this.sangName = sangName;

	}

	public void setPrice(int Price) {
		this.Price = Price;

	}

	// get메서드

	public String getName() {
		return sangName;
	}

	public int getPrice() {
		return Price;
	}
}

public class SangpumIpgo_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// setter 메서드를 이용해서 값 수정 사과값
		Ipgo tot1 = new Ipgo();
		tot1.setName("사과");
		tot1.setPrice(2500);

		// getter 메서드를 이용해서 값 얻기
		String name = tot1.getName();
		int price = tot1.getPrice();
 
		// setter 메서드를 이용해서 값 수정 오렌지값
		Ipgo tot2 = new Ipgo();
		tot2.setName("오렌지");
		tot2.setPrice(4400);

		String name1 = tot2.getName();
		int price1 = tot2.getPrice();
		
		//결과값 도출
		System.out.println(name + ", " + price);
		System.out.println(name1 + ", " + price1);

	}

}
