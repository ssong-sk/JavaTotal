package j0117;
/*
 ****************************** SimpleDataFormat : 이 클래스는 날짜를 원하는 포맷으로 파싱시켜주는 역할!!
 * y : 년 / M : 월 / d : 일 / H : 시간(24시간) / h : 시간(am/pm) / m : 분 / s : 초
 * 
 * yyyy : 2024 / MM : 1월 / dd : 18일 / HH : 00시 / mm : 17분 / ss : 30초 -> 2024.01.18.00:17:30 으로 표기됨
 * -> yyyy를 빼고 최대 두자리로 출력되며 한자리로 쓸 경우 한자리로 표기
 * -> 시간 입력 하기 전 앞에 a는 오전 p는 오후 표기하고 쓰기
 * 
 * EEE : 요일없이 출력 (월 화 수 목 금 토 일) / EEEE : 요일까지 포함되어 출력 (월요일 화요일 등등)
 * 
 * 
 * ********************NumberFormat :  클래스는 수에 대한 포괄적인 포맷 기능을 제공
 * -> int를 받아서 3자리마다 자동적으로 콤미(,)를 찍어서 String으로 리턴
 * ->정적 메소드이므로 new 연산자를 사용하여 객체를 호출하지 않는다.
 * 
 * getCurrencyInstance() 메소드는 화폐 값을 편집하는 format 객체를 반환
 * getPercentInstance() 메소드는 백분율을 편집하는 format 객체를 반환
 * 
 * ----->getCurrencyInstance()와 getPercentInstance()는 현재 지역의 화폐와 백분율 양식을 반영하므로, 한국에서는 기본값으로 \와 %로 반환
 * ----->$로 반환을 해야 되는 경우는 Locale.US 를 입력 (ex ) String price = NumberFormat.getCurrencyInstance(Locale.US).format(10);
 * 
 * getInstance() ????
 * 객체 지향 프로그래밍에서 주로 사용되는 메소드
 * 클래스의 인스턴스를 생성하고, 이미 생성된 인스턴스를 반환하는 역할
 * 
 */

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_06 { //0117_01

	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println(date); //이전 출력값
		
		//날짜, 시간을 원하는 약식에 맞춰 출력하기

		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss"); 
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-DD HH:mm EEEE");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		System.out.println(sdf4.format(date));
		
		
		//NumberFormat 숫자를 문자열로 변환하여 출력 (, / 소수점 지정할 때)
		
		System.out.println();
		int money = 485400;
		double num = 45.495860;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(money)); //3자리마다 ,로 나타내줌
		
		NumberFormat nf2 = NumberFormat.getInstance(); 
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));
		

	}

}
