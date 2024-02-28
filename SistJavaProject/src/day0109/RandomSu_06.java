package day0109;

import java.util.Scanner;

public class RandomSu_06 {

	public static void main(String[] args) {
		// 1~10 사이의 랜덤수를 발생시켜 그 숫자 맞추기


		Scanner in = new Scanner(System.in); //입력받아야하기 때문에 출력값 추출

		int rnd = (int)(Math.random()*10)+1; //랜덤 메서드 형성 //클래스 // 숫자 관련된 함수
		int su; //입력할 수 
		int cnt = 0; //횟수 구하는 변수

		while(true) {//반복으로 실행할것
			cnt++; //횟수더하기 
			System.out.print(cnt + "회 : ");
			su = in.nextInt();

			if(su > rnd) //입력값 su 보다 랜덤 메서드 값이 작다
				System.out.println(su + "보다 작습니다.");
			else if(su < rnd) //입력값 su 보다 랜덤 메서드 값이 크다
				System.out.println(su + "보다 큽니다."); 
			else { // su값과 랜덤메서드 값이 같을 때
				System.out.println("맞습니다 ~~ 정답은 " + rnd + "입니다.");
				break; //조건이 따로 없으므로 브레이크문 걸어둠.
			}
				
		} System.out.println("종료!");


	}

}
