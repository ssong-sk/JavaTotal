package day0117;
import java.text.NumberFormat;
//자바 날짜 포맷
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		System.out.println(date);
		
		//날짜,시간을 원하는 약식에 맞춰 출력하기
		//HH는 24시간 표시 MM :월 , mm : 분
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //HH는 24시간 표시, 월은 대문자M, 분은 소문자m 사용
		System.out.println(sdf1.format(date)); //date new 생성을 하지 않은 경우 new date를 사용하면 됨.
		
		//a 오전표기 hh: 12시간 표시
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss"); 
		System.out.println(sdf2.format(date));
		
		//EEE : 요일(요일없이 출력) /  짧게 쓰는것 EEEE:요일 길게 쓰는것 (요일까지 출력)
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-DD HH:mm EEEE");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분");
		System.out.println(sdf4.format(date));
		
		//NumberFormat 숫자를 문자열로 변환하여 출력(컴마나 소수점 자릿수 지정할 때)
		
		System.out.println();
		int money = 45887920;
		double num = 98.489798512;
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(); //화폐단위와 컴마 제공
		System.out.println(nf1.format(money));
		
		NumberFormat nf2 = NumberFormat.getInstance();
		System.out.println(nf2.format(money));
		System.out.println(nf2.format(num));

	}

}
