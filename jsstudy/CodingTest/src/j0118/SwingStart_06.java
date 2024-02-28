package j0118;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

//1. extends 상속과 JFrame을 생성해주기
public class SwingStart_06 extends JFrame{
	
	//2. 변수 선언
	Container cp; //-> 다른 컴포넌트를 담는 그릇
	
	//3. 창사이즈 및 백그라운 색상, 창 표기  
	public SwingStart_06(String title) {
		super(title);
		
		//3-1. 컨테이너를 JFrame 이 가지고 있는 컨텐트팬을 리턴 변수 선언
		cp = this.getContentPane();
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 000));
		this.setVisible(true);
	}

	public static void main(String[] args) { //0118_02
		
		//4. 창 신설 (상단 제목 문자열)
		new SwingStart_06("Swing Start");

	}

}
