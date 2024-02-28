package j0110;

import java.util.Scanner;

public class OperReView_01 { //0108

	public static void main(String[] args) {
		// import, 선언, 입력, 계산, 출력 순서
		
		Scanner in = new Scanner(System.in);
		
		String name;
		int kor, eng, mat;
		
		System.out.println("이름 입력");
		name = in.nextLine();
		System.out.println("국 영 수 점수");
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		
		double avg = (kor + eng + mat) / 3.0;
		
		System.out.println("3과목의 점수는 : " + kor + ", " + eng + ", " + mat);
		System.out.printf("평균은 : %.2f",avg);
		
		System.out.println("\n**합격조건 : 평균 60점 이상이고 각 과목 모두 40점 이상이면 합격**");
		System.out.println("=============================================================");
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
		
		String tot;
  
		tot = avg >= 80 ? "매우잘함" : 
			  avg >= 70 ? "잘하네" : "좀더 분발" ;
			  
			  System.out.println(avg + "점 평균으로 " + tot);
			
		
		
		
	}

}
