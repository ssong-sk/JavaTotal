package day0118;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//1. 상속 및 jframe 형성  
public class SwingLabelRandom_12 extends JFrame { // 0119_01

	// 1-1. 변수선언
	Container cp;
	JLabel[] lblLabel = new JLabel[9];
	String[] str = { "밥", "김치", "불고기", "김치찌개", "계란말이", "오징어무침", "오징어채", "시금치나물", "물" };
	JButton btn;

	// 2.메서드 형성(상속)
	public SwingLabelRandom_12(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(800, 100, 500, 500);
		this.setBackground(new Color(255, 205, 204));
		
		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}
	// 4. 디자인 메서드 생성
	public void initDesign() {
		
	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingLabelRandom_12("랜덤 라벨 만들기");

	}

}
