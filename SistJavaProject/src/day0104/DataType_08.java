package day0104;

public class DataType_08 {

	public static void main(String[] args) {
		// 묵시적형변환(=암묵적형변환) 은 자동으로 결정되는 타입
		// String + int = String
		// double + int = double
		// iong + short = long
		// char + int = int 
		
		char a = 'A'; // char는 내부적으로 아스키코드 값으로 인식
		
		System.out.println(a+32); // 대문자 A는 65의 아스키코드를 가지고 있음
		System.out.println("Happy" + 5 + 6);
		System.out.println("Happy" + (5 + 6)); //괄호안부터 먼저 더해진 후 문자열로 합산됨
		System.out.println('A'+3); //A의 아스키값은 65
		System.out.println(2+'b');
		System.out.println('a'+'b');
		
	}

}
