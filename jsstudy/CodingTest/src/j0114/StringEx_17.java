package j0114;

public class StringEx_17 { //0109 _ 07

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String 객체에 대한 멤버 메서드 익혀보기");
		
		String str1 = "apple";
		String str2 = "Apple";
		String str3 = "Have a  Nice Day";
		String str4 = "          Today now";
		
		
		//문자열 비교
		System.out.println("str3의 길이 : " + str3.length());  //문자 길이 갯수
		System.out.println("str3의 길이 : " + str4.length());
		
		System.out.println("str4의 길이 (앞뒤 공백 제거 후)" + str4.trim().length()); //공백제거
		System.out.println("*" + str4 + "*");
		System.out.println("*" + str4.trim() + "*");
		
		System.out.println("str3에서 0번 문자 : " + str3.charAt(0)); //자리에 있는 문자 추출
		System.out.println("str3에서 0번 문자 : " + str3.charAt(9));
		
		System.out.println("str3에서 A의 인덱스 : " + str3.indexOf("a")); //해당 단어가 몇번째에 있는지 추출
		System.out.println("str3에서 N의 인덱스 : " + str3.indexOf("N"));
		
		System.out.println("str3에서 Have 추출 : " + str3.substring(0, 4)); //자릿수~자릿수 사이 부분 추출
		System.out.println("str3에서 Nice 추출 : " + str3.substring(8, 12));
		System.out.println("str3에서 Nice부터 끝까지 추출 : " + str3.substring(8)); //해당자리입력 후 그뒤까지 추출...
		
		
		System.out.println("문자열 비교 " + str1.equals(str2));
		System.out.println("문자열 비교 " + str1.equalsIgnoreCase(str2));
		
		
		
		//숫자비교 (아스키코드로 계산)
		System.out.println(str1.compareTo(str2)); //앞이 크면 +
		System.out.println(str1.compareTo(str1)); //같으면 0
		System.out.println(str2.compareTo(str1)); //앞이 작으면 -
		System.out.println("computer".compareTo("commad")); //com은 같고 그뒤부터 계산
		
	
	

	}

}
