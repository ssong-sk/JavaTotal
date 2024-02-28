package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fwrite_04 {
	
	Scanner sc; //스캐너가 생성이 될때 Fwrite_04도 동시에 생성
	FileWriter fw;
	static final String FILENAME = "C:\\eclipse\\file\\member.txt";
	
	public Fwrite_04() {
		sc = new Scanner(System.in); //메인에서 생성이 되었을 때 스캐너가 동시에 실행이 된다!
		
	}
	
	public void dataWrite() {
		try {
			fw = new FileWriter(FILENAME, true);//true를 쓰면 멤버1명 쓰면 실행하면 2, 또 실행하면 3
			
			//키보드로 이름, 주소, 핸드폰 번호 입력 후 파일에 저장
			System.out.println("이름입력");
			String name = sc.nextLine();
			System.out.println("주소입력");
			String addr = sc.nextLine();
			System.out.println("연락처 입력");
			String hp = sc.nextLine();
			
			System.out.println("**파일저장! 파일을 확인하세요**");
			
			//파일에 저장
			fw.write("회원명 : " + name + "\n");
			fw.write("주소 : " + addr + "\n");
			fw.write("연락처 : " + hp + "\n--------------------------\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fwrite_04 fw = new Fwrite_04();
		fw.dataWrite();

	}

}
