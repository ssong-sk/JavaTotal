package day0112; //공부다시 하기!!!!!!!!!!!!!!!!!!!!!!!!!!!!

class School { // 부모 클래스

	public static final String SCHOOLNAME = "쌍용고등학교";

	private String schoolAddr;
	private int countStu;
	private int countTeacher;

	// 디폴트생성자
	public School() {
		this("강남구 역삼동", 120, 10); // 초깃값 불러서 사용
	}

	// 명시적생성자
	public School(String saddr, int cntstu, int cntteacher) {
		this.schoolAddr = saddr;
		this.countStu = cntstu;
		this.countTeacher = cntteacher;
	}

	// setter/ getter

	public String getSchoolAddr() {
		return schoolAddr;
	}

	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}

	public int getCountStu() {
		return countStu;
	}

	public void setCountStu(int countStu) {
		this.countStu = countStu;
	}

	public int getCountTeacher() {
		return countTeacher;
	}

	public void setCountTeacher(int countTeacher) {
		this.countTeacher = countTeacher;
	}

	public static String getSchoolname() {
		return SCHOOLNAME;
	}

	// 메서드
	public void writeData() {
		System.out.println("학교주소 : " + this.schoolAddr);
		System.out.println("학생수 : " + this.countStu + ", 선생님 수 : " + this.countTeacher);

	}
}

class Student extends School {
	private String stuName;
	private int grade;

	public Student() {

	}

	public Student(String sAddr, int cntStu, int cntTea, String stuname, int gra) {
		super(sAddr, cntStu, cntTea);
		this.stuName = stuname;
		this.grade = gra;
	}


	// 각각의 setter & getter
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// 재정의메서드
	@Override
	public void writeData() {
		System.out.println("학교명: " + SCHOOLNAME); // 상속받았으므로 클래스명 생략해도 된다
		super.writeData();
		System.out.println("학생명: " + stuName);
		System.out.println("학년: " + grade + " 학년");

	}
}

public class Inherit_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//처음 부모 클래스에서는 주소, 학생수, 선생수만 입력
		Student s1 = new Student();
		s1.writeData();
		System.out.println();
		

		//부모클래스의 주소, 학생수, 선생수를 불러오고 추가적으로 자식 클래스에서 학생명, 학년을 지정해줘서 출력값을 입력하고 출력을 하면 전체적으로 출력이 됨.
		Student s2 = new Student("영등포구", 300, 35, "김숙", 2);
		s2.writeData();
		System.out.println();
		
		
		//s1 첫번째에서 출력된 학생명, 학년의 값을 초기값으로 지정되어 있었으므로 s1의 학년, 학생명을 지정해서 출력하면 출력이 됨.
		System.out.println("1번째 학생 학생명과 학년 변경후 출력");
		s1.setStuName("이영자");
		s1.setGrade(5);
		s1.writeData();
		System.out.println();

	}

}
