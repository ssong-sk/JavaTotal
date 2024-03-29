package day0111;

class Score {

	private String stuName;
	private int java;
	private int oracle;

	public static final String TITLE = "2020년도 기말고사"; // 절대 변하지 않는 상수

	// getter, setter
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOrclae() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public static String getTitle() {
		return TITLE;
	}

	// 추가할 메서드
	// 합계
	public int getTot( ) {
		int t = java + oracle;
		return java + oracle;
	}

	public double getAge() {
		double d = getTot() / 2.0;
				return d;
	}

}

public class ObTest_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score s1 = new Score();
		s1.setStuName("박지선");
		s1.setJava(90);
		s1.setOracle(88);
		
		int tot = s1.getTot();
		double avg = s1.getAge();
		
		System.out.println("**Score클래스**");
		System.out.println(Score.TITLE);
		System.out.println("이름 : " + s1.getStuName());
		System.out.println("자바점수 : " + s1.getJava());
		System.out.println("오라클점수 : " + s1.getOrclae());
		System.out.println("합계 : " + tot); //s1.getTot(); 입력가능
		System.out.println("평균 : " + avg); // s1.getAge(); 입력가능

	}

}
