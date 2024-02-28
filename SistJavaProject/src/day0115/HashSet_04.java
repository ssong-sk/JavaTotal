package day0115;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HashSet : 순서를 유지하지 않아도 되는 데이터 집합, 중복허용 안됨, 
//구현 클래스, 인덱스가 존재하지 않음,
//ex ) set인터페이스를 구현하려면 HashSet으로 사용한다. (set은 인터페이스에서 구현하는것을 더 많이 사용)

//<E> 엘리먼트, 꺽쇠모양 안에 하나의 타입을 넣는것을 제네릭스라고함. / 제네릭으로 타입 명시하면 그외에 타입을 넣으면 오류가 발생


public class HashSet_04 {

	public static void main(String[] args) {
		// 컬렉션은 가변적이므로 배열의 고정형을 보완해 준다.
		
		Set<String> set1 = new HashSet<String>(); //뒷부분에 HashSet뒤에 타입은 생략할 수 있음.
		//set1 안에 String만을 담겠다라는 뜻 _ Set은 인터페이스 이므로 생성안됨, 그걸 구현한 클래스인 HashSet으로 생성하여 사용해야한다.
		
		set1.add("사과");
		set1.add("오렌지");
		set1.add("배");
		set1.add("사과"); //중복으로 사용된 사과는 갯수에 포함이 안됨... 중복허용이 불가능하기 떄문
		set1.add("키위");
		set1.add("바나나");
		
		
		System.out.println("데이터의 갯수 " + set1.size()); //size를 사용하여 갯수를 확인해야함.
		
		System.out.println("출력 _ #1");
		
		for(String s : set1) {
			System.out.println(s);
		
		}	System.out.println();
		
		System.out.println("출력 _ #2");
		
		Iterator<String> iter = set1.iterator();
		
		while(iter.hasNext()) { //while문으로 할 경우 hasNext 사용 / 데이터가 더이상 없으면 false로 나오는데 그때까지 출력 계속 반복)
			String s = iter.next();//다음값을 찾아서 출력하는 next()사용
			System.out.println(s); //다음으로 이동함과 동시에 데이터 반환
		}
		
		System.out.println("출력 _ #3"); 
		Object [] ob = set1.toArray();//오브젝트 배열을 사용하여 for문으로 출력
		for(int i = 0; i <ob.length; i++) {
			System.out.println(ob[i]);
		}
		
		//모든 데이터 삭제 
		set1.clear(); //set1에 포함되어 있는 데이터를 모두 삭제하는 방법.
		
		//확인
		if(set1.isEmpty()) { //Boolean 반환형 true, false로 확인
			System.out.println("Set타입 안에 데이터가 없다.");
		}
		else {
			System.out.println("Set차입 안에 데이터가 있다.");
		}
			

	}

}
