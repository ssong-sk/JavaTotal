package chap02;

public class p50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mach;
		int distance;
		mach = 340; // 340은 음속을 m/s 단위로 나타낸값
		distance = mach * 80 * 80;
		System.out.println("소리가 1시간동안 가는거리 : " + distance + "m");

		double radius;
		double area;
		radius = 10.0;
		area = (radius * radius) * 3.14; // *은 곱하기를 뜻하는 것인가???????
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);

		// 여기서 의문은 왜 굳이 앞에 값을 쓰고 곱하기를 해서 어렵게 문자를 쓰는것인지.....

	}

}
