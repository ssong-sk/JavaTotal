package day0116;

public class ExceptionRiveiw_02 {
	
	public static void process() {
		int [] arr = {1,3,9,7};
		
		for(int i =0 ; i < arr.length; i++) {
			try {
			System.out.println(arr[i]);
			}catch (Exception e) {
				System.out.println("오류메세지 1 : " + e.getMessage());
			}
		}
	}
/////////////////////////////////////////////////////////
	
	//throws : 던지다
	//익셉션 처리를 직접 하지 않고 호출하는 곳으로 해당 인셉션을 던진다.
	//그러므로 try catch 사용  안함
	public static void process2() throws NumberFormatException {
		String a = "12a";
		String b = "30";
		int sum = 0;
		
		sum = Integer.parseInt(a) + Integer.parseInt(b); //넘버포맷입센션으로 강제적으로 사용
		System.out.println("두 수의 합은 " + sum);
		
	}
////////////////////////////////////////////////////
	public static void main(String[] args) {
		process();
		
		try { //출력문에서 try catch를 사용 (throws를 사용하여 인셉션을 던져줄 경우 이렇게 사용)
		process2();
		} catch (NumberFormatException e) {
			System.out.println("예외처리를 메인에서 했어요. " + e.getMessage());
		}
		
		System.out.println("***정상 종료***"); //위에 출력에서 예외처리를 해서 정상적으로 진행되면 정상종료가 발생하면 오류없이 완료

	}

}
