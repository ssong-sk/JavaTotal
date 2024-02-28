package day0111;


//객체의 속성 : 인스턴스 변수  객체의 동작 : 클래스의 메서드
//Object : 객체, 실제로 존재하는 사물(핸드폰, 자동차 ....)
//class : 객체를 정의해 놓은것, 객체를 생성하기 위해 존재(설계도....)
//인스턴스 : 클래스에서 만들어진 객체를 그 클래스의 인스턴스

class Person{
	private String name;
	private int age;
	private String hp;
	private String addr;
	
	//디폴트 생성자
	
	public Person() {
		
	}
	
	
	//명시적 생성자를 만들면 기존에 생성 및 출력부분 오류로 디폴트 생성자를 써주면 오류가 사라진다!!!!
	
	public Person(String name, int age, String addr, String hp) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.hp = hp;
		
	}
	
	//오른쪽 마우스 Source 누르고 Generate getter and setter 누르고 생성하려는 것을 선택
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}



public class ObjectReview_01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Person p1 = new Person();
		//p1.name = "홍길동"; //새롭게 초기화하여 값 입력 , private인스턴스 변수는 생성을 해도 변수에 접근 안됨.
		p1.setName("김민지");
		p1.setAddr("강남구");
		p1.setAge(22);
		p1.setHp("010-1234-5678");
		
		String name = p1.getName();
		int age = p1.getAge();
		String addr = p1.getAddr();
		String hp = p1.getHp();
		
		System.out.println("[개인신상정보]");
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(hp);

		
		//디폴트 생성자 생성 후에 다시 변수 설정하여 출력 가능
		//디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		Person p2 = new Person("김소미", 22, "서울시", "010-123-4567"); //인스턴스 변수 초기화와 동시에 클래스 생성
		
		System.out.println("---------------------------------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getAddr());
		System.out.println(p2.getHp());
	}

}
