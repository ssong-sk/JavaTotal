package day0109;

import java.util.Scanner;

public class QiuzTest_15 {

	public static void main(String[] args) {
		// 학생명과 점수를 입력 _ 몇명인지는 입력해 주는 만큼
		// 등수를 구한다
		// 입력해 준 데이터로 등수도 출력을 하고 합계 및 평균도 구하기


		//배열 변수 선언 (구해야하는 값에 대한)
		int inwon; //인원
		String [] name; //학생명
		int [] score; //점수
		int [] rank; // 등수

		int tot = 0; //총점
		double avg = 0; //평균

		//출력 입력
		Scanner in = new Scanner(System.in);

		System.out.println("인원수를 입력하시오");
		inwon = Integer.parseInt(in.nextLine()); //다음은 String 입력이므로 형 변형
		//"3" ==> 3으로 바꿔주는거나 마찬가지임 / 숫자다음에 문자를 또 써야하기 떄문에 형 변환


		//인원수만큼 배열로 할당
		name = new String[inwon]; //인원수에 맞게 할당됨
		score = new int[inwon]; // 점수
		rank = new int[inwon]; //랭크

		//인원수 만큼 데이터를 입력
		for(int i = 0; i < inwon; i++) { //길이는 inwon에 할당되어 있으므로 length는 쓰지 않음
			System.out.println(i + "번지 이름");
			name[i] = in.nextLine();
			System.out.println(i + "번지 점수");
			score[i] = Integer.parseInt(in.nextLine()); //형변환 "99" ==> 88이라는 숫자로 형 변환
			//그 다음 이름을 입력을 하기 위해서 형 변환해주기.

			//총점
			tot += score[i];

		}
		//비교하는것은 다중 for문 사용으로 비교 -> 랭크 로직은 하나를 더해서 입력
		//등수 구하기(다중 for)
		for(int i = 0; i < inwon; i++) {
			rank[i]=1; //현재값

			for(int j = 0; j < inwon; j++) { //비교값
				//비교 되는 대상이 점수가 더 높으면 i번지의 등수를 1증가 시키는 로직을 설정
				if(score[i] < score[j])
					rank[i] += 1; //비교하는 대상이 i보다 j값이 더 크면 1증가해서 등수를 더해줌.
			}
		}

		//계산(평균)
		avg = (double) tot / inwon;

		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("================================================");

		//출력
		for(int i = 0; i < inwon; i++) {
			System.out.println((i + 1) + "\t" + name[i] + "\t" + score[i] + "\t" + rank[i]);
		}
		System.out.println("------------------------------------------------");
		System.out.println("총점은 : " + tot);
		System.out.println("평균은 : " + avg);

	}

}
