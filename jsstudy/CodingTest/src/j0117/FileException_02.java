package j0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//FileNotFoundException 부분을 IOException 으로 바꿔도 에러가 안남.
//→  IOException 이 FileNotFoundException 의 조상 /

public class FileException_02 { //0116_12
	
	public static void scoreRead() throws FileNotFoundException, IOException {
		//throws 예외처리 인셉션들을 입력해서 try~catch가 없고 메인으로 예외처리들을 다 넘김!!!
		
		//1.파일 경로
		String fileName = "C:\\eclipse\\firestudy\\score.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		//2.변수선언
		int cnt = 0; //갯수
		int total = 0; //합계
		double avg = 0; //평균
		
		
		//3.파일읽기위해 파일 열기
		
		fr = new FileReader(fileName); 
		System.out.println("파일을 정상적으로 읽음");
		
		br = new BufferedReader(fr);
		
		//4.반복문
		while(true) {
			String s = br.readLine();
			
			if(s == null) {
				break;
			}
			//5. 문자열 점수를 변환하여 합계랑 갯수 구하기.
			cnt++;
			total += Integer.parseInt(s);
		}
		//6. 평균구하기
		avg = (double)total / cnt;
		
		//7.프린트 입력
		System.out.println("총 갯수 : " + cnt);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		
		
		//8.자원 닫기
		br.close();
		fr.close();
		
		
	}

	public static void main(String[] args) {
		// 9. 출력하기 (throws를 써서 메인으로 예외 처리를 보냈으므로 try ~catch 문 작업
		
		try {
			scoreRead();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------------------------");
		System.out.println("정상종료");

	}

}
