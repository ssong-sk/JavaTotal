package j0118;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

// *********************** 파일 복사 _ FileWriter (문자기반 텍스트 파일만 저장 가능)
/* -덮어 쓰지 않고 파일 뒤쪽에 붙여쓰고 싶으면 FileWriter 생성자의 두번째 인자로 true값을 주면됨.
 * 
 * 
 *  * *******************폴더 내 파일 읽기 _ BufferedWriter (System.out.println() 유사)
 * -버퍼를 잡아 놓기 떄문에 flush() / close()를 반드시 호출해 뒤처리!
 * -write() 버퍼에 있는 값 전부 출력 / flush() 남이있는 데이터를 모두 출력 / close() 스트림을 닫음(끝냄)
 */
public class FileWriter_01 { //0117_03

	public static void fileWrite() {

		// 1.파일 복사 및 경로 지정
		FileWriter fw = null;
		String fName = "C:\\eclipse\\firestudy\\test1.txt";

		// 2.파일 새로 생성해주기.
		try {
			fw = new FileWriter(fName); // 2-1.복사할 파일 새로 생성해주기.

			// 2-2. 파일에 내용 추가하여 저장
			fw.write("Have a Nice Day~\n"); // 메모장 줄바꿈 꼭 해주기!!
			fw.write("나는 열심히 해서 반에서 1등할거야!!!\n");
			fw.write("시간은 그런데 벌써 목요일이야ㅠ.ㅠ\n");
			fw.write(new Date().toString()); // 오늘 날짜 데이터 새로 생성해주기.

			// 3. finally 해주고 복사한 파일 닫기
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

	public static void fileWrite2() {

		// 1. 파일 복사 및 경로 지정

		FileWriter fw = null;
		String fName = "C:\\eclipse\\firestudy\\test1.txt";

		// 2.파일 복사 생성하고 예외처리하기

		try {
			fw = new FileWriter(fName,true); //뒤에 붙여서 넣을거면 true로 입력!
			
			//3. 내보낼 값 입력
			fw.write("그래서 오늘은 언제 잘거니?\n");
			fw.write("내일 금요일이니까 오늘 배운거까지는 복습하고 자야지!!\n");
			fw.write("예~~~~~~~~~~~~");
			
			//4.finally 및 close 작성
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
		// TODO Auto-generated method stub
		//fileWrite();
		fileWrite2();

	}

}
