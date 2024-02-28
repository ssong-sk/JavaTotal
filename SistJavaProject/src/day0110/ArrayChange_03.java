package day0110;

public class ArrayChange_03 {

	public static void main(String[] args) {
		// 순서바꾸기 연습

		int a = 10, b = 20;
		System.out.println("a = " + a + ", b = " + b);

		int temp = a; // a를 temp에 대입 / 임시저장소같은 의미로 봄.
		a = b;
		b = temp; // 빗그릇을 통해서 a와 b가 바뀜 -> temp사용하면
		System.out.println("a = " + a + ", b = " + b); // a와 b의 값이 바뀜

		System.out.println("--------------------------------------------");

		int[] n = { 5, 8, 4 };

		for (int s : n) { // 배열에서만 foreach문 사용 가능!
			System.out.print(s + "  "); // / s : n에 배열 3개의 값을 다 넣어서 출력값이 나옴
			
		}
		System.out.println("\n0번이랑 2번을 교환 후 출력");
		
		int temp1 = n[0];
		n[0] = n[2];
		n[2] = temp1;
		
		for (int s : n) {
			System.out.print(s + "  ");
		}

	}

}
