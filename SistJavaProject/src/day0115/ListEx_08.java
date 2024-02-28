package day0115;

import java.util.List;
import java.util.Vector;

public class ListEx_08 {
	
	public static void write(String title, List<String> list) {
		System.out.println("**" + title + "**");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		/*
		 * Vector, ArrayList _ 순차, 중복데이터 가능
		 * 메서드는 get(index) _ 리스트내의 지정된 위치값 요소를 돌려준다
		 * toArray() _ 리스트 내의 모든 요소를 순서대로 포함하고 배열에 넣어준다. (반환형 : object[] )
		 * isEmpty() _ Vector가 비었는지 않았는지(반환형 : boolean)
		 */
		
		String [] data = {"햄버거", "피자", "파스타"};
		
		//배열의 데이터를 리스트에 넣기
		List<String> list = new Vector<String>();
		
		for(String s : data) {
			list.add(s);
			
		}
		write("초기배열 데이터", list);
		
		System.out.println("1번 인덱스 삭제해보기"); //해당 값만 삭제가 되지만, 순서 번호는 앞으로 당겨서 출력이 된다.
		list.remove(1);
		write("삭제 후 결과", list);
		
		System.out.println("리코타 샐러드 추가하기");
		list.add("리코타샐러드"); //add는 추가 하는것 -> 마지막에 추가하는방법
		write("추가 후 데이터 ", list);
		
		System.out.println("1번 인덱스 파스타를 스파게티로 변경");
		list.set(1, "스파게티"); //set 위치 변경하는 방법. 번호 쓰고 바꿀 명칭쓰기
		write("변경 후 출력", list);
		
		System.out.println("전체 삭제");
		list.clear();
		System.out.println("삭제 후 사이즈 : " + list.size()); //삭제 사이즈는 프린트써서 출력!

	}

}
