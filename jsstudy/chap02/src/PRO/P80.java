package PRO;

import java.util.Scanner;

public class P80 {

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println("     *"); System.out.println("    ***");
	 * System.out.println("   *****"); System.out.println("  *******");
	 * System.out.println(" ********"); System.out.println("***********");
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * int s; Scanner in = new Scanner(System.in);
	 * 
	 * System.out.print("정수를 입력하세요 : ");
	 * 
	 * s = in.nextInt();
	 * 
	 * int result = (int) Math.pow(s, 2); //제곱근 구하는 메서드 
	 * System.out.println(s + "의 제곱은 " + result);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * double a, b, c;
	 * 
	 * Scanner in = new Scanner(System.in);
	 * 
	 * System.out.print("원기둥의 밑면 반지름은 ? ") ; 
	 * a = in.nextDouble();
	 * System.out.print("원기둥의 높이는?") ; 
	 * b = in.nextDouble();
	 * 
	 * c = (a * a * 3.14) * b;
	 * 
	 * System.out.printf("원기둥의 부피는 %04.1f", c); }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * 
	 * Scanner in = new Scanner(System.in);
	 * 
	 * System.out.print("초 단위 정수를 입력하세요 : ");
	 * 
	 * int time = in.nextInt();
	 * 
	 * int hour = time / (60 * 60); 
	 * int minute = time / 60; 
	 * int second = time % 60;
	 * 
	 * System.out.println(hour + "시간 " + minute + "분 " + second + "초");
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * char x = 'c';
	 * 
	 * int y = (int) 'A' - (int) 'a';
	 * 
	 * System.out.println(y);
	 * 
	 * int d = (int) x + y; 
	 * 
	 * System.out.println(d);
	 * 
	 * char g = (char) d;
	 * 
	 * System.out.println(g);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * double f;
	 * 
	 * Scanner in = new Scanner(System.in);
	 * 
	 * System.out.print("화씨온도를 입력하면 : ");
	 * 
	 * f = in.nextDouble();
	 * 
	 * double c = (5 / (double) 9) * (f - 32); //나누기 할떄 ()것은 필수로 적용.
	 * 
	 * System.out.print(c);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * int s;
	 * 
	 * Scanner in = new Scanner(System.in);
	 * 
	 * System.out.print("정수 입력 : ");
	 * 
	 * s = in.nextInt();
	 * 
	 * boolean y = (s % 4 == 0) && (s % 5 == 0) ? true : false;
	 * 
	 * System.out.println(y);
	 * 
	 * boolean x = (s % 4 == 0) || (s % 5 == 0) ? true : false;
	 * System.out.println(x);
	 * 
	 * boolean t = (x) && (((s % 4 != 0) && (s % 5 != 0)) ? true : false);
	 * 
	 * System.out.println(t);
	 * 
	 * }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * int s;
	 * 
	 * Scanner in = new Scanner(System.in);
	 * System.out.print("0~999 사이의 숫자를 입력하세요 : ");
	 * 
	 * s = in.nextInt();
	 * 
	 * int x = (s / 100); 
	 * int y = (s % 100) / 10; 
	 * int z = (s % 100) % 10;
	 * 
	 * System.out.println("각 자릿수의 합 = " + (x + y + z)); }
	 */

	public static void main(String[] args) {

		int x, y, z;

		Scanner in = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		x = in.nextInt();

		System.out.print("교양 이수 학점 : ");
		y = in.nextInt();

		System.out.print("일반 이수 학점 : ");
		z = in.nextInt();

		boolean s = ((x + y + z) >= 140) ? true : false;
		boolean h = (x >= 70) ? true : false;
		boolean g = ((y >= 30) && (z >= 30) || (y + z) >= 80) ? true : false;

		System.out.println((s && h && g) ? "졸업 가능" : "졸업 불가능");
	}
}
