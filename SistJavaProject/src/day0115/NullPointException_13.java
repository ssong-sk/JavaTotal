package day0115;

import java.sql.Date;

public class NullPointException_13 {
	
	Date date; //new date를 생성해줘야함...
	
	private void write() {
		int y,m,d;
		
		try { //오류가 발생할거 같은 범위
		y = date.getYear()-1900;
		m = date.getMonth()+1;
		d = date.getDate();
		
		System.out.println(y + "년 " + m + "월 " + d + "일 입니다.");
		}catch (NullPointerException e) { //에러에 대한 설명
			//e.printStackTrace(); //해결되는 방안
			System.out.println("객체 생성을 안했어요 " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NullPointException_13 nullex = new NullPointException_13();
		nullex.write();
		System.out.println("프로그램 종료");
		

	}

}
