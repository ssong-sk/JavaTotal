package day0109;

public class Arrays_08 {

	public static void main(String[] args) {
		// 배열 선언... 기본형 배열은 객체로 인식함. (자바에서 만드는 프로그램은 객체화하여 사용)
		// 

		int [] arr, arr2; //배열로 선언
		arr = new int[3]; //메모리 할당 / 주석값 3개를 적어야함.
		arr2 = new int[5]; //calss로 인식 / 할당만 해도 값은 자동으로 초기화 _ 0으로 초기화
		//-> 현재는 값을 입력 안했기 때문에 0

		//배열에 값을 넣는다
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println("배열의 길이 : " + arr.length); //배열형으로 넣기 //length는 배열에서 사용하면공간갯수, 기본 문자열에서는 사이즈,길이!!!!!!!!!!!!!!!!!!!!!

		for(int i = 0 ; i < arr.length; i++ ) {    //배열의 초기값은 무조건 0으로 넣기, 배열의 길이보다 작다고 표기 -> 고정값

			System.out.println(arr[i]);
		} System.out.println();
		/*System.out.println(arr[0]); //1번지
	    System.out.println(arr[1]); //2번지
	    System.out.println(arr[2]); //3번지*/ //하나하나 입력하지 않고 출력하는 부분은 반복되므로 반복문으로 정리해줌.

		System.out.println("=================================");	
		for(int i = 0 ; i < arr2.length; i++) {  

			System.out.println((i+1) + "번쨰 : " + arr2[i]);
		} 

		System.out.println("=================================");

		System.out.println("for~each문"); // for(자료형 변수명 : 배열명)

		for(int a1 : arr) { // 타입 타입명 : 배열선언 명
			System.out.println(a1);

		}
		System.out.println("=================================");
		for(int s : arr2) { // 타입 타입명 : 배열선언 명
			System.out.println(s);
		}
}

}
