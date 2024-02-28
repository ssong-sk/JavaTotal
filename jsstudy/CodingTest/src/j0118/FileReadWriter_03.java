package j0118;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriter_03 { // 0117_05

	// 1.new 스캐너 생성
	Scanner in = new Scanner(System.in);

	// 2.경로 및 파일 읽기, 쓰기, 복사 변수 설정하기!!
	static final String FNAME = "C:\\eclipse\\firestudy\\sungjuk.txt";
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	int num = 0; // 번호 변수 입력

	// 3.선택할 메뉴 출력 내보내는 메서드 생성
	public int getMenu() {
		int num = 0;
		System.out.println("1.추가   2.전체출력   9.종료");
		num = Integer.parseInt(in.nextLine());

		return num;

	}

	// 4.정보를 입력받아 파일 저장
	public void sungjukWrite() {

		System.out.println("학생명 입력");
		String name = in.nextLine();
		System.out.println("점수 입력");
		int score = Integer.parseInt(in.nextLine());

		// 4-1. 파일 복사

		try {
			fw = new FileWriter(FNAME, true);

			// 4-2. 파일 저장
			fw.write(name + "\n");
			fw.write(score + "\n");

			System.out.println("*****성적이 정상적으로 등록완료!*****");

			// 5. finally 및 close
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

	public void sungjukRead() {
		// 6. 메서드 생성 후 제목 출력 값 입력
		System.out.println("\t****학생성적 정보****");
		System.out.println();
		System.out.println("번호\t학생명\t점수\t학점");
		System.out.println("-----------------------------------------");

		// 7. 파일 읽기 및 쓰기 new 생성자만들기
		try {
			fr = new FileReader(FNAME);
			br = new BufferedReader(fr);

			// 7-1.여러 줄을 읽어야 하므로 while문 생성하고 if문 작성
			while (true) {
				String name = br.readLine();

				if (name == null) {
					break;
				}

				// 8-1. 계산식 쓰기 (학점 계산메서드 가져와서 마무리)

				int score = Integer.parseInt(br.readLine()); // score 변수에는 사용자가 입력한 값의 정수형이 저장
				String greade = getGrade(score);

				// 8-2. 출력값
				System.out.println(++num + "\t" + "name" + "\t" + score + "\t" + greade);
			}

			System.out.println("**********출력 끝*************");

			// 9. finally 및 close
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 8. 학점에 관한 메서드 만들어서 반환
	public String getGrade(int score) {
		String grade;

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade; // 여기서 리턴은 종료한다는 의미

	}

	public static void main(String[] args) {
		// 10. 출력할 메서드 생성자 만들기
		FileReadWriter_03 frw = new FileReadWriter_03();

		// 11.while문으로 돌려주며 조건 달아서 출력하기 (제목에 있는 1,2,9에 대한)
		while (true) {
			int num = frw.getMenu();

			switch (num) {
			case 1:
				System.out.println("학생정보 입력");
				frw.sungjukWrite();
				break;
			case 2:
				System.out.println("학생정보 출력");
				frw.sungjukRead();
				break;
			case 9:
				System.out.println("프로그램 종료합니다.");
				System.exit(0);
			default:
				System.out.println("번호를 다시 입력해주세요.");

			}
		}

	}

}
