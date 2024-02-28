package day0112;
/*
 * 음식명
 * 가격
 */
class Food {
	
	private String foodName; //이름
	private int fPrice; //가격
	
	static int no;
	
	//명시적 생성자(2개)
	public Food(String fo, int fp) {
		this.foodName = fo;
		this.fPrice = fp;
	}
	
	//출력문
	
	public void foodData() {
		no++;
		System.out.println("[메뉴_" + no +"]");
		System.out.println("음식명 : " + this.foodName);
		System.out.println("가격 : " + this.fPrice);
		System.out.println("----------------------------------");
	}
	
}

public class ArrReview_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Food fo1 = new Food("마르게리타 피자", 12000);
		fo1.foodData();
		Food fo2 = new Food("까르보나라 스파게티", 15000);
		fo2.foodData();
		Food fo3 = new Food("리코타 샐러드", 9000);
		fo3.foodData();*/
		
		
		Food [] food = new Food[3];
		
		food[0] = new Food("마르게리타 피자", 12000);
		food[1] = new Food("까르보나라 스파게티", 15000);
		food[2] = new Food("리코타 샐러드", 9000);
		
		for(int i = 0; i < food.length; i++) {
			/*Food f = food[i];
			f.foodData();*/
			food[i].foodData();
		}
		for(Food f:food) {
			f.foodData();
		}
		
		

	}

}
