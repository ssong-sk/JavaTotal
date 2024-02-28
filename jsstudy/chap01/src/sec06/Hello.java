package sec06;

public class Hello {

	public static void main(String[] args) {
		char var1 = '홍'; // 한글자만 가능 데이터절약을 위해서 사용하기도 함 (한글, 영문)
		String var2 = "여러글자"; // 여러글자 문자열 가능

		byte var3 = -128; // -128 +127 까지 입력 가능한 숫자 가능
		short var4 = -30000; // -32,768~32,767까지 숫자가 가능
		int var5 = 21332332; //
		long var6 = 495930430l; // 여러숫자의 입력 가능

		float var7 = 0.5f; // 소수점 선언 후 f 붙이기
		double var8 = 0.33d; //

		System.out.println(var1);
		System.out.println(var2);

		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);

		System.out.println(var7);
		System.out.println(var8);

	}
}
