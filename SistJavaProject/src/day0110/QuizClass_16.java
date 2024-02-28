package day0110;

class Mart { 
	
	private String sangpum;
	int su;
	int dan;
	static String SHOPNAME = "롯데마트"; //상수 선언 //static은 따로 생성해서 만들지 않고 사용 가능
	
	//sangpum은 메서드가 아니면 다른 클래스에서 접근불가
	
	public void setSangpum(String sa) {
		this.sangpum = sa;
	}
	
	public String getSangpum() {
		return sangpum;
	}
	
	
	//su, dan은 private이 아니므로 다른 클래스에서 생성시 변수 접근 가능하다
	//static은 다른 클래스에서 접근 시 클래스명. 변수명 으로 접근 가능하다
	
	
	/*private Mart( ) {
		
	}
	//생성
	
	public Mart(String sa, int s, int d, String sh) {
		sangpum = sa;
		SHOPNAME = sh;
		su = s;
		dan = d;
	}
	//setter
	
	public void setSangpum(String sa) {
		this.sangpum = sa;
	}
	public void setSu(int s) {
		this.su = s;
	}
	public void setDan(int d) {
		this.dan = d;
	}
	public void setShopname(String sh) {
		this.SHOPNAME = sh;
	}
	
	
	//getter
	public String getSangpum() {
		return sangpum;
	}
	public int getSu() {
		return su;
	}
	public int getDan() {
		return dan;
	}
	public String getShopname() {
		return SHOPNAME;
	} */
	
	
	
}


public class QuizClass_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mart m1 = new Mart();
		m1.setSangpum("초코파이");
		m1.su = 10;
		m1.dan =4500;
		
		
		Mart m2 = new Mart();
		m2.setSangpum("엄마손파이");
		m2.su = 5;
		m2.dan = 2500;
		
		System.out.println("** " + Mart.SHOPNAME + " 입고상품**");
		System.out.println("===================================");
		System.out.println("상품명 : " + m1.getSangpum());
		System.out.println("수량 : " + m1.su);
		System.out.println("가격 : " + m1.dan);
		System.out.println("===================================");
		System.out.println("상품명 : " + m2.getSangpum());
		System.out.println("수량 : " + m2.su);
		System.out.println("가격 : " + m2.dan);

	}

}
