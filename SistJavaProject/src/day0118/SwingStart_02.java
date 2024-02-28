package day0118;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class SwingStart_02 extends JFrame{ //jframe import해주기!!!
	
	//변수선언
	Container cp; //컨테이너는 담은 그릇......
	
	public SwingStart_02(String title) {
		super(title);
		
		cp = this.getContentPane(); //프레임으로 불러온 또 하나의 패널 
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 000));
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingStart_02("스윙시작"); //창 제목 출력하는 방법!

	}

}
