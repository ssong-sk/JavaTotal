package day0111;

class Shop {
	private String sangpum;
	private int price;
	private String sangColor;
	
	public Shop(String s, int p, String c) {
		sangpum = s;
		price = p;
		sangColor = c;
	}
	
	//제목
	
	public static void showTilte() {
		System.out.println("상품명\t가격\t색상");
		System.out.println("------------------------------");
	}
	
	//메서드 출력 / 생성한 갯수만큼 출력
	
	public void showShop() {
		System.out.println(sangpum + "\t" + price + "\t" + sangColor);
	}
}

public class ArrObTest_11 {

	public static void main(String[] args) {
		// 4개 생성해서 출력할것
		
		
		//4개의 배열변수 선언 (방법1)
		Shop[] s1 = new Shop [4];
		s1[0] = new Shop("컴퓨터",100000 , "화이트");
		s1[1] = new Shop("아이패드", 800000, "실버");
		s1[2] = new Shop("갤럭시워치", 25000, "블랙");
		s1[3] = new Shop("노트북", 80750, "블랙&화이트");
		
		
		
		//선언과 동시에 출력 (방법2)
		/*Shop[] s1 = { new Shop("컴퓨터",100000 , "화이트"),
				new Shop("아이패드", 800000, "실버"),
				new Shop("갤럭시워치", 25000, "블랙"),
				new Shop("노트북", 80750, "블랙&화이트")
		};*/
		
		Shop.showTilte(); //제목출력
		
		
		//for문으로 배열 출력
		for(int i = 0; i < s1.length; i++) {
			s1[i].showShop();
			System.out.println("--------------------------");
		}
		
		//for each문으로 배열 출력
		for(Shop s2 : s1) { //s2는 변수명 지정해주기. // 불러올 클래스명과 배열변수 선언한 명칭쓰기...  불러올 클래스명 변수명지정 : 배열변수선언한 명
			s2.showShop();
		}
	

		
	}

}
