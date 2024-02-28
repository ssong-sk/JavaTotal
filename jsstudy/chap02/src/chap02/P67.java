package chap02;

public class P67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%x\n", 0b0101 & 0b0011); // 왜 16진수는 x를 쓴것인지 의문
		System.out.printf("%x\n", 0b0101 | 0b0011);
		System.out.printf("%x\n", 0b0101 ^ 0b0011);
		System.out.printf("%x\n", (byte) ~0b00000001); // 32비트 단위로 연산해 원래는 ffffffffe를 출력하므로, 8비트만 출력하려고 변환??
		System.out.printf("%x\n", 0b0110 >> 2); // 나온결과값 이해안됨
		System.out.printf("%x\n", 0b0110 << 2); // 나온결과값 이해안됨

		int i1 = -10;
		int i2 = i1 >> 1; // -10을 2로 나눈 결과와 같다.
		int i3 = i1 >>> 1;//
		System.out.printf("%x -> %d\n", i1, i1);
		System.out.printf("%x -> %d\n", i2, i2);
		System.out.printf("%x -> %d\n", i3, i3); // 16진수와 10진수로 출력
	}

}
