package j0114;

public class ForStar_13 { //0109

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**다중 for문으로 star(*) 출력하기**");
		
		for(int i = 1; i <= 5 ; i++) {
			for(int j = 1; j <=5; j++) {
				System.out.print("*");
				
			}System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 5; i++) { //이해가 가지않음..........................
			// 
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			// 
			for(int j = i; j <= 5; j++) {
				// j = 1 ; 1 <= 5 ; i++
				// j = 1,2,3,4,5
				
				// j =2 ; 2 <= 5 ; i ++
				// J = 2,3,4,5
				
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		
		String y = "*";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(y);  // i = 1 , 1 개  / i = 2, 2개  / i=3 , 3개 /  i=4 , 4개  / 
			y = y + "*";            //       1->2개  / 2->3개      /    3->4개 /    4->5개
			
			System.out.println(i+"값 -- 증감확인 : " + y);
		}
		
	}

}
