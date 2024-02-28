package day0116;

import java.util.Scanner;

class SawonOuter {
	private String sawonName;
	private int gibonpay, familysu, timeSu;

	public void process() {
		//데이터입력
		InputInner input = new InputInner();
		input.inputData();

		//결과출력
		SudangInner output = new SudangInner();
		output.writeSawonData();
	}
	class InputInner {
	
		public void inputData() {
			Scanner in = new Scanner(System.in);
			System.out.println("사원명 입력");
			sawonName = in.nextLine();
			System.out.println("기본급?");
			gibonpay = in.nextInt();
			System.out.println("초과시간?");
			timeSu = in.nextInt();
			System.out.println("가족수는?");
			familysu = in.nextInt();
			
		}
	}

	class SudangInner {
			public int getTimeSudang() {
				return timeSu * 30000;
			}
	
			public int getFamilySudang() {
				if (familysu <= 4) {
					return 200000;
				} else {
					return 300000;
				}
	
			}
			public int getTex() {
				return (int) (gibonpay * 0.03);
			}
	
			public int getTotalPay() {
				return gibonpay + getFamilySudang() + getTimeSudang() - getTex();
			}
			public void writeSawonData() {
				System.out.println("사원명\t기본급\t초과근무\t가족수\t시간수당\t가족수당\t세금\t총급여");
				System.out.println(sawonName + "\t" + gibonpay + "\t" + timeSu + "\t" + familysu + "\t" + getTimeSudang() + "\t" + getFamilySudang() + "\t" + getTex() + "\t" + getTotalPay());
			}
	
		}

}
public class QuizInnerClass_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//방법1 내부클래스를 외부클래스를 통해서 생성 후 메서드 호출
		/*SawonOuter sawonOuter = new SawonOuter();
		
		SawonOuter.InputInner input = sawon.new InputInner;
		input.inputData();
		
		sawonOuter.SudangInner output = sawon.new SudangInner();
		output.writeSawonDate();*/

		//방법2 : 외부클래스의 멤버에서 내부 클래스의 멤버를 호출 후 메인에서는 
		SawonOuter sawon = new SawonOuter();
		sawon.process();

	}

}




