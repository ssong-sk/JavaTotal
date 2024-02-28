package day0109;

public class ArrString_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 배열
		String [] str1 = {"텀블러", "키보드", "핸드크림", "칫솔", "우산"};
		String [] strColors = {"red", "pink", "blue", "yellow", "gray", "white"};
		
		//str1은 1번째 : 텀블러 출력
		
		System.out.println("출력1 _ for");
		for(int i = 0; i < str1.length; i++) {
			System.out.println("str1은 " + (i+1) + "번째 : " + str1[i]);
		}
		System.out.println("==============================");
		System.out.println("출력1 _ foreach");
		for(String a1 : str1) {
			System.out.println(a1);
		}
		System.out.println("==============================");
		//strColors는 0번지색 : red 출력
		
		System.out.println("출력1 _ for");
		for(int i = 0; i < strColors.length; i++) {
			System.out.println("strColors은 " + (i+1) + "번째 : " + strColors[i]);
		}
		System.out.println("==============================");
		
		System.out.println("출력1 _ foreach");
		for(String cols : strColors) {
			System.out.println(cols);
		}
		

	}

}
