package j0116;

abstract class ABstObj {
	abstract public void dataIn();
	abstract public void dataOut();
}
/////////////////////////////////////
public class Anonymous_12 {
	
	ABstObj ab = new ABstObj() {
		
		@Override
		public void dataOut() {
			// TODO Auto-generated method stub
			System.out.println("상속 _ 데이터 출력");
		}
		
		@Override
		public void dataIn() {
			// TODO Auto-generated method stub
			System.out.println("상속 _ 데이터 입력");
		}
	};
	
	//SubAbst sub = new SubAbst;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonymous_12 a1 = new Anonymous_12();
		a1.ab.dataIn();
		a1.ab.dataOut();
		
		
		/*SubAbst sub = new SubAbst;
		sub.dataIn();
		sub.dataOut();
		
		a1.sub.dataIn();
		a1.sub.dataOut();*/ //왜 출력이 안되지?????

	}

}
