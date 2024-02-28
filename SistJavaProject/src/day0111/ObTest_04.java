package day0111;

class MyCar {

	// 멤버변수 멤버클래스라고함 (기본 private 및 getter,setter 세팅된것)
	private String carName;
	private String carColor;
	private int carPrice;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	// 출력
	public void getCarInfo() { // static이 없으므로 인스턴스
		System.out.println("자동차명 : " + this.carName); // 변수 호출하는것 (this는 나자신)
		System.out.println("차량 가격 : " + this.carPrice);
		System.out.println("차량 색상 : " + this.carColor);
	}

}

public class ObTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCar car = new MyCar();
		car.setCarName("제네시스");
		car.setCarPrice(50000000);
		car.setCarColor("블랙");
		
		System.out.println("[나의 자동차 정보는]");
		car.getCarInfo(); //출력값
		
		System.out.println("[나의 세차 정보]"); //기존 값에서 다시 수정
		car.setCarName("그렌저");
		car.setCarPrice(2000000);
		car.setCarColor("화이트");
		car.getCarInfo();
		
	}

}
