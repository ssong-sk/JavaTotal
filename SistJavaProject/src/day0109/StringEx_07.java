package day0109;

public class StringEx_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("String 객체에 대한 멤버 메서드 익혀보기");
		
		String str1 = "apple"; //0~4까지 글자 갯수는 5개
		String str2 = "Apple";
		String str3 = "Have a Nice Day"; //공백도 글자 갯수 포함
		String str4 = "       Today now       ";
		
		System.out.println("str3의 길이 : " + str3.length()); //length() 괄호입력해줘야함. / 글자길이 나타내는 공식 
		System.out.println("str4의 길이 : " + str4.length()); //공백도 길이로 인식.
		
		System.out.println("앞 뒤 공백 제거 후 str4의 길이 : " + str4.trim().length());//공백을 잘못입력했을 때 공백 제거하려면 trim 사용
	                       //글자 사이의 공백은 제거가 되지 않고 앞 뒤 공백만 제거가 됨.
		System.out.println("*" + str4 + "*"); //trim을 사용하지 않았으므로 공백있는 앞 뒤에 문자열이 나타남.
		System.out.println("*" + str4.trim() + "*"); //trim 입력하면 앞뒤 공백 사라지고 다른 문자열이 나타남.
		
		System.out.println("str3에서 0번 문자 : " + str3.charAt(0)); //문자열의 번호를 입력하면 해당하는 문자열을 추출
		System.out.println("str3에서 0번 문자 : " + str3.charAt(7)); 
		
		System.out.println("str3에서 H의 인덱스 : " + str3.indexOf("H")); //문자열의 인덱스 번호를 나타내는 공식 'H' char로 추출을하므로 "도 사용가능
		System.out.println("str3에서 N의 인덱스 : " + str3.indexOf("N"));
		
		System.out.println("str3에서 Have 추출 : " + str3.substring(0, 4)); //문자열 추출 //원하는 범위만 추출 0부터 문자열 시작하지만 마지막범위는 +1을 더해줘야함.
		                                                                 //-> 읽을떄는 1부터 시작해서 읽혀지기 때문
		System.out.println("str3에서 Nice 추출 : " + str3.substring(7, 11));  //원하는 범위만 추출
		System.out.println("str3에서 Nice부터 끝까지 추출 : " + str3.substring(7)); //추출하고 싶은 곳부터 끝까지 추출
		
		
		//equlas는 같으면 true, 다르면 false
		System.out.println("문자열 비교 : " + str1.equals(str2)); // 이 메서드를 사용할 경우 영문 대소문자가 다르면 다르게 인식
		System.out.println("문자열 비교 : " + str1.equalsIgnoreCase(str2)); //이 메서드를 사용할경우 영문 대소문자 상관없이 같이 인식
		
		//a. compareTo(b)
		//a와 b가 같으면 0
		//a가 작을경우 -값(알파벳 차이만큼 마이너스 값) //오름, 내림차순을 로직을 통해서 작업
		//a가 클경우 +값(알파벳 차이만큼 플러스 값)
		System.out.println(str1.compareTo(str2)); //아스키코드 만큼 비교를 해서 추출됨. 오름,내림차순으로 크기를 정해줌
		System.out.println(str1.compareTo(str1)); //같으면 0이 출력
		System.out.println("computer".compareTo("commamd")); //com까지는 똑같기 떄문에 p와 m을 비교해서 출력이 됨.
		
	}

}
