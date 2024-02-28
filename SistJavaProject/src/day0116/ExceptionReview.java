package day0116;

public class ExceptionReview {

	public static void main(String[] args) {
		// 
		
		System.out.println("안녕하세요..");
		System.out.println("5초 뒤에 저는 갑니다.");
		
		try {
			Thread.sleep(5000); //5초 뒤에 그다음 문장이 뜸...!!!!
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("***잘가***"); //5초뒤에 잘가라는 문구가 표기

	}

}
