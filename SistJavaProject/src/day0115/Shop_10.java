package day0115;

public class Shop_10 {
	
	private String sangName;
	private int su, dan;
	
	
	//디폴트 생성자
	
	public Shop_10() {
		
	}
	
	//명시적 생성자
	
	public Shop_10(String sangName, int su, int dan) {
		this.sangName = sangName;
		this.su = su;
		this.dan = dan;
	}

	
	//getter setter
	
	public String getSangName() {
		return sangName;
	}

	public void setSangName(String sangName) {
		this.sangName = sangName;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	
	//총액
	public int getTot() {
		int s = this.su * this.dan;
		return s;
	}
	

	

}
