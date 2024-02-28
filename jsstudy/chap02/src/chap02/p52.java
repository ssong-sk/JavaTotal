package chap02;

public class p52 {
	public static void main(String[] args) {
		char ga1 = '가';
		char ga2 = '\uac00';

		boolean cham = true;
		boolean geojit = false;

		System.out.println(ga1);
		System.out.println((int) ga1); // int정수 타입으로 변환
		System.out.println(ga2); // 왜 결과값이 가 가 나온이유는???????
		System.out.println(++ga2); // ++은 1만큼 증가
		System.out.println(cham + "가 아니면" + geojit + " 입니다.");

	}

}
