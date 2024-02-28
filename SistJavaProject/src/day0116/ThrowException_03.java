package day0116;

import java.util.Scanner;

//강제예외발생 throw
class UserException extends Exception{ //상속을 통해서 익셉션을 받아서 사용
	
	public UserException(String msg) {
		super(msg); //입센션을 상속받아서 정식 메세지로 적용한것 => 입센션클래스 생성자를 통해 정식 메세지로 등록
		//조건을 맞지 않을경우 강제 예외 발생하기.
	}
	
}
////////////////////////////////////////
public class ThrowException_03 {
	//static 형성하면 생성안하고 단순 생성하려고 사용
	public static void process()  throws UserException{
		Scanner in = new Scanner(System.in);
		int age = 0;
		
		//나이가 10~59가 아니면 UserException 강제발생
		
		System.out.println("나이 입력");
		age = in.nextInt();
		
		if(age < 10 || age >= 60) { //범위에 해당안되는 if문........................
			throw new UserException("우리 모임의 나이는 10~ 59세 입니다.");
		}
		else {
			System.out.println("당신은 " + age + "세 이므로 멤버로 등록이 가능합니다.");
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
		System.out.println("**정상종료**");

	}

}
