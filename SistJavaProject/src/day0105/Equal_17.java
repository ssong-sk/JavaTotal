package day0105;

import java.util.Scanner;

public class Equal_17 {

	public static void main(String[] args) {
		// 문자열 비교는 관계연산자로 이용 안되고 
		//equals()라는 메서드를 이용해서 비교한다
		
		Scanner sc = new Scanner(System.in);
		
		String word;  //입력할 단어
		
		System.out.println("영어단어를 입력해보세요 : ");
		System.out.println("ex) happy, rose, dragon, angel, music");
		word = sc.nextLine();
		
		
		System.out.println("입력한 단어 : " + word);
		
		
		if(word.equals("angel")) {
			System.out.println("**천사");
		}
		
		else if(word.equalsIgnoreCase("happy")) {//소문자든 대문자든 true로 반환됨.
			System.out.println("**행복하다**");
		}
		
		else if(word.equalsIgnoreCase("music")) {
			System.out.println("**음악**");
		}
		
		else if(word.equalsIgnoreCase("dragon")) { //소문자든 대문자든 true로 반환됨.
			System.out.println("**용**");
		}
		
		else {
			System.out.println("이 단어는 잘못입력 했습니다.");
		}
		
		
	}

}
