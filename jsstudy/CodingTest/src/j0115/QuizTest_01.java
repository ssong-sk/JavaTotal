package j0115;

import java.util.Scanner;

public class QuizTest_01 { //0109_15

	public static void main(String[] args) {
		// 학생명과 점수를 입력 _ 몇명인지는 입력해 주는 만큼
		//등수를 구한다
		//입력해준 데이터로 등수도 출력하고 합계 및 평균도 하기
		//인원 입력, 학생명, 점수, 등수..... 합계 및 평균

		//배열변수 선언
		int inwon; //인원
		String[] name; //학생명
		int[] score; //점수
		int[] rank; //등수

		int sum = 0; //총점
		double avg = 0; //평균

		//출력입력
		Scanner in = new Scanner(System.in);

		System.out.println("인원수 입력");
		inwon = Integer.parseInt(in.nextLine()); //그다음 string이므로 형변환.

		//인원수 만큼 할당
		name = new String[inwon]; // new 타입[입력]
		score = new int[inwon];
		rank = new int[inwon];

		//인원수 만큼 데이터 입력
		for (int i = 0; i < inwon; i++) {
			System.out.println((i + 1) + "번지 이름");
			name[i] = in.nextLine();
			System.out.println((i + 1) + "번지 점수");
			score[i] = Integer.parseInt(in.nextLine());

			//총점
			sum += score[i];
		}

		for (int i = 0; i < inwon; i++) {
			rank[i] = 1; //현재값
			for (int j = 0; j < inwon; j++) { //비교 되는 대상이 점수가 더 높으면 i번지이 1증가 되는 로직 / i가 j보다 작으면 1증가
				if (score[i] < score[j])
					rank[i] += 1; //비교하는 대상이 i보다 j값이 더 크면 1증가해서 등수를 더해줌.
			}
		}

		//평균
		avg = (double) sum / inwon;

		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("----------------------------------");

		//출력
		for (int i = 0; i < inwon; i++) {
			System.out.println((i + 1) + "\t" + name[i] + "\t" + score[i] + "\t" + rank[i]);
		}
		System.out.println("----------------------------------");
		System.out.println("총점은 : " + sum);
		System.out.println("평균은 : " + avg);

	}

	public void test1() {

		//변수 선언
		int inwon;
		String[] name;
		int[] score;
		int[] rank;

		int sum = 0;
		double avg = 0;

		//인원입력

		Scanner in = new Scanner(System.in);
		System.out.println("인원입력");
		inwon = Integer.parseInt(in.next());

		//인원수 배열
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		//이름 및 점수 입력
		for (int i = 0; i < inwon; i++) {
			System.out.println((i + 1) + "이름입력");
			name[i] = in.nextLine();
			System.out.println((i + 1) + "점수입력");
			score[i] = in.nextInt();

			//총점

			sum += score[i];

		}

		//등수

		for (int i = 0; i < inwon; i++) {
			rank[i] = 1;
			for(int j = 0; j < inwon; j++) {
				if(score[i] < score[j]) {
					rank[i] += 1;
				}
			}

		}
		
		//계산
		avg = (double) sum / inwon;
		
		System.out.println();

	}

}
