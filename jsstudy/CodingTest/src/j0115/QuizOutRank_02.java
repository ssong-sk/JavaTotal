package j0115;

public class QuizOutRank_02 { //0109 _16

	public static void main(String[] args) {
		// 
		
		String [] name = {"강동원", "이동욱", "서강준", "김남길"};
		int [] kor = {90, 80, 95, 87};
		int [] eng = {95, 90, 83, 79};
		int [] mat = {76, 85, 79, 97};
		int [] sum = new int [4];
		double [] avg = new double [4];
		int [] rank = new int [4];
		
		System.out.println("각 학생들의 점수에 대한 총점 평균 등수를 구하여 출력하세요");
		
		for(int i = 0; i < name.length; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
			avg[i] = sum[i] / 3.0;
		}
		
		//등수
		for(int i = 0; i < name.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < name.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i] += 1;
				}
			}
		}
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
	    System.out.println("------------------------------------------------");
	    
	    for(int i = 0; i < name.length; i++) {
	    	System.out.println((i+1) + "\t" + name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] +
	    			"\t" + sum[i] + "\t" + avg[i] + "\t" + rank[i]);
	    }


	}

}
