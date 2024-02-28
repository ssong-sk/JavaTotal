package day0115;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListEx_07 {

	public static void main(String[] args) {
		// 1. 순차적으로 데이터 들어간다.
		// 2. 중복 데이터 허용
		// 3. 처음 생성 시 일정한 갯수로 생성되는데 그 이상의 데이터를 넣으면 자동으로 공간이 늘어난다. (배열은 정해진것과 차이)
		
		//List<String> list = new Vector<String>(); //가장 많이 사용
		Vector<String> list = new Vector<String>();
		//생성자가 디폴트인 경우 기본 할당 크기는 10
		System.out.println("초기 데이터 갯수 : " + list.size());
		System.out.println("초기 할당 크기 : " + list.capacity()); //vector을 사용해야 할당크기가 나온다.
		
		list.add("장미");
		list.add("수국");
		list.add("장미");
		list.add("프리지아");
		list.add("해바라기");
		list.add("안개꽃");
		list.add("장미");
		list.add("개나리");
		list.add("백합");
		list.add("백합");
		list.add("백합");
		
		
		
		System.out.println("초기 데이터 갯수 : " + list.size());
		System.out.println("초기 할당 크기 : " + list.capacity()); //10이 오바되면 20, 20이 오바되면 30 -> 10씩 늘어난다. (배열과의 차이점)
		
		System.out.println("출력_#1");
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) { //가장 많이 사용
			String s = list.get(i);
			System.out.printf("%7s",s);
		}
		
		
		System.out.println();
		System.out.println("출력_#2");
		for(String s : list) {
			System.out.print(s + "  ");
		}
		
		System.out.println();
		
		System.out.println("출력_#3");
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		System.out.println();
		
		System.out.println("출력_#4");
		
		Object [] ob = list.toArray();
		for(int i = 0; i < ob.length; i++) {
			String s = (String)ob [i]; //오브젝트를 다시 string 타입을 넣어주어 출력 / 왼쪽 자료형에 맞춰서 입력
			System.out.print(s + "  ");
		}

	}

}
