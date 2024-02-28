package day0109;

public class Book175_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 변수 선언과 배열 대입
		int[] score = { 84, 90, 96};
		
		//배열 항목의 총합 구하기
		int sum = 0;
		for(int i = 0; i < score.length; i++ ) {
			sum += score[i];
		}System.out.println("총합 : " + sum);
		
		//배열 항목의 평균 구하기
		double avg = (double) sum / score.length;
		System.out.println("평균 : " + avg); //평균 구하는 공식을 따로 변수를 정해서 입력
		System.out.println("평균 : " + ((double) sum / score.length)); // 출력값에 한번에 계산식까지 적용
		
		//배열 단점 : 4개가 지정이 되면 추가 삭제가 안됨. (배열은 단순계산에서만 사용) /
	
	}

}
