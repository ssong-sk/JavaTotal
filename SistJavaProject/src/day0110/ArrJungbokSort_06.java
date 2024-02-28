package day0110;

import java.util.Arrays;

public class ArrJungbokSort_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중보처리 로직을 만들기 위해서느 0번지는 비교 없음 / 1번지는 0번지 / 2번지는 0번지 1번지 ........식으로 나옴

		int[] lotto = new int[6];

		// 임의의 수를 로또라는 변수에다가 발생시켜 넣어준다.

		for (int i = 0; i < lotto.length; i++) { // 기준값
			// 1~45의 랜덤수 발생
			lotto[i] = (int) (Math.random() * 45) + 1;

			// 중복이 되면 안되므로 중복처리해줘야함. -> 비교하는 데이터
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; // 빼줘야지 같은 데이터가 나오면은 감소
					break; // i++로 이동
				}
			}

		}
		// 오름차순 정렬
		// Arrays.sort(lotto);

		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) { // 커야지 바꾸는것
					int temp = lotto[i]; // 바꾸기 위한 빈그릇의 시작은 temp....
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		// 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%5d", lotto[i]);
		}
		System.out.println();

	}
}
