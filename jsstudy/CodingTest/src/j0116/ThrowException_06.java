package j0116;

import java.util.Scanner;

class UserException extends Exception {
	
	public UserException(String msg) {
		super(msg); //상속 받아서 정식 메세지로 적용한것 super
	}
}

public class ThrowException_06 { //0116_03
	
	public static void process() throws UserException {
		Scanner in = new Scanner(System.in);
		int age = 0;
		
		//나이가 10~59가 아니면 UserException 강제 발생
		
		System.out.println("나이입력");
		age = in.nextInt();
		
		if(age <10 || age >= 60) {
			throw new UserException("우리 모임의 나이는 10~59세까지 입니다.");
		}
		else {
			System.out.println("당신은 " + age + "세 이므로 멤버 등록이 가능합니다." );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			process();
		} catch (UserException e) {
			// TODO Auto-generated catch block
			System.out.println("오류메세지 : " + e.getMessage());
		}
		System.out.println("****정상종료****");

	}

}
