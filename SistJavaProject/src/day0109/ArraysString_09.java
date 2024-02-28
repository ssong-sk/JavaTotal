package day0109;

public class ArraysString_09 {

	public static void main(String[] args) {
		// String 배열
		
		//배열선언
		String [] str;
		str = new String[4];
		
		//초기화
		str[0] = "김구라";
		str[1] = "유재석";
		str[2] = "하하";
		str[3] = "이광수";
		
		//출력
		System.out.println("출력1_ for");
		
		for(int i = 0; i < str.length; i++){
			System.out.println(i + ":" + str[1]); //str[1]이 고정되어 있어서 i값의 숫자만 변경되고 유재석은 계속 출력이 됨.
		}
		System.out.println("==============================================");
		
		System.out.println("출력1_ foreach");
		
		for(String s:str) {
			System.out.println(s);
		}
	}

}
