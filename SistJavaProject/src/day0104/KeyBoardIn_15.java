package day0104;

import java.util.Scanner;

public class KeyBoardIn_15 {

	public static void main(String[] args) {
		// 키보드 입력에 필요한 Scanner 클래스를 import (스캐너가 가지고 있는 메서드를 사용하기 위해)
		
		//객체지향을 하려면 클래스를 생성해야함. 클래스명, 참조변수명 = new Scanner 사용
		//new를 쓰면 객체지향(다시 활용하여 사용 가능)
		
		//1.import 만들기
		Scanner scanner = new Scanner(System.in); 
		
		//2.변수선언
		String name;
		int age;
		
		//3. 입력
		System.out.print("이름을 입력해 보세요 ==>");
		name = scanner.nextLine(); //한줄을 문자로 읽어온것 (공백 사용 가능)
		
		System.out.print("나이를 입력해 보세요 ==>");
		age = Integer.parseInt(scanner.nextLine()); //버퍼를 없애기 위해서 형 변환 해줘야함.!!!!!!
		//age = scanner.nextInt(); //숫자 형태로 읽어온것 
		                         //버퍼가 오면 다음 출력값을 동시에 읽어버림. -> 형변환을 해줘야함.
		// 숫자입력 후 엔터 누르면 그 엔터가 키보드 버퍼로 저장되어 다음 문자열 읽을 때 먼저 읽어버리는 현생발생
		// 그래서 다음 문자열 읽기전에 그 엔터 읽어 없애기 .... scanner.nextLine()
		
		
		//scanner.nextLine() 큐에 남은 값들을 스캐너를 통해서 비워줌.
		//int 다음 스캐너가 계속 int인 경우 형 변환을 안해줘도 되나 int 다음 String이 나올 경우 형 변환 필요
		
		
		
		System.out.print("당신이 사는 지역은?");
		String city = scanner.nextLine(); 
		
		//4. 최종출력
		
		System.out.println(name + "님의 나이는 " + age + "세 이고 " + city + "입니다.");
	}

}
