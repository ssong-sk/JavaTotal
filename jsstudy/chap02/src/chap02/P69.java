package chap02;

public class P69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 1;
		value += 1;
		System.out.println("값 = " + value);
		value -= 1;
		System.out.println("값 = " + value);
		value <<= 3;
		System.out.println("값 = " + value);
		value %= 3;
		System.out.println("값 = " + value); // 전체적으로 값이 왜 이렇게 나왔는지 이해불가...

		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne은" + plusOne + "입니다.");
		System.out.println("minusOne은" + minusOne + "입니다.");

		int x = 1, y = 1;
		System.out.println("x = " + x + ", ++x = " + ++x);
		System.out.println("y = " + y + ", y++ = " + y++);
		System.out.println("x = " + x + ", y = " + y);

	}

}
