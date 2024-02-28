package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*1. FileReader 파일을 담고
 * 2. BufferReader 버퍼리더에서 읽어주기 때문에 같이 사용 / 장점 _스캐너 보다 빠름.
 * 3. Scanner 단점_ 느림
 */

//BufferReader : 버퍼를 사용해서 파일읽기
//FileReader : 경로에 있는 파일로드 : Exception발생

public class FileException_11 {

	public static void read() {
		String fileName = "C:\\eclipse\\file\\memo.txt"; //슬래시는 \\2번은 /한번이랑 같음...
		BufferedReader br = null;
		FileReader fr = null; //문자단위

		//일기 위해서 파일 열기
		try {
			fr = new FileReader(fileName);
			System.out.println("파일을 열었습니다.");

			br = new BufferedReader(fr);

			//여러줄을 읽어야 하므로 while문으로 읽어보기
			while (true) {

				String s = br.readLine(); //멀티catch가 필요하므로 try catch 다음의 chtch를 입력해준다.

				//마지막줄일경우 null값을 읽는다. null 값일 경우 while문 빠져나간다.
				if (s == null) {
					break;
				}
				System.out.println(s);
			}

		} catch (FileNotFoundException e) { //파일이 없을 수도 있다는걸 미리 방지하기 위해 try catch를 해야함.
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일이 없음" + e.getMessage());
		} catch (IOException e) { //catch 추가 (멀티)
			// TODO: handle exception	
		} finally {
			try {
				br.close(); //생성한 반대순으로 닫아준다.
				fr.close();
				
				System.out.println("파일에 대한 자원을 모두 닫았어요.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		
		System.out.println("정상종료");

	}

}
