package j0118;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fwrite_02 { //0117_04
	
	//1.스캐너 생성( 생성되는 동시에 Fwrite_02도 동시에 생성)
	Scanner in;
	
	//2.파일 복사 및 경로지정
	FileWriter fw = null;
	static final String FNAME = "C:\\eclipse\\firestudy\\member.txt"; 
	
	//3. 메소드 만들어서 스캐너 생성
	public Fwrite_02() {
		in = new Scanner(System.in);
	}
	
	
	public void dataWrite() {
		//4.복사할 파일 생성자 만들기
		try {
			fw = new FileWriter(FNAME, true);
			
			//4-1.키보드로 이름, 주소, 핸드폰 번호 입력 후 파일에 저장하기!!!
			System.out.println("이름입력");
			String name = in.nextLine();
			System.out.println("주소입력");
			String addr = in.nextLine();
			System.out.println("연락처입력");
			String hp = in.nextLine();
			
			System.out.println("*********파일저장을 완료했습니다.!!!!!************");
			
			//4-2. 파일 저장하기
			fw.write("회원명 : " + name + "\n");
			fw.write("주소 : " + addr + "\n");
			fw.write("연락처 : " + hp + "\n");
			fw.write("==================================\n");
			
		//5. finally 작성 및 close 작성	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		//6. 클래스명 new 생성하여서 출력하기!!!
		Fwrite_02 fw = new Fwrite_02();
		fw.dataWrite();

	}

}
