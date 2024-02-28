package day0112;

//클래스를 객체 생설할떄는 자동으로 '부모 => 자식순' 그래야 자식이 부모의 멤버를 사용할 수 있기 떄문.
public class MainEmp_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager_04 man = new Manager_04("이효리", 280000, "경영자");
		System.out.println(man.getEmployee());
	}

}
