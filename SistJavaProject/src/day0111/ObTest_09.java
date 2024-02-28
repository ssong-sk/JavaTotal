package day0111;

class Manggo {

	private String writer;
	private String subject;
	private static String mes = "Happy Day!!";

	// getter, setter
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static String getMes() {
		return mes;
	}

	public static void setMes(String mes) {
		Manggo.mes = mes;
	}

}

public class ObTest_09 {

	public static void writeManggo(Manggo m) { // static은 생성을 하지 못함
		// 따라서 위에 생성한 클래스를 가지고와서 사용 가능
		System.out.println("**망고 클래스 출력**");
		System.out.println("작성자 : " + m.getWriter());
		System.out.println("제목 : " + m.getSubject());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("망고 클래스 메세지 출력");
		System.out.println(Manggo.getMes());

		
		Manggo m1 = new Manggo();
		m1.setWriter("이민우");
		m1.setSubject("오늘은 목요일");

		Manggo m2 = new Manggo();
		m2.setWriter("권지용");
		m2.setSubject("내일은 금요일");
		
		
		//출력문이 같은 클래스 안에 존재 / 같은 클래스내의 static 메서드 호출은 클래스명 생략 가능
		writeManggo(m1);
		writeManggo(m2); //위에 메서드의 이름으로 사용해서 쓸 수 있음
	}

}
