package chap02;

public class P65 {

	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1));
		System.out.println("x = " + x + ", y = " + y); // 쇼트서킷 연산자 실행 안함 즉, ||, &&이 있다.

		x = 0;
		y = 1;
		System.out.println((x < 1) | (y-- < 1));
		System.out.println("x = " + x + ", y = " + y); // 쇼트서킷 연산자 실행 함
	}
}
