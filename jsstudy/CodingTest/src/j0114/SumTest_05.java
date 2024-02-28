package j0114;

public class SumTest_05 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("총 합은 " + sum);
		
		
		
		System.out.println();
		
		int n = 1;
		int tot = 0;
		
		while(n <= 10) {
			tot += n;
			n++;
		} 
		
		System.out.println("총 합은 " + tot);
		
		System.out.println("for문으로 1~10까지 2씩 증가할 경우의 합계를 구하시오");
		
		int z = 0;
		for(int a = 0; a <= 10; a += 2) {
			z += a;
		}
		System.out.println("총합은  " + z);

		
	}

}
