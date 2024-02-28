package day0110;

//static 변수는 메모리에 한번 할당 되면 프로그램이 종료될 때 해제되는 변수
//메모리에 한번 할당이므로 여래 객체가 해당 메모리를 공유 (사용하는 이유는 메모리 효율이 좋아진다.) 
//ex)조회수 증가할 때 많이 사용
 
public class StaticInstance_09 {
	
	static int count = 0;
	
	//생성자의 네이밍은 클래스와 같음.
	public StaticInstance_09() { ///디폴트 생성자... 인자값이 하나도 넘어오지않는것.
		                         //넘겨져 있는 값이 하나도 없으면 생성자
		
		count++;
		System.out.println(count);
	}
	
	

	public static void main(String[] args) {
		// 객체 변수는 항상 독립적이므로 count는 서로 다른 메모리를 가지므로 증가하지 않는다.
		// static은 공유하는 것이므로 증가
		StaticInstance_09 s1 = new StaticInstance_09();
		StaticInstance_09 s2 = new StaticInstance_09();

	}

}
