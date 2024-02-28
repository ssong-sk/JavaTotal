package day0112;
/*
 * **디폴트 생성자로 생성**
 * 회사명 : 현대
 * 종류 : 전기차
 * 자동차명 : 아이오닉5
 * 색상 : 블랙
 * 가격 : 350000000원
 * 
 * **명시적 생성자로 생성**
 * 회사명 : 기아
 * 종류 : 가솔린
 * 자동차명 : 코나
 * 색상 : 화이트
 * 가격 : 250000000원
 */

//부모클래스

class Car {
	private String carConpany; // 제조회사
	private String carKind; // 종류

	// 디폴트 생성자
	public Car() {
		this("현대", "전기차");
		
		//carConpany = "현대"
		//carKind = "전기차"

	}

	// 명시적 생성자
	public Car(String conpany, String kind) {
		this.carConpany = conpany;
		this.carKind = kind;
	}

	// setter, getter
	public String getCarConpany() {
		return carConpany;
	}

	public void setCarConpany(String carConpany) {
		this.carConpany = carConpany;
	}

	public String getCarKind() {
		return carKind;
	}

	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}

	// 메서드
	public void writeCar() {
		System.out.println("회사명 : " + carConpany);
		System.out.println("종류 : " + carKind);
	}

	public void setCorColor(String string) {
		// TODO Auto-generated method stub
		
	}

}

class MyCar extends Car{ // 자식
	private String carName;
	private String corColor;
	private int carPrice;

	public MyCar() {
		super();
		carName = "아이오닉5";
		corColor = "블랙";
		carPrice = 350000000;

	}

	public MyCar(String conpany, String kind, String cname, String ccolor, int cprice) {
		super(conpany, kind);
		this.carName = cname;
		this.corColor = ccolor;
		this.carPrice = cprice;

	}
	// setter getter

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCorColor() {
		return corColor;
	}

	public void setCorColor(String corColor) {
		this.corColor = corColor;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	
	//오버라이딩
	@Override
		public void writeCar() {
			// TODO Auto-generated method stub
			super.writeCar();
			System.out.println("자동차명 : " + carName);
			System.out.println("색상 : " + corColor);
			System.out.println("가격 : " + carPrice);
		}

	
	
}

public class Inherit_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("**디폴트 생성자로 생성**");
		MyCar ca1 = new MyCar();
		ca1.writeCar();
		
		System.out.println();
		
		System.out.println("**명시적 생성자로 생성**");
		MyCar ca2 = new MyCar("기아", "가솔린", "코나", "화이트", 250000000);
		ca2.writeCar();
		
		System.out.println();
		
		System.out.println("**부모 메서드 출력**");
		Car c1 = new Car();
		c1.writeCar();
		

	}

}
