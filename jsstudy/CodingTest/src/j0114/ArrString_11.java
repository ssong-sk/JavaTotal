package j0114;

public class ArrString_11 { //0109

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str1 = {"텀블러", "키보드", "핸드크림", "칫솔", "우산"};
		String [] strColor = {"red", "pink", "blue", "yellow", "gray", "white"};
		
		System.out.println("str1 길이 : " + str1.length);
		System.out.println("strColor 길이 : " + strColor.length);
		
		System.out.println("==========================================");
		System.out.println("for문");
		
		for(int i = 0; i < str1.length; i++) {
			System.out.println("str1은 " + (i+1) + "번쨰" + str1[i]);
		}
		System.out.println("each 문");
		for(String a : str1) {
			System.out.println(a);
		}
		
		System.out.println("==========================================");
		System.out.println("for문");
		
		for(int i = 0; i < strColor.length; i++) {
			System.out.println("strColor는" + (i+1) + "번쨰 " + strColor[i]);
		}
		System.out.println("each 문");
		for(String c : strColor) {
			System.out.println(c);
		}

	}

}
