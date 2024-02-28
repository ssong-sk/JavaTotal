package day0115;

public class DriverExep_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class cla = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("클래스를 찾을 수 없습니다.");
		}finally { //해당 클래스를 찾을 떄 어떤 클래에 대한 오류를 처리할건지, 방법은 어떤걸할지 처리하고 끝낸다는 뜻.==> 드라이상 낭비를 줄이고 멈추는것.
			System.out.println("프로그램 안전종료!!!");
		}

	}

}
