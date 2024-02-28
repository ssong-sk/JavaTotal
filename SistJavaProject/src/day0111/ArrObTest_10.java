package day0111;

class Student1 {
	private String stuName;
	private String hp;
	private int score;

	// 생성자 3개짜리
	public Student1(String name, String hp, int score) {
		this.stuName = name;
		this.hp = hp;
		this.score = score;
	}

	// 출력메서드

	public void writeData() {
		System.out.println("이름: " + stuName);
		System.out.println("전화번호: " + hp);
		System.out.println("점수: " + score);

	}

}

public class ArrObTest_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Student1 [] stu = new Student1[3]; //배열변수선언을 하고 0번지,1번지,2번지에대한 값
		 * 
		 * 
		 * stu[0] = new Student1("이민호", "010-1234-5678", 88); 
		 * stu[1] = new tudent1("이영자", "010-1234-9999", 77); 
		 * stu[2] = new Student1("이민정", "010-9876-5432", 99);
		 */

		// 생성과 동시에 초기화
		Student1[] stu = { new Student1("이민호", "010-1234-5678", 88), 
				new Student1("이영자", "010-1234-9999", 77),
				new Student1("이민정", "010-9876-5432", 99) };

		// 배열출력(방법#1)
		for (int i = 0; i < stu.length; i++) { //for문으로 출력
			/*
			 * Student1 s = stu[i]; //자료형은 클래스형 s.writeData();
			 */
			stu[i].writeData();
			System.out.println("-------------------------------");

		}

		// 배열출력(방법#2)
		System.out.println("===================================");
		for (Student1 s1 : stu) { //for each문으로 출력(배열이므로 each사용 가능)
			s1.writeData();
			System.out.println("-------------------------------");
		}
	}

}
