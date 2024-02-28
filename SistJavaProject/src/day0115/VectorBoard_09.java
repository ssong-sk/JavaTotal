package day0115;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_09 {

	List<Board_09> list = new Vector<Board_09>(); //제너릭에  멤버클래스를 넣어주면 된다.
	//제네릭 유형을 클래스로 지정했으므로 데이터를 꺼내고 받을떄도 클래스
	
	
	
	//입력메서드
	public void inputData() {
		Scanner in = new Scanner(System.in);
		String writer, subject, content;
		
		System.out.println("작성자명은?");
		writer = in.nextLine();
		System.out.println("제목은?");
		subject = in.nextLine();
		System.out.println("내용은?");
		content = in.nextLine();
		
		Board_09 data = new Board_09(writer, subject, content);
		list.add(data); //값이 추가가 되어야 하므로 add 사용
		
		System.out.println("현재 데이터 객수 : " + list.size() + "개");
	}
	
	
	
	//출력메서드
	public void writeData() {
		System.out.println("**IT교재 목록**");
		System.out.println("=============================================");
		for(int i = 0; i < list.size(); i++) {
			Board_09 b = list.get(i); //변환해서 작업 // 리스트에서 담겨져 있는 값을 돌려주는 값
			System.out.println("No. " + (i + 1) + "\n작성자 : " + b.getWriter());
			System.out.println("제목 : " + b.getSubject());
			System.out.println("내용 : " + b.getContent());
			System.out.println("=============================================");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VectorBoard_09 vt = new VectorBoard_09();
		Scanner in = new Scanner(System.in); //출력하기 위해 스캐너 작성
		int n;
		
		while(true) {
			System.out.println("1.입력 2.전체출력 9.종료");
			n = Integer.parseInt(in.nextLine());
			
			if(n == 1) {
				vt.inputData();
			}
			else if(n == 2) {
				vt.writeData();
			}
			else if(n == 9){
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}
