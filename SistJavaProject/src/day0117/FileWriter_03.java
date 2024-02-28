package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriter_03 {

	public static void fileWrite() {

		FileWriter fw = null;
		String fileName = "C:\\eclipse\\file\\test1.txt";

		try {
			fw = new FileWriter(fileName); //파일 새로 생성(같은 이름이 있어도 새로 생성)
			//파일에 내용 추가
			fw.write("Have a Nice Day~~~~~\n"); //메모장 줄넘김
			fw.write("오늘은 수요일\n");
			fw.write(new Date().toString()); //날짜 데이터!!!!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}
	public static void fileWrite2() {
		FileWriter fw = null;
		String fileName = "C:\\eclipse\\file\\test1.txt";
		
		try {
			fw = new FileWriter(fileName,true);//true로 하면 추가모드
			
			fw.write("\n내 이름은 송승경\n");
			fw.write("-----------------------\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
				

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileWrite();
		//fileWrite2();

	}

}
