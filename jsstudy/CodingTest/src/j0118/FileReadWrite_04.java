package j0118;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite_04 { // 0117_06

	// 1. 스캐너 생성
	Scanner in = new Scanner(System.in);

	// 2. 경로선언 및 변수선언
	static final String FILENAME = "C:\\eclipse\\firestudy\\sangpum.txt";
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;

	// 3.메뉴 선택해서 사용하는 메서드 형성
	public int getMenu() {
		int num;

		System.out.println("[메뉴선택]   1.상품추가   2.전체상품출력   3.파일삭제   9.종료");
		num = Integer.parseInt(in.nextLine());
		return num;
	}

	// 4.정보를 입력받아 파일 저장하기 (상품명, 수량, 단가)
	public void sangpumAdd() {

		System.out.println("상품명 입력");
		String sangpum = in.nextLine();
		System.out.println("수량 입력");
		int su = Integer.parseInt(in.nextLine());
		System.out.println("단가 입력");
		int dan = Integer.parseInt(in.nextLine());

		// 4-1.파일 복사

		try {
			fw = new FileWriter(FILENAME, true);
			fw.write(sangpum + "," + su + "," + dan + "\n");
			System.out.println("***********추가완료**************");

			// finally & close
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

	public void fileAllDatas() {
		// 6.메서드 생성 후 변수 선언(콘솔창에)

		int total = 0; // 총금액
		int num = 0; // 번호

		// 6-1. 제목출력
		System.out.println("번호\t상품명\t수량\t단가\t총금액");
		System.out.println("===============================================");

		// 7. 파일 읽기, 쓰기 생성자 만들기

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			// 8. while문 생성과 if문
			while (true) {
				String s = br.readLine();

				if (s == null) {
					break;
				}

				// 8-1. 배열 및 계산식
				String[] data = s.split(",");
				String sangpum = data[0];
				int su = Integer.parseInt(data[1]);
				int dan = Integer.parseInt(data[2]);

				int sum = su * dan;
				total += sum;

				// 8-2. 출력
				System.out.println(++num + "\t" + sangpum + "\t" + su + "\t" + dan + "\t" + total);

			}
			System.out.println("\t                     총금액은 : " + total + "원");
			System.out.println("****************입력종료******************");

			// 9. finally & close
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

	// 10. 파일 삭제 하는 방법 / 메서드 생성
	public void deleteShop() {
		// 10-1. 저장된 파일명 생성
		File file = new File(FILENAME);

		// 10-2. 파일이 존재했다면 다시 삭제
		if (file.exists()) {
			file.delete();
		}
		System.out.println("****************파일이 삭제됨**********************");
	}

	// 11.while문으로 돌려주며 조건 달아서 출력하기 (제목에 있는 1,2,3.9에 대한)
	public void process() {
		while (true) {
			int num = 0;

			num = this.getMenu();

			switch (num) {
			case 1:
				System.out.println("상품정보를 입력합니다.");
				sangpumAdd();
				break;
			case 2:
				System.out.println("전체 상품을 출력합니다.");
				fileAllDatas();
				break;
			case 3:
				System.out.println("생성된 파일을 삭제합니다.");
				deleteShop();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("숫자 확인 후 다시입력해주세요.");

			}
		}
	}

	public static void main(String[] args) {
		//12.출력할 메서드 및 선택조건 입력
		FileReadWrite_04 frw = new FileReadWrite_04();
		frw.process();
		

	}

}
