package j0116;

//예외처리
/*컴파일러 오류 : 프로그램 코드 작성 중 발생하는 문법적 오류
 * 실행오류 (runtime error) : 실행 중인 프로그램이 의도하지 않은 동작을 하거나 프로그램이 중지 되는 오류
 * 
 * 중요성*******************
 * 1. 비정상종료를 피해 시스템이 원할하게 실행되도록 함.
 * 2. 오류과정을 재현하는 것은 현실적 불가능
 * 3. 오류발생시 log를 남겨서 log 분석을 통해 오류 원인 파악 및 버그 수정
 * 
 * 시스템오류는 처리할 수 없는 오류 / 예외(Exception)은 프로그램에서 제어할 수 있는 오류
 * 
 * 예외 클래스(class Exception) : 모든 예외 클래스의 최상위 /클래스는 exception 클래스 이며 다양한 예외 처리를 위한 클래스 제공
 * 
 * 
 * 대표적 예외 처리
 * interruptedexception _  non-runnable 상태인 thread.sleep(),join(),wait()을 runnable 하게 만드는 경우
 */
/////////////////////////////////////////////////////////////////////////////////////////

/*try = catch문 : 예외처리를 위한 기본 구조******************************
 * try 블록에는 예외발생 가능 코드가 위치
 * catch 코드에 오류가 발생되면 오류종류(예외클래스)에 맞는 catch문으로 가서 catch 블록안에 있는 코드 실장.
 * ==>만약 오류가 발생하지 않으면 catch문 실행 안함.
 * catch 예외클래스 타입과 변수 e가 선언되어 있음.
 * 
 * try - catch - finally문  : 어떤 예외가 발생하더라도 반드시 실행되어야 하는 부분이 있으면 finally문으로 처리 가능******
 * try 문장 수행 중 예외 발생 여부에 상관없이 무조건 실행하게 해줌.
 * 예외가 발생하지 않으면 try - finally순으로 실행
 * 
 * 멀티 catch문 : 여러 catch블럭을 | 기호를 통해서 하나의 catch 블럭으로 합칠 수 있음******************************
 * 연달아 나열되는 중복코드 줄일 수 있음
 * 예외 클래스 제한 없음.
 * 각 예외마다 세세하게 제어하고 싶다면 if(e instanceOf) 연산자로 하나하나 분기하며 처리!!!
 * 
 * 
 * 
 * exception 변수 클래스 타입 이고 e는 변수 
 * 1.printStackTrace() : 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력.
 * 2.getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻는것.
 *****인스턴스란? 어떤 클래스에 속하는 각각의 객체 (new생성자)
 * 
 * 
 * **************예외를 강제로 발생시키는 것 throw ************************
 * 코드를 작성하여 강제로 예외 발생
 * =>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>throw new 발생시킬 예외;
 * 
 * ****************예외를 상위쪽으로 미루어 처리 throws *************************
 * 예외를 상위쪽으로 미루면 시간낭비를 줄일 수 있음
 * =>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>만들어진 메소드 throws 발생할 예외{} / 메소드에 throws 발생예외를 추가적으로 적어줌.
 */
public class ExceptionRiview_05 { //0116_02

	public static void process() {

		int[] arr = {1, 3, 9, 7};

		for (int i = 0; i < arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println("오류 메세지1 : " + e.getMessage());
			}

		}
	}
	///////////////////////////////////////////////////////
	public static void process2() throws NumberFormatException {
		//NumberFormatException 숫자로 바꿀 수 없는 문자열을 숫잘 변환하려 할떄 발생
		String a = "12a";
		String b = "30";
		int sum = 0;

		sum = Integer.parseInt(a) + Integer.parseInt(b); //넘버포멧익셉션 강제적으로 변환하려고 사용
		System.out.println("두 수의 합은 " + sum);

	}
	/////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process(); //출력만 불러옴.

		try {
			process2();

		} catch (NumberFormatException e) {
			System.out.println("예외 처리를 메인에서 했어요. " + e.getMessage());
		}
		System.out.println("***정상종료***");

	}

}
