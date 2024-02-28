package j0116;

abstract class AbEx {
	
	abstract public void dataAdd();
	abstract public void dataList();
	
}
///////////////////////////////////////////////

public class Anonymous_11 { //0116 _ 08 
	
	AbEx ab1 = new AbEx() {
		
		@Override
		public void dataList() {
			// TODO Auto-generated method stub
			System.out.println("데이터를 출력합니다.");
		}
		
		@Override
		public void dataAdd() {
			// TODO Auto-generated method stub
			System.out.println("데이터를 추가합니다.");
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonymous_11 an1 = new Anonymous_11();
		an1.ab1.dataList();
		an1.ab1.dataAdd();

	}

}
