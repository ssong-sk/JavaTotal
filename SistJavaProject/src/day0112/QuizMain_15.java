package day0112;

import java.util.Scanner;



class QuizMain {

	private String schoolName;

	

	//디폴트
	public QuizMain() {
		this.schoolName = "테스트";
	}
	
	//명시적
	public QuizMain(String cc) {
		this.schoolName = cc;
	}

	//메서드 출력
	public void writeSchool() {
		System.out.println("학교명 : " + schoolName);
		System.out.println();
		System.out.println("이름\tJAVA\tORACLE\tHTML\t총점\t평균\t평가");
		System.out.println("=========================================================");

	}

	public void QuizMain(String ssName) {
		this.schoolName = ssName;
	}

}

///////////////////
//자식클래스
class Quiz extends QuizMain{
	private String sName;
	private int java;
	private int oracle;
	private int html;
	private int total;
	private int averge;
	private int pyungga;

	
	//setter getter
	//public Quiz() {
//
	//}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	
	//총합
	public int getTotal() {
		int t = 0;
		
		t = java + oracle + html;
		return t;
	}
	
	//평균
	public double getAverge() {
		double a = 0;
		
		a = getTotal() / (double) 3.0;
		return a;
	}
	
	//평가 getPyungga() 
	//평가는 90점이상: 장학생   80점이상: 합격  80점미만:불합격임 

	
	public String getPyungga() {
		
		String pyungga;
		double a = getAverge();
		
		if (a >= 90) {
			pyungga = "장학생";
		}
		else if (a >= 80) {
			pyungga = "합격";
		}
		else {
			pyungga = "불합격";
				
		}
		return pyungga;
	}
	
	

	
	@Override //어노스테이션
	public void writeSchool() {
		// TODO Auto-generated method stub
		super.writeSchool();
	}
}

public class QuizMain_15 {
	
	public static void quizTitle(Quiz[] quiz) {
		
		//제목출력하기
		Quiz qu = new Quiz();
		qu.writeSchool();
		for(Quiz q : quiz) {
			System.out.printf(
			  "%s\t%d\t%d\t%d\t%d\t%.1f\t%s"	
			  , q.getsName() , q.getJava() , q.getOracle() , q.getHtml() , q.getTotal() , q.getAverge() ,q.getPyungga()
			);		
		}
	}
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		QuizMain quizMain = new QuizMain(); // 
		
		Quiz[] quiz;
		int inwon;
		
		String ssName;
		System.out.println("학교명 입력받으세요.");
		ssName = in.nextLine();
		quizMain.QuizMain(ssName);
		
		System.out.println("인원수 : ");
		inwon = Integer.parseInt(in.nextLine());
		
		quiz = new Quiz[inwon];
		
		for(int i = 0; i < inwon; i++) {
			quiz[i] = new Quiz();
			System.out.println("이름");
			String name = in.nextLine();
			System.out.println("JAVA 점수 : ");
			int java = Integer.parseInt(in.nextLine());
			System.out.println("ORACLE 점수 :");
			int oracle = Integer.parseInt(in.nextLine());
			System.out.println("html 점수 :");
			int html = Integer.parseInt(in.nextLine());
		
			//setter로 sawon클래스에 데이터 넣기
			quiz[i].setsName(name);
			quiz[i].setJava(java);
			quiz[i].setOracle(oracle);
			quiz[i].setHtml(html);
			
			
//			System.out.println();	
		}
		
		
		quizTitle(quiz);
		//quizMain.writeSchool();
		
		
		
		

		
	}

}
