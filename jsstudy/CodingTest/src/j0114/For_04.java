package j0114;

public class For_04 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("for에서 빠져나와서 i를 입력하면 " + i);

		
		int a = 10;
		for(; a <= 50; a += 5) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("for에서 빠져나와서 a를 입력하면 " + a);
		
		
		for(int n = 1; n <= 10; n++) {
			if(n % 2 == 0) {
				System.out.print(n + " ");
			}
		}
		
		System.out.println();
		for(int n = 1; n <= 10; n++) {
			if(n % 2 != 0)
				continue;
			System.out.print(n + " ");
		}
		

	}

}
