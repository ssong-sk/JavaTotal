package day0110;

class MyDate {
	
	private int year; //초기값은 0
	private int month;
	private int day;
	
	//디폴트 생성자가 숨겨져있음
	
	public MyDate() {  //명시적 생성자를 만들면 디폴트 생성자가 생기지 않음. 따라서 별도로 생성자를 만들어줘야함.
		
	}
	
	//명시적 생성자 _ 생성과 동시에 수정이 가능 or 초기화 가능 -> 생성의 목적은 초기화 되려는 의미
	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
		
	}
	//setter
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public void setMonth(int m) {
		this.month = m;
	}
	
	public void setDay(int d) {
		this.day = d;
	}
	
	
	//getter
	
	public int getYear () {
		return year;
	}
	
	public int getMonth () {
		return month;
	}
	
	public int getDay () {
		return day;
	}
	
}

public class MyDate_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate m1 = new MyDate(2024, 01, 10);//인자값을 넣어주니 초기값을 변경해줌.
		
		int year = m1.getYear();
		int month = m1.getMonth();
		int day = m1.getDay();
		
		System.out.println(year + ", " + month + ", " + day);
		
		MyDate m2 = new MyDate();
		m2.setYear(2022);
		m2.setMonth(9);
		m2.setDay(11);
		
		int y = m2.getYear();
		int m = m2.getMonth();
		int d = m2.getDay();
		
		System.out.println(y + "년 " + m + "월 " + d + "일");

	}

}
