package j0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizFileException_05 { //0116_15
	
	public static void fileRead() {
		//1. 파일경로
		String fName = "C:\\eclipse\\firestudy\\fruitshop.txt";
		FileReader fr = null;
		BufferedReader br = null;
		int cnt = 0;
		int sum = 0;
		
		//2.읽기 위해 파일 열기
		try {
			fr = new FileReader(fName);
			br = new BufferedReader(fr);
			
			System.out.println("*****과일 입고 목록*****");
			System.out.println("번호\t과일명\t수량\t단가\t총금액");
			System.out.println("----------------------------------------------------");
			
			//3. while문으로 반복 읽기
			
			while(true) {
				String s = br.readLine();
				
				//4.if문으로 빠져나오는 조건 설정
				if(s == null) {
					break;
				}
				//5. 계산 및 분리
				/*cnt++;
				String [] data = s.split(",");
				
				int tot = Integer.parseInt(data[1]) * Integer.parseInt(data[2]);
				System.out.println(cnt + "\t" + data[0] + "\t" + data[1] + "\t" + data[2] + "\t" + tot);*/
				
				
				//5. 계산 및 분리방법 #2 => 텍스트 창에 없는 변수들을 새로 선언해서 계산해줘야 한다!!!
				StringTokenizer st = new StringTokenizer(s, ",");
				
				String sang = st.nextToken();
				int su = Integer.parseInt(st.nextToken());
				int dan = Integer.parseInt(st.nextToken());
				int total = su * dan;
				
				System.out.println(++cnt + "\t" + sang + "\t" + su + "\t" + dan + "\t" + total);
				
				
				
			}
			
			//6. 파이널 닫기
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
		System.out.println("----------------------------------------------------");
		System.out.println("*****과일 입고 종료*****");
	}

	public static void main(String[] args) {
		fileRead();

	}

}
