package day0109;

public class ArrInt_10 {

	public static void main(String[] args) {
		// 배열 선언과 동시에 초기값 지정 할 수 있다
		
		int [] arr = {2, 3, 8, 7, 5, 4, 44, 67, 88};
		
		System.out.println("갯수 : " + arr.length); //배열 길이 구하기
		
		System.out.println("출력1_for");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%5d", arr[i]);
		}
		System.out.println("\n===========================================");
		
		System.out.println("출력2_foreach");
		
		for(int a : arr) { //a는 arr에 배열 순서대로 a에 대입
			System.out.printf("%5d", a);
		}
			

	}

}
