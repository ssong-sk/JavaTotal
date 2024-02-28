package j0114;

public class ArrInt { //0109 _ 10
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2, 3, 4, 5, 6, 7, 8};
		
		System.out.println("갯수 : " + arr.length);
		
		System.out.println("for문");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%5d",arr[i]);
		}
		
		System.out.println("\nfor each문");
		
		for(int a : arr) {
			System.out.printf("%5d", a);
		}

	}

}
