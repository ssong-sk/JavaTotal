package j0114;

public class WhileTset_06 { //0108

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		
		while(n < 10) {
			n++;
			System.out.printf("%4d",n);
		}
		System.out.println();
		
		n = 0;
		
		while(n<10) {
			System.out.printf("%4d",++n);
		}
		
		System.out.println();
		
		n = 0;
		
		while(true) {
			System.out.printf("%4d",++n);
			
			if(n < 10)
				break;
		}
		
		
		n = 0;
		while(n <10) {
			n++;
			System.out.printf("%4d", n);
		}
	}

}
