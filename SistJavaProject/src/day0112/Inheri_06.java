package day0112;

class Emart { //부모 클래스
	
	private String sangpum;
	private int su;
	
	
	//명시적
	public Emart() {
		//sangpum = "딸기";
		//su = 10;
		
		this("딸기",10); //초기화 호출해서 넣어주는 방법
	}
	
	public Emart(String sangpum, int su) {
		this.sangpum = sangpum;
		this.su = su;
				
	}
	
	public void writeMart() {
		System.out.println("상품명 : " + sangpum);
		System.out.println("수량 : " + su);
	}
	
}

class kangnamEmart extends Emart { //자식 클래스
	
	private int price;
	
	public kangnamEmart() {
		price = 10000;
	}
	
	public kangnamEmart(String sangpum, int su, int price) {
		super (sangpum, su);
		this.price = price;
	}
	
	//재정의 _ 오버라이딩해서 가져오기.
	@Override //확장.
		public void writeMart() {
			System.out.println("단가 : " + price);
			super.writeMart(); //순서는 상관 없다. 
		}


}

public class Inheri_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kangnamEmart kang1 = new kangnamEmart();
		kang1.writeMart();
		
		System.out.println();
		
		kangnamEmart kang2 = new kangnamEmart("수박", 2, 25000);
		kang2.writeMart();
		

	}

}
