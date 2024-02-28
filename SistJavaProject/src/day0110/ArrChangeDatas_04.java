package day0110;

public class ArrChangeDatas_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 14, 44, 7, 17, 77, 5, 9, 99, 10 };

		System.out.println("**원데이터**");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n-----------------------------------------");

		System.out.println("**거꾸로 변경하기**");

		// 공식
		for (int i = 0; i < arr.length / 2; i++) { // arr.length/2 반만 돌리면은 /2를 써주면 됨.
			//횟수를 for문 만큼 돌릴 필요는 없고 배열의 절반만 돌리면 되므로 /2로 해서 반만 반복해주면 됨.
			int temp = arr[0];
			arr[i] = arr[arr.length - 1 - i];// 10개일때 0하고 9번하고 바꾸는 것 /
			/*
			 * 0하고 9번 바꾸기 1하고 8번 2하고 7번 3하고 6
			 * 
			 */
			arr[arr.length - 1 - i] = temp;
		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println("\n-----------------------------------------");
		
		System.out.println("**오름차순 정렬**");
		// 가장 작은 숫자 앞으로 보내기(선택정렬)
		// Arrays.sort(arr); 배열 arr을 정렬한다라는 뜻

		// 기준데이터는 0부터 끝에서 두번째 까지
		for (int i = 0; i < arr.length - 1; i++) {
			// (중첩 for문을 쓰는 이유는 비교하는 데이터가 있을 떄 사용 // 비교하는 데이터는 기준 다음값부터 끝까지)
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i]; // 바꾸기 위한 빈그릇의 시작은 temp....
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n-----------------------------------------");

	}
}