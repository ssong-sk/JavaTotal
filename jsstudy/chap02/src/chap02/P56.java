package chap02;

public class P56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double d;
		byte b;

		i = 7 / 4;
		System.out.println(i);
		d = 7 / 4;
		System.out.println(d); // 소수점이 없으므로 1로 표기가 되지만 더블은 기본값 0.0이기 떄문에 1.0으로 표기됨
		d = 7 / (double) 4;
		System.out.println(d);

		// i = 7 / (double) 4; 타입 불일치로 오류 발생됨

		i = 300;
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		else
			b = (byte) i;

	}

}
