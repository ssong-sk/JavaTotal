package j0114;

public class For_03 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 5; i <= 50; i += 5) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int x = 1; x <= 20; x++) {
			if(x % 5 == 0) {
				continue;
				
			}
			System.out.print(x + " ");
		}
		
		System.out.println();
		for(int i = 7; i <= 60; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 1) {
				continue;
			}
			System.out.print(i + "  ");
		}

	}

}
