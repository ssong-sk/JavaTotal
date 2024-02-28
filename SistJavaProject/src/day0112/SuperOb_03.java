package day0112;
/*상속 부모객체가 자식객체에게 물려주는것.
 * 자식이 더 커지는 개념 extend라는 예약어를 사용하는데 상속한다라는 개념으로 사용 
 * is a 부모로부터 받는 개념.
 * 자식이 부모 메서드를 물려받는것을 오버라이딩. (필수적인 것은 아님/가져와서 완성시키는것)
 * 이름이 같을 수 있는 메서드를 생성자가 수많은걸 만들어도 인자값을 다르게 사용하는것을 오버로딩.
 * 
 */

public class SuperOb_03 {
	//부모가 인스턴스 변수값을 가짐.
	String name;
	int age;
	
	//명시적 생성자를 하면 디폴트 안만들어도되는건 동일
	//명시적 생성자
	public SuperOb_03(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public SuperOb_03() {
		
	}

}
