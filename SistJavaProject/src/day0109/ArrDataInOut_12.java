package day0109;

import java.util.Scanner;

public class ArrDataInOut_12 {

	public static void main(String[] args) {
		// 어떠한 계열 변수값을 생성한 다음 입력 출력 가능
		// 배열 생성 후 생성한 만큼의 입력 출력
		
		Scanner in = new Scanner(System.in);
		
		int [] data; //data 배열
		data = new int[5]; // 5개 만큼 배열
		
		int sum = 0; //총 5개 합에 대한 변수
		
		//값 입력 / 입력하려는 배열변수만큼 입력
		for(int i = 0; i < data.length; i++) {
			System.out.print((i+1) + "번째값 : "); // 0부터 시작하기 때문에 +1을 입력하여 1번쨰값으로 나오게 출력
			data[i] = in.nextInt();
			sum += data[i];
		}
		//값 출력
		System.out.println();
		System.out.println("***입력값 확인*****");
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(i + "==> " + data[i]); //입력한 5개 값을 출력
		}
		System.out.println("==============================");
		System.out.println("총 합계는 : " + sum);
		
	
	}

}
