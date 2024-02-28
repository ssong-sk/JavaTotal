package day0111;

import java.util.Scanner;

/*
 * 회사이름 쌍용
 * 총사원수 입력 2
 * 사원명 손흥민
 * 월급여 250000
 * 월수당 500000
 * 
 * [쌍용 _ 1월 급여내역]
 * 사원명   기본급   수당    실수령액(10%세금 떼서 계산하기) 
 * ============================================
 * 손흥민 2500000 500000 27000000
 * 황희찬 1500000 500000 18000000
 */

class Sawon {

	//변수 설정
	private String name; //private 다른 클래스에서 노출 안됨.  변수나 메서드를 접근하려고 할떄 .을 사용!!!!!!!!!!!!!!!!!!!!!!!!!!
	private int pay;
	private int tot;
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	
	//실수령액 계산
	public int getTotal( ) {
		int n = 0;
		
		n = ((pay + tot) / 10) * 9;
		
		return n;
	}
	
	//제목출력
	public static void totTitle() {
		System.out.println("**[쌍용 _ 1월 급여내역]**");
		System.out.println();
		System.out.println("사원명\t기본급\t수당\t실수령액");
		System.out.println("===========================================");
	}
	
	
	
}
public class QuizSawon_15 {
	
	public static void sawonTitle(Sawon[] sawon) {
		
		//제목출력하기
		Sawon.totTitle();
		for(Sawon s : sawon)
			System.out.println(s.getName() + "\t" + s.getPay() + 
					"\t" + s.getTot() + "\t" + s.getTotal()); //메인메서드에서 마지막 출력에 붙여넣으면 출력값으로 도출이됨...!!!!
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int inwon;
		Sawon[] sawon;
		
		System.out.println("총 사원수");
		inwon = Integer.parseInt(in.nextLine());
		
		//배열할당
		
		sawon = new Sawon[inwon];
		
		//인원수 입력만 만큼 데이터입력 
		for(int i = 0; i < inwon; i++) {
			sawon[i] = new Sawon();
			System.out.println("이름");
			String name = in.nextLine();
			System.out.println("기본급");
			int pay = Integer.parseInt(in.nextLine());
			System.out.println("수당");
			int tot = Integer.parseInt(in.nextLine());
		
			//setter로 sawon클래스에 데이터 넣기
			sawon[i].setName(name);
			sawon[i].setPay(pay);;
			sawon[i].setTot(tot);;
		
			
			System.out.println();	
		}
		
		//출력
		sawonTitle(sawon);
		
		
	}

}
