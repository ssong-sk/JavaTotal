package j0116;
//스레드의 개념
/*
 * 프로세스(process)란?
 * 단순히 실행 중인 프로그램 / 사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행 중인것!!!
 * 프로그램에 사용되는 데이터와 메모리 등의 자원 그리고 스레드로 구성됨!!!
 * 
 * 스레드(Thread)란?
 * 프로세스내에서 실제로 작업을 수행하는 주체를 의미
 * 모든 프로세스에는 한개 이상의 스레드가 존재하여 작업 수향
 * 
 * 멀티 스레딩(multi - threading) ?
 * 두개이상의 스레드를 가지는 프로세스를 멀티 스레드 프로세스라 함.
 * thread는 각 각 자신만의 작업 공간을 가짐 / 공유하는 자원
 * criticla section에 대해 동기적(순차적)인 구현이 없으면 오류 발생 => 동시에 구현할 경우 발생
 */

public class ExceptionReview_01 { //0116 _01

	public static void main(String[] args) {
		//Thread.sleep 사용방법

		System.out.println("안녕하세요!");
		System.out.println("3초 뒤에 저는 갑니다.");

		try {
			Thread.sleep(3000); //sleep 지정된 시간동안 현재 쓰드레를 일시중단.!!

		} catch (InterruptedException e) { //인터럽티드 익스셉션은 스드레 실행을 멈추고 종료하는것!!!!
			// TODO: handle exception
			e.printStackTrace(); //예외발생 당시의 호출스택(Call Stack)에 있었던 메소드의 정보와 예외 메시지를 화면에 출력
									//호출스택(Call Stack)이란 ??? 메소드 작업공간(메모리공간)
									//메소드가 호출되면 호출 스택에 메모리 할당, 종료되면 사용하던 메모리를 반환함
									//class -> main method -> sub method 순으로 호출되거나 반환할 경우 반대로 반환됨!!!
		}
		System.out.println("***나는 간다***"); //3초 뒤에 프린트값이 콘솔창에 나타남.

	}

}
