package day0115;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet<Integer>();//레퍼클래스로 넣어야함 integer안에 있는 int라고 함.
		set1.add(5);
		set1.add(3);
		set1.add(7);
		set1.add(20);
		set1.add(35);

		System.out.println("갯수 " + set1.size()); //컬렉션에서는 length보다 size를 더 많이 사용

		System.out.println("출력_#1");
		for (int n : set1) {
			System.out.printf("%5d", n); //순서는 지켜지지 않기 때문에 무작위로 순서 추출
		}

		System.out.println();
		System.out.println("출력_#2");

		Iterator<Integer> iter = set1.iterator();

		while (iter.hasNext()) {
			System.out.printf("%5d", iter.next());
		}
		System.out.println();
		System.out.println("출력_#3");

		Object[] ob = set1.toArray();
		for (int i = 0; i < ob.length; i++) {
			System.out.printf("%5d", ob[i]);
		}

	}

}
