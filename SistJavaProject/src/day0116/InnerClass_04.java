package day0116;

class OuterObj {
	
	public void disp() {
		System.out.println("외부클래스의 disp메서드");
		System.out.println("외부에서 내부클래스의 write 메서드 호출");
		
		//클래스 생성을 해서 메서드 호출
		ineerObj inObj = new ineerObj();
		inObj.write(); //내부 클래스는 외부클래스를 통해서 호출해서 출력가능하다!!!!!!!!!!!!
	}

	class ineerObj { //클래스 안에 존재하는 클래스를 이너클래스라고 함. /outerobj에 사용되는 클래스
		
		public void write() {
			System.out.println("내부클래스의 wirte메서드");
		}

	}

}

//////////////////////////////////
public class InnerClass_04 {

	public static void main(String[] args) {
		// 내부클래스를 외부클래스를 통해서 내부,외부 내용 같이 출력
		OuterObj outObj = new OuterObj();
		outObj.disp();
		System.out.println("---------------------------------");
		
		//내부클래스는 외부 통해서만 생성가능(내부클래스에 있는 내용만 추출)
		//OuterObj.ineerObj obj = new OuterObj().new ineerObj(); //생성된게 없으면 이 방법 사용~~~~~
		OuterObj.ineerObj obj = outObj.new ineerObj(); //처음에 생성된게 있으면 사용가능
		obj.write();

	}

}
