package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingImageIcon_06 extends JFrame implements ActionListener {

	private static final String BOTTOM = null;

	// 변수선언
	Container cp; // 컨테이너는 담은 그릇......

	// 이미지 아이콘 가져오기
	ImageIcon icon1 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\LEFT.GIF");
	ImageIcon icon2 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\leftDown.gif");
	ImageIcon icon3 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\leftRollover.gif");
	ImageIcon icon4 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\chick.gif");
	ImageIcon icon5 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\img_msn_i10.gif");

	JButton btn1, btn2, btn3, btn4, btn5;

	public SwingImageIcon_06(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 000));

		initDesign();

		this.setVisible(true);

	}

	public void initDesign() {
		// 그리드 레이아웃 2행 2열
		this.setLayout(new GridLayout(2, 2));
		btn1 = new JButton("hello", icon1);
		btn1.setHorizontalTextPosition(JButton.CENTER); // 가로의 가운데에생성 -> 글씨 위치 조정하는 방법 / 텍스트 가로방향
		btn1.setVerticalTextPosition(JButton.BOTTOM); // 텍스트 세로
		this.add(btn1);

		btn1.setRolloverIcon(icon2); // 마우스를 올려놓았을 경우
		btn1.setPressedIcon(icon3); // 마우스로 클릭했을 경우

		// 버튼2
		btn2 = new JButton(icon4);
		this.add(btn2);

		// 버튼3
		btn3 = new JButton("스윙버튼");
		this.add(btn3);

		// 버튼4
		btn4 = new JButton("안녕", icon5);
		this.add(btn4);

		// 이벤트 객체(핸들러와 연결) this.add와 연결 된다는 뜻!!!
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object ob = e.getSource(); // 명확한 객체를 주기 위해 사용!!!

		if (ob == btn1) {
			JOptionPane.showMessageDialog(this, "꽝!");
		} else if (ob == btn2) {
			JOptionPane.showMessageDialog(this, "나는 병아리가 아니다!");
		} else if (ob == btn3) {
			JOptionPane.showMessageDialog(this, "스윙스윙");
		} else if (ob == btn4) {
			JOptionPane.showMessageDialog(this, "그랭~");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingImageIcon_06("이미지버튼6");

	}

}
