package j0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//파일 입출력
/*
 * ***********************파일 읽기 _ FileReader (Enter만 경계로 인식, String으로 고정 / 텍스트 파일을 자바 프로그램으로 읽어서 사용!)
 * 
 * 파일 복사 _ FileWriter (문자기반 텍스트 파일만 저장 가능)
 * -덮어 쓰지 않고 파일 뒤쪽에 붙여쓰고 싶으면 FileWriter 생성자의 두번째 인자로 true값을 주면됨.
 * 
 * 
 * ********************파일 쓰기 _ BufferedReader (Scanner와 유사)
 * -readLine() 이라는 메서드를 사용
 * -readLine() 사용시 리턴값을 String으로 고정되기 떄문에 다른 타입으로 입력을 받을 경우 형변환!!!
 * -readLine을 할때마다 try & catch를 활용하여 예외처리 (또는 throws IOException으로 작업하고 클래스 improt해줘야함, main 클래스 옆에 작성)
 * -read한 데이터는 Line 단위로만 나눠지기 떄문에 공백단위로 데이터를 가공하려면 따로 작업 필요!!!
 *   1. stringtokenizer에 nextToken()함수를 쓰면 리드라인을 통해 입력받은 값은 공백단위로 구분하여 순서대로 호출!!!!!!!!
 *   2. String.split() 함수활용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용!!!!
 *   
 *   
 * *******************폴더 내 파일 읽기 _ BufferedWriter (System.out.println() 유사)
 * -버퍼를 잡아 놓기 떄문에 flush() / close()를 반드시 호출해 뒤처리!
 * -write() 버퍼에 있는 값 전부 출력 / flush() 남이있는 데이터를 모두 출력 / close() 스트림을 닫음(끝냄)
 * 
 * 
 * => 둘은 모두 기존에 쓰던 스캐너와 시스템 아웃 프린트보다 속도 측면에서 훨씬 빠르기 떄문에 많은양의 데이터 처리할 떄 유리.
 * => 네개를 사용하려면 import가 추가적으로 필요 ***이클립스 에서 ctrl+shift+o 를 누르면 자동으로 추가됨
 * 
 * 
 * java 기본 기능으로 파일 내용을 읽고, 새로운 파일에 쓰는 방법!!!!
 */

public class FileException_01 { //0116_11
	/////////////////////////////////////////
	public static void read() {
		String fileName = "C:\\eclipse\\firestudy\\memo.txt";  //문자열 변수명 = 경로\\명칭.txt - 파일 복사해서 가져오기(filewriter)
		FileReader fr = null; //파일읽기
		BufferedReader br = null; //파일쓰기
		
		//1.읽기 위해 파일 열기!!!
		try {
			fr = new FileReader(fileName); //입력시 try ~ catch 선택해줌
		    System.out.println("파일을 열었습니다.");
		    
			br = new BufferedReader(fr); //파일 읽을것을 가져와서 쓰기
			
			//2.try안에서 여러줄을 읽어야 하므로 while문으로 읽어보기
			while(true) {
				String s = br.readLine(); //파일 쓰는곳을 입력받을 곳을 문지열로 받음 -> 쓰고 난 후 예외처리필수!!!(멀티 catch사용)
				
				//3. 입력한 값이 null이면 while문 빠져나옴 -> if밖에 입력한 값 시스템 출력까지 해줌.
				if(s == null) {
					break;
				}
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {  //1-1fr new FileReader 생성에 대한 예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) { //2-1문자열 s 입력받은 생성에 관한 예외처리
			// TODO: handle exception
		}finally { //4. 최종 예외 처리를 마무리하는 finally 사용
			try {
				br.close(); //4-1 파일쓰기를 다하고 닫아줌 -> try catch로 예외처리!!!
				fr.close(); //4-2 파일 읽은것도 닫아줌
			} catch (IOException e) { //catch에 대한 예외처리
				// TODO Auto-generated catch block
				e.printStackTrace(); //예외 발생당시 있었던 메소드의 예외 메세지를 화면에 출력
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		
		System.out.println("------------------------");
		System.out.println("정상종료");

	}

}
