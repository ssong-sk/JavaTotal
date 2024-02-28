package j0110;

import java.util.Scanner;

public class equal_17 { //0105

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String word;
		
		System.out.println("영어 단어를 입력해보세요");
		System.out.println("ex) happy, rose, dragon, angel, music");
		word = in.nextLine();
		
		System.out.println("입력한 단어 : " + word);
		
		if(word.equalsIgnoreCase("happy")) {
			System.out.println("나는 행복해");
		}
		else if(word.equalsIgnoreCase("rose")) {
			System.out.println("블랙핑크 아니야");
		}
		else if(word.equalsIgnoreCase("dragon")) {
			System.out.println("지드래곤");
		}
		else if(word.equalsIgnoreCase("angel")) {
			System.out.println("천사가 아니야");
		}
		else {
			System.out.println("보기에 없는 단어를 입력하셨습니다.");
		}

	}

}
