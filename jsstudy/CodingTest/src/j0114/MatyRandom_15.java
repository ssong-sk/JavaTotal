package j0114;

public class MatyRandom_15 {//0109_04

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("기본 랜덤수 5개 발생");

		for (int i = 1; i <= 5; i++) {
			double a = Math.random();
			System.out.println(a);
		}
		System.out.println("======================================================");

		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 10);
			System.out.print(a + " ");
		}
		System.out.println("\n======================================================");

		for (int i = 1; i <= 5; i++) {
			int a = (int) (Math.random() * 100);
			System.out.print(a + " ");
		}
		
		System.out.println("\n======================================================");
		
		for(int i = 1; i <= 5; i++) {
			int a = (int)(Math.random()*10+1);
			System.out.print(a + " ");
		}
		System.out.println("\n======================================================");
		
		for(int i = 1; i <= 10; i++) {
			int a = (int)(Math.random()*100+1);
			System.out.print(a + " ");
		}
			

	}

}
