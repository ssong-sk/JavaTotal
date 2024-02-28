package j0114;

public class DoWhile_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1;
		
		System.out.println("**while문 결과");
		
		while(n<5) {
			System.out.print(n++);
		}
		
		
		System.out.println();
		n = 1;
		
		do {
			System.out.print(n++);
		}
		while(n >= 5); //1은 5보다 작으므로 다시 돌지 않음....

	}

}
