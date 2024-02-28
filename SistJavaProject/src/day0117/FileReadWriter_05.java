package day0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import javax.imageio.IIOException;

public class FileReadWriter_05 {
	
    static final String FILENAME = "C:\\eclipse\\file\\sungjuk.txt";
    FileReader fr = null;
    BufferedReader br = null;
    FileWriter fw = null;
    
    Scanner in = new Scanner(System.in);
    
    public int getMenu() {
    	int num = 0;
    	System.out.println("1.추가  2.전체출력  9.종료");
    	num = Integer.parseInt(in.nextLine());
    	return num;
    }
    
    //정보를 입력해서 파일에 저장
    public void sungjukWrite() {
    	//이름 점수입력
    	
    	System.out.println("학생명을 입력하세요");
    	String name = in.nextLine();
    	System.out.println("점수를 입력하세요");
    	int score = Integer.parseInt(in.nextLine());
    	
    	//파일에 저장
    	try {
    		fw = new FileWriter(FILENAME,true);
    		
    		//입력된 내용 파일에 저장
    		fw.write(name + "\n");
    		fw.write(score + "\n");
    		
    		System.out.println("**학생 성적이 저장되었습니다.**");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
    	
    	
    }
    //파일 읽어서 계산 후 출력
    public void sungjugRead() {
    	//제목부터 출력
    	System.out.println("\t***학생성적정보***");
    	System.out.println();
    	System.out.println("번호\t학생명\t점수\t학점");
    	System.out.println("--------------------------------");
    	
    	try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			int num = 0;
			
			while(true) {
				String name = br.readLine();
				
				if(name == null) {
					break;
				}
				int score = Integer.parseInt(br.readLine());
				String grade = getGrade(score);
				
				System.out.println(++num + "\t" + name + "\t" + score + "\t" + grade);
				
			}
			System.out.println("**출력 끝**");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IIOException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
    	
    }
    
    //점수에 대한 학점을 반환하는 메서드 
    public String getGrade(int score) {
    	String grade;
    	
    	if(score >= 90) {
    		grade = "A";
    	}
    	else if(score >= 80) {
    		grade = "B";
    	}
    	else if(score >= 70) {
    		grade = "C";
    	}
    	else if(score >= 60) {
    		grade = "D";
    	}
    	else {
    		grade = "F";
    	}
    	return grade;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReadWriter_05 frw = new FileReadWriter_05();
		
		while(true) {
			int num = frw.getMenu();
			
			switch(num) {
				case 1 : 
					System.out.println("학생정보 입력");
					frw.sungjukWrite();
					break;
				case 2 : 
					System.out.println("학생정보 출력");
					frw.sungjugRead();
					break;
				case 9 :
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					default :
						System.out.println( "번호를 다시 한번 확인 후 입력해주세요.");
			}
		}

	}

}
