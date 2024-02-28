package j0114;

public class QuizForWhile_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();
		test2();
		test3();
		test4();
		

	}
	
	public static void test1() {
		//문제 1~100까지의 3의 배수 갯수
		
		int n = 1;
		int sum = 0;
		
		while(true) {
			
			n++;
			
			if(n % 4 ==0) {
				sum++;
			}
			
			if(n == 1000) {
				break;
			}
		}System.out.println("4의 배수의 객수는 " + sum);
		
		
	}
	
	public static void test2() {
		//1~100까지의 짝구합 구하기
		
		int i = 0;
		int tot = 0;
		
		while(true) {
			i++;
			
			if(i % 2 == 0) {
				tot += i;
			}
			if(i == 100) {
				break;
			}
		}System.out.println("1~100까지 짝수합은 : " + tot);
		
		
	}
	
	public static void test3() {
		//1~100 홀수합
		
		int x = 0;
		int result = 0;
		
		while(true) {
			x++;
			
			if(x % 2 == 1) {
				result += x;
			}
			if(x == 100) {
				break;
			}
		}System.out.println("1~100까지 홀수합은 : " + result);
	
	}
	
	public static void test4() {
		
		int sum = 0;
		for(int i = 1; i <= 100; i += 2) {
			sum += i;
		}System.out.println(sum);
	}

}
