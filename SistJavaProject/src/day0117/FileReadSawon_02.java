package day0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * 사원, 기본급, 가족수, 초과근무시간
 * 가족수 * 30000
 * 초과근무시간 * 20000
 * 
 */
public class FileReadSawon_02 {
	
	public static void fileReadSawon() {
		String fileName = "C:\\eclipse\\file//sawon.txt";
		FileReader fr = null;
		BufferedReader br = null;
		int num = 1;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			System.out.println("**기본 급여 정보**");
			System.out.println("사원\t기본급\t가족수\t초과근무시간\t가족수\t시간수당\t가족수당\t총급여");
			System.out.println("------------------------------------------------------------------");
			
			while(true) {
				String s = br.readLine();
						
				if(s == null) {
					break;	
				}
				StringTokenizer st = new StringTokenizer(s, ",");
				String name = st.nextToken();
				int gibon = Integer.parseInt(st.nextToken().trim());
				int famsu = Integer.parseInt(st.nextToken().trim());
				int timesu = Integer.parseInt(st.nextToken().trim());
				
				int famasudang = famsu * 30000;
				int timesudang = timesu * 20000;
				int totalPay = gibon + famasudang + timesudang;
				
				System.out.println(num++ + "\t" + name + "\t" + gibon + "\t" + famsu + "\t" + timesu + 
						"\t" + famasudang + "\t" + timesudang + "\t" + totalPay);
				
				
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileReadSawon();
		

	}

}
