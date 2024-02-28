package j0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileTokenException_04 { //0116_14
	
	public static void fileRead() {
		//1. 파일경로
		String fName = "C:\\eclipse\\firestudy\\info.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		//2. 읽기 위해 파일 열기
		
		try {
			fr = new FileReader(fName);
			br = new BufferedReader(fr);
			
			//2-1. 파일 읽는 결과에 대해 제목 출력하기
			System.out.println("***개인정보 조회 결과***");
			System.out.println("이름\t주소\t나이");
			System.out.println("----------------------------------------");
			
			//3.while문으로 읽어보기
			while(true) {
				String s = br.readLine();
				
				//3-1. 조건이 아니면 종료한다는 if문 작성
				if(s == null) {
					break;
				}
				
				//4.분리하기 방법#1
				/*String [] data = s.split(",");
				System.out.println(data[0] + "\t" + data[1] + "\t" + data[2]);*/
				
				//4.분리하기 방법#2
				StringTokenizer st = new StringTokenizer(s, ",");
				System.out.println(st.nextToken() + "\t" + st.nextToken() + "\t" + st.nextToken());
				
			}
			
			//5.finally 작성 종료
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("----------------------------------------");
		System.out.println("조회 결과 종료");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fileRead(); //출력가지고 있는 메소드 호출!!!!
		

	}

}
