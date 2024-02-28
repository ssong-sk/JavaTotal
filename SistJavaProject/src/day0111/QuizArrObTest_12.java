package day0111;

class MyInfo {

	// 변수설정
	private String name;
	private String type;
	private int age;

	// 생성자
	public MyInfo(String n, String t, int a) {
		this.name = n;
		this.type = t;
		this.age = a;
	}

	// 제목
	public static void showTile()
	{
		System.out.println("이름\tMBTI\t나이");
		System.out.println("==========================");
	}
	// 출력
	public void showInfo()
	{
		System.out.println(name + "\t" + type + "\t" + age);
	}

}

public class QuizArrObTest_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	MyInfo [] m1 = {new MyInfo("이효리", "ENTP", 25),
			new MyInfo("이상순", "ISFJ", 30),
			new MyInfo("유재석", "ENFP", 35),
			new MyInfo("김종국", "INTP", 33)
	};
	
	MyInfo.showTile();
	for(int i = 0; i < m1.length; i++) {
		m1[i].showInfo();
	}
		
	}
}
