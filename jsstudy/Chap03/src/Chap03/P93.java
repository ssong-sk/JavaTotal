package Chap03;

public class P93 {

	public static void main(String[] args) {
		int row = 2;
		while (row < 10) {
			int column = 1;
			while (column < 10) {
				System.out.printf("%3d", row * column);

				column++;

			}
			System.out.println();

			row++;// 2단은 1~9까지 계산식이 계속 실행이 되어야 하므로 column 값이 10이되면 멈추고 다시 row로
					// 실행 되며 반복

		}
	}
}
