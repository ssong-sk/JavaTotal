package Pro;

public class P119_3 {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	static int factorial(int z) {
		int r = 1;
		for (int i = z; i >= 1; i--) {
			r *= i;
		}
		return r;
	}

	static int factorial(int x, int y) {
		int r = 1;
		for (int i = x; i <= y; i++) {
			r *= i;
		}
		return r;
	}

}
