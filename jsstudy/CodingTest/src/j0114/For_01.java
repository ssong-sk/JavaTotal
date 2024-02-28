package j0114;

public class For_01 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		
		while(i >= 0) {
			System.out.print(i-- + " ");
		}
		System.out.println();
		
		for(int a = 10; a >= 0; a--) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		for(int a = 1; a <= 10; a++) {
			System.out.printf(a + " ");
		}
		
		System.out.println();
		
		int c = 1;
		
		while(c <= 10) {
			System.out.printf(c++ + " "); //후의 증가
		}
		
		System.out.println();
		
		int d = 1;
		
		while(true) {
			System.out.println(d++);
			
			if(d <= 10)
				break;
		}
		
		System.out.println();
		
		for(int x = 1; x <= 10; x += 3) {
			System.out.print(x + " ");
		}

		System.out.println();
		
		for(int y = 5; y >= 1; y--) {
			System.out.print(y + " ");
		}
		
		System.out.println();
		
		int z = 5;
		
		while(z > 0)
			System.out.print(z-- + " ");
		
		System.out.println();
		
		int m = 1;
		for (m = 1; m <= 5; m++) {
			System.out.println("HelloJava  ");
		}
	}

}
