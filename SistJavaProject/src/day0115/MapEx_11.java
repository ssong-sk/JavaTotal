package day0115;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//key value로 이루어지는 데이터의 집합
//key로 구분
//순서유지 되지 않는다 / key를 중복허용하지 않음 / 값은 중복을 허용함(value)

public class MapEx_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String>  map = new HashMap<String, String>();
		//키값은 String밖에 없음, Value 값은 string이나 integer도 가능함.
		
		map.put("name", "강호동");
		map.put("age", "33");
		map.put("addr", "서울시");
		
		//같은 키값으로 넣으면 먼저 데이터는 없어짐..
		map.put("name", "수지"); //중복데이터는 먼저 입력한 데이터가 사라지고 최종 마지막으로 적은 값으로 나온다
		
		System.out.println("갯수 : " + map.size());
		System.out.println("<키값을 알면 value 값을 정확히 얻을 수 있다>");
		
		System.out.println("이름 : " + map.get("name"));
		System.out.println("나이 : " + map.get("age"));
		System.out.println("지역 : " + map.get("addr"));
		
		System.out.println("키 값을 먼저 한꺼번에 얻은 후 값을 얻는 방법");
		
		Set<String> keyset =map.keySet(); //map을 한꺼번에 얻는 값
		System.out.println("**출력방법1**");
		Iterator<String> keyiter = keyset.iterator(); //iter는 while문으로 반드시 뽑아줘야함.
		
		while(keyiter.hasNext()) {
			String key = keyiter.next();
			System.out.println(key + " --> " + map.get(key));
		}
		
		System.out.println("**출력방법1**");
		for(String key:keyset) {
			System.out.println(key + " ==> " + map.get(key));
		}
			

	}

}
