package day0104;

public class DataType_06 {

	public static void main(String[] args) {
		// 기본 자료형 8개
		
		boolean flag = false;   // 1.논리형 true, false
		
		
		char ch = '가';  // 2. 문자형
		                // 반드시 하나의 문자, 16바이트 유니코드값 표현
		                // 2바이트 문자하나 
		                //기본적으로 정수형, 아스키코드로 변경 가능
		                //''로 표현
		
		//3. 정수형
		byte a = 127; //1바이트 범위 -128~127
		short b = 32000; //16bit 
		int c = 6700000; //32bit
		long d = 39405050440400L; //64bit 뒤에 L, l을 붙여야 long인지 int인지 의미할 수 있음
		
		
		
		//4.실수형 (정수와 실수가 비트가 같으면 실수가 더 큼)
		
		float f = 3.123454f; //32bit 뒤에 f를 붙히지않은면 double의미
		double dou = 4.6445444; //64bit
		
		
		//출력
		
		System.out.println("flag = " + flag);
		System.out.println("문자형 ch = " + ch);
		
		System.out.println("정수형 a = " + a);
		System.out.println("정수형 b = " + b);
		System.out.println("정수형 c = " + c);
		System.out.println("정수형 d = " + d);
		
		System.out.println("실수형 f = " + f);
		System.out.println("실수형 dou = " + dou);
	
		
		//var은 변수값에 맞게 변수타입이 자동으로 대입되서 출력이됨.
	}

}
