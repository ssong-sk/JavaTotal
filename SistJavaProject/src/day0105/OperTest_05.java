package day0105;

public class OperTest_05 {

	public static void main(String[] args) {
		//  비교연산자 (=관계연산자) >, <, >=, <=, !=, ==
		// 논리연산자 &&(AND 두개 다), || (OR 둘중 하나), !(NOT 부정의 결과)
		
		
		int a = 5, b = 3, c = 5;
		
		//결과값 true, false
		
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(!(a == b));
		System.out.println(a != b);
		System.out.println(a > b && b > c); // true&&false = false
		System.out.println(a > b || b > c); // true||false = true
		
		
		
		boolean bool = false;
		
		System.out.println("a = " + bool);
		System.out.println("b = " + !bool);
		
		boolean bool2 = 5 > 3;
		
		System.out.println("c = " + bool2);
		System.out.println("d = " + !bool2);
		System.out.println("e = " + !(5>3)); //숫자는 괄호로 하여 사용
	}

}
