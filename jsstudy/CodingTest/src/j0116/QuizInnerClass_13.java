package j0116; //0116_10

import java.util.Scanner;

class SawonOuter {
	private String sanwonName;
	private int gibonpay, timesu, familysu;

	public void process() {
		//데이터 입력
		InputInner input = new InputInner();
		input.inputData();
		
		//결과출력
		SudangInner output = new SudangInner();
		output.writeSawonData();

	}
	//////////////////////////////////
	class InputInner {

		public void inputData() {
			Scanner in = new Scanner(System.in);
			System.out.println("사원명 입력");
			sanwonName = in.nextLine();
			System.out.println("기본급 입력");
			gibonpay = in.nextInt();
			System.out.println("초과시간 입력");
			timesu = in.nextInt();
			System.out.println("가족수 입력");
			familysu = in.nextInt();
		}
	}
	//////////////////////////////////////
	class SudangInner {
		public int getTimeSudang() {
			return timesu * 30000;
		}

		public int getFamilySudang() {
			if (familysu <= 4) {
				return 50000;
			} else {
				return 30000;
			}
		}
		public int getTex() {
			return (int) (gibonpay * 0.03);
		}
		public int getTotalPay() {
			return gibonpay + getFamilySudang() + getTimeSudang() - getTex();
		}
		public void writeSawonData() {
			System.out.println("사원명\t기본급\t초과근무\t가족수\t시간수당\t가족수당\t세금\t총급");
			System.out.println("------------------------------------------------------------------------");
			System.out.println(sanwonName + "\t" + gibonpay + "\t" + timesu + "\t" + familysu + "\t" + getTimeSudang() + "\t" + getFamilySudang() + "\t" + getTex() + "\t" + getTotalPay());
		}
	}
}

public class QuizInnerClass_13 {

	public static void main(String[] args) {
		// 방법1
		SawonOuter sa = new SawonOuter();
		sa.process();
	
		//방법2
		
		/*SawonOuter sa1 = new SawonOuter();
		sa1.InputInner input = .new InputInner();
		input.inputData();
		
		sa1.InputInner input = sawon.new InputInner();
		input.inputData();*/
		//방법2 다시 스터디 하기!!!!

	}

}
