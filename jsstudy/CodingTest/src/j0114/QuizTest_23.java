package j0114;

import java.util.Scanner;

public class QuizTest_23 { //0109 _15

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int inwon; //인원
		String[] name; //이름
		int[] score; //점수
		int[] rank; //등수

		int tot = 0; //총점
		double avg = 0; //평균

		Scanner in = new Scanner(System.in);

		//출력
		System.out.println("인원수를 입력하세요.");
		inwon = Integer.parseInt(in.nextLine());

		//인원수 만큼 배열로 할당
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		for (int i = 0; i < inwon; i++) {
			System.out.println((i+1) + "번지 이름은");
			name[i] = in.nextLine();
			System.out.println((i+1) + "번지 점수는");
			score[i] = Integer.parseInt(in.nextLine());

			tot += score[i];

		}
		for (int i = 0; i < inwon; i++) {
			rank[i] = 1;

			for (int j = 0; j < inwon; j++) {
				if (score[i] < score[j]) {
					rank[i] += 1;
				}
			}
		}
		
		
		//계산
		avg = (double) tot / inwon;
		
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("------------------------------------------------------");
		
		//출력
		for(int i = 0; i < inwon; i++) {
			System.out.println((i+1) + "\t" + name[i] + "\t" + score[i] + "\t" + rank[i]);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("총점은 : " + tot);
		System.out.println("평균은 : " + avg);

	}

}
