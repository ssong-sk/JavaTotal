package j0115;

public class ArrayChange_06 { //0110 _03

	public static void main(String[] args) {
		// 순서바꾸기

		int a = 10;
		int b = 20;
		System.out.println("a = " + a + ", b = " + b);

		int temp = a; //temp를 a에 넣음 / temp는 임시저장소 같은 의미로 봄..!!!
		a = b; // a를 b에 넣음
		b = temp; // b를 temp에 넣음

		System.out.println("a = " + a + ", b = " + b + ", temp = " + temp);

		System.out.println("=======================================");

		int[] n = {5, 8, 4};

		for (int s : n) {
			System.out.print(s + " ");

		}
		System.out.println();
		System.out.println("0번이랑 2번을 교환 후 출력");

		int temp1 = n[0];
		n[0] = n[2];
		n[2] = temp1;

		for (int s : n) {
			System.out.print(s + " ");
		}
	}

}
