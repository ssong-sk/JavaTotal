package j0115;

public class ArrChangeData_07 { //0110_04

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4, 14, 24, 34, 94, 64, 74, 99, 44};
		
		System.out.println("**원데이터 출력**");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("**거꾸로 출력**");
		
		//공식
		for(int i = 0; i < arr.length / 2; i++) { //반만 돌릴려고 하면 나누기 2를 해주면 된다.
          int temp = arr[0];
          arr[i] = arr[arr.length - 1 - i];
          arr[arr.length - 1 - i] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

}
