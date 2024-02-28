package day0115;

import java.util.Scanner;

//throws - 호출한 영역으로 예외처리를 던짐
//throw - 강제로 예외를 발생시킬 떄

public class Throws_15 {

	public static void scoreInput() throws Exception { //발생하는 곳에서 
		Scanner in = new Scanner(System.in);
		int score;

		//점수가 1~100사이가 아니면 익셉션을 강제 발생
		System.out.println("점수를 입력하세요");
		score = in.nextInt();

		if (score < 0 || score > 100) {
			throw new Exception("점수가 잘못 입력되었습니다.");
		}
		else {
			System.out.println("나의 점수는 : " + score + "점 입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			scoreInput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("오류 메세지 : " + e.getMessage()); //오류가 정상적으로 청리되었는지확인하려면 겟메세지를 넣어줌.
			
		}
		System.out.println("정상종료");

	}

}
