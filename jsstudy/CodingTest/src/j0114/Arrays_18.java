package j0114;

public class Arrays_18 { //0109_08

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr, arr2;
		arr = new int[3];
		arr2 = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}System.out.println();
		
		System.out.println("===========================================");
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println((i+1) + "번쨰 : " + arr2[i]);
		}System.out.println();

		System.out.println("===========================================");
		
		for(int a1 : arr) {
			System.out.println(a1);
		}
		
		System.out.println("===========================================");
		for(int a2 : arr2) {
			System.out.println(a2);
		}
	}

}
