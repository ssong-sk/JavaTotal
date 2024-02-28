package j0118;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLay_07 extends JFrame { // 0118 _03

	// 1. 변수선언
	Container cp;
	JButton btn1; // 버튼타입의 변수 선언!
	
	//2.퍼블릭 생성 후 변수 타입 및 명 적어주기 (상속받아온 메서드)
	public SwingLay_07(String title) { 
		super(title);
		
		//2-1. 창 생성
		cp = this.getContentPane();
		
		//2-2. 크기 및 배경색 지정
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 000));
		
		//2-3. 버튼 생성
		
		btn1 = new JButton("ONE");
		this.add("North", btn1);
		
		//3. 컴포넌트(버튼) 위치와 방향 설정해주기
		//(프레임은 기본 BorderLayout / 새로 할 경우 new를 붙여서 사용 (위치 지정 필수!!)
		
		
		
		this.add("South", new JButton("아래쪽"));
		this.add("West", new JButton("오른쪽"));
		this.add("East", new JButton("왼쪽"));
		this.add("Center", new JButton("가운데"));
		
		//4. 버튼에 속성 추가하기
		btn1.setBackground(Color.black); //버튼 배경색 변경
		btn1.setForeground(Color.yellow); //버튼 글자색 변경
		
		
		
		
		//필수!!!로 창 표기!!!!
		this.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new SwingLay_07("Yellow");

	}

}
