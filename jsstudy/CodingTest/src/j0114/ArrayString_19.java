package j0114;

public class ArrayString_19 { //0109 _ 09

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str;
		str = new String[4];

		str[0] = "유재석";
		str[1] = "강동원";
		str[2] = "김종국";
		str[3] = "이동욱";

		System.out.println("출력1 _ for");

		for (int i = 0; i < str.length; i++) {
			System.out.println((i + 1) + " : " + str[i]);
		}System.out.println();
		
		System.out.println("======================================");
		System.out.println("출력1 _ for each");
		
		for(String a1 : str) {
			System.out.println(a1);
		}
		
	

	}

}
