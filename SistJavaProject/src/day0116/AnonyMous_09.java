package day0116;

abstract class AbstObj {
	
	abstract public void dataIn();
	abstract public void dataOut();
	
}
/////////////////////

class SubAbst extends AbstObj{

	@Override
	public void dataIn() {
		// TODO Auto-generated method stub
		System.out.println("상속 _ 데이터 입력");
	}

	@Override
	public void dataOut() {
		// TODO Auto-generated method stub
		System.out.println("상속 _ 데이터 출력");
	}
	
}
/////////////////////
public class AnonyMous_09 {
	
	//익명내부 클래스
	AbstObj ab1 = new AbstObj() {
		
		@Override
		public void dataOut() {
			// TODO Auto-generated method stub
			System.out.println("익명내부클래스 _ 데이터 출력");
		}
		
		@Override
		public void dataIn() {
			// TODO Auto-generated method stub
			System.out.println("익명내부클래스 _ 데이터 입력");
		}
	};

	SubAbst sub =new SubAbst();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonyMous_09 an = new AnonyMous_09();
		
		
		//익명내부클래스 출력
		an.ab1.dataIn();
		an.ab1.dataOut();
		
		
		//상속받은 클래스 멤버 변수 선언해서 출력
		/*SubAbst sub = new SubAbst();
		sub.dataIn();
		sub.dataOut();*/
		
		an.sub.dataIn();
		an.sub.dataOut();

	}

}
