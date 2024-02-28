package j0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadSawon_07 { //0117_02
	/*
	 * 사원, 기본급, 가족수, 초과근무시간, 가족수, 시간수당, 가족수당, 총급여
	 * 가족수 * 30000
	 * 초과근무시간 * 20000
	 * 
	 */
	public static void fileReadSawon() {
		//1.파일위치 및 선언
		String sName = "C:\\eclipse\\firestudy\\sawon.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		
		//2.읽기 위해 파일 열기
		try {
			fr = new FileReader(sName);
			br = new BufferedReader(fr);
			
			//2-1. 제목출력
			System.out.println("*****기본 급여 정보(사원)*****");
			System.out.println("사원\t기본급\t가족수\t초과근무시간\t시간수당\t가족수당\t총급여");
			System.out.println("------------------------------------------------------------------------------------------");
			
			//3.반복문 작성
			while(true) {
				String s = br.readLine();
				
				//3-1.if문 작성
				if(s == null) {
					break;
				}
				//4.분리 방법
				String [] data = s.split(",");
				
				
				int sudang = Integer.parseInt(data[3]) * 20000;
				int fsudang = Integer.parseInt(data[2]) * 30000;
				int total = Integer.parseInt(data[1]) + sudang + fsudang;
				
				
				//5.최종출력문
				System.out.println(data[0] + "\t" + data[1] + "\t  " + data[2] + "\t   " + data[3] + 
						"\t        " + sudang + "\t" + fsudang + "\t" + total);
				
			}
			//6. finally작성
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
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("\"*****기본 급여 지급완료(사원)*****\"");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fileReadSawon();

	}

}
