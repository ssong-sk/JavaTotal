package j0114;

public class Book175_22 { //0109 _14

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] score = {84, 90, 96};
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / score.length; //길이가 3이니까 3나누기 하는것과 동일
		System.out.println("평균 : " + avg);
		System.out.println("평균 : " + ((double) sum / 3)); // 3 나누기...
		
	}

}
