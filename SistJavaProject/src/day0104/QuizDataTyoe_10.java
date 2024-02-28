package day0104;

public class QuizDataTyoe_10 {

	public static void main(String[] args) {
		// 변수는 args를 이용할것
		/*
		 * 학생명 : 김선호 님
		 * 지역 : 부산
		 * 나이 : 23 세
		 * 
		 * ===================================================
		 * 김선호님의 자바 점수는 88점 오라클 점수는 77점 총 165점 입니다.
		 */
		
		
		String x = args[0];
		String y = args[1];
		String z = args[2]; //나이는 int로도 사용가능
		
		System.out.printf("학생명 : %s 님\n지역 : %s\n나이 : %s",x,y,z);
		System.out.println("\n================================================");
		
		//8개 자료형과 String 참조형이 다르기 때문에 클래스 타입을 변환해서 int를 변수해서 사용해야함.
		//형변환 알아두기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int s1 = Integer.parseInt(args[3]);
		int s2 = Integer.parseInt(args[4]);
		int result = s1 + s2;
		
		System.out.printf("%s님의 자바 점수는 %d점 오라클 점수는 %d점 총 %s점 입니다. ",x,s1,s2,result);
		

	}

}
