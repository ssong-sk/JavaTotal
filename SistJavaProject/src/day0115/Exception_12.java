package day0115;

public class Exception_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("프로그램 시작");
		try { //예외가 발생할수 있는 코드를 넣음
		int num = 3 / 0; //정수를 0으로 나누면 나오는 에러를 아리쓰메틱익셉션 에러가 발생(ArithmeticException)
		}catch (ArithmeticException e) {
			// 예외 처리 코드를 넣어줌.
			//e.printStackTrace(); //자세한 예외 정보에 관해 출력하는것 
			//e.getMessage(); //ArithmeticException 에 대한 간단한 정보
		}
		System.out.println("프로그램 종료");

	}

}
