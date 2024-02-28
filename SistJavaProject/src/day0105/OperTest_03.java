package day0105;

public class OperTest_03 {

	public static void main(String[] args) {
		// 증감연산자  ++(증가), --(감소)
		
	
		int a,b;
		a = b = 5;
		
		//수식이 아닌것 단항 -> 단항일경우에는 증감연사자를 앞에 붙히나 뒤에 붙히나 같다
		
		++a;
		b++;
		
		System.out.println("a = " + a + ", b =" + b);
	
		//수식에서는 전치, 후치가 결과값이 틀리다
		
		int m, n;
		m = n = 0;
		
		a = b = 5; //재선언 가능 / 다시 5로 시작
		
		m = a++; //후치일 경우 먼저 대입 후 증가
		System.out.println("m = " + m + ", a = " + a);
		
		n = ++b; //전치일경우에는 먼저 증가 후 대입
		System.out.println("n = " + n + ", b = " + b);
		

	}

}
