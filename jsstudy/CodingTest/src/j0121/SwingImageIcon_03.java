package j0121;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
◈ FlowLayout _왼쪽부터 순서대로 오른쪽으로 배치

◈ BorderLayout _컨테이너의 공간을 위쪽,아래,왼쪽,오른쪽,중앙으로 배치

◈ GirldLayout +컨테이너의 공간을 2차 그리드로 나누고, 입력하는 순서대로 우로, 위에서 아래로 배치

◈ CardLayout _글자 그래도 카드쌓듯이 컴포넌트를 배치하는 기능
 * 
 */

//1. 상속 및 jframe 형성                        //5. 액션이벤트 추가하기
public class SwingImageIcon_03 extends JFrame implements ActionListener { // 0118_06

	// 1-1. 변수선언
	Container cp;
	JButton btn1, btn2, btn3, btn4, btn5;

	// 1-2. 이미지 아이콘 가져오기
	ImageIcon icon1 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\LEFT.GIF");
	ImageIcon icon2 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\leftDown.gif");
	ImageIcon icon3 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\leftRollover.gif");
	ImageIcon icon4 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\chick.gif");
	ImageIcon icon5 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\img_msn_i10.gif");

	// 2.메서드 형성(상속)
	public SwingImageIcon_03(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(300, 100, 300, 300);
		this.setBackground(new Color(255, 204, 000));

		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {

		// 4-1. 그리드 레이아웃 2행 2열 만들기
		this.setLayout(new GridLayout(2, 2));

		// 4-2.생성 및 이름 / 아이콘추가 / 위치지정 / 글씨 위치지정 / 버튼 프레임 추가

		// 버튼 1
		btn1 = new JButton("Hello", icon1);
		btn1.setHorizontalTextPosition(JButton.CENTER); // 텍스트 수평 위치 - Left , center, right
		btn1.setVerticalTextPosition(JButton.TOP); // 텍스트 수직 위치 - top, conter, bottom
		this.add(btn1);

		btn1.setRolloverIcon(icon2); // 마우스를 올려놓았을 경우
		btn1.setPressedIcon(icon3); // 마우스를 클릭했을 경우

		// 버튼 2
		btn2 = new JButton(icon4);
		this.add(btn2);

		// 버튼3
		btn3 = new JButton("스윙버튼");
		this.add(btn3);

		// 버튼4
		btn4 = new JButton("자고싶어", icon5);
		btn4.setHorizontalTextPosition(JButton.CENTER);
		btn4.setVerticalTextPosition(JButton.TOP);
		this.add(btn4);
		
		// 5-4. 각 버튼 이벤트(액션) 발생하기 - 이벤트 핸들러와 이벤트 발생한 객체를 버튼을 통해 연결
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

	}

	// 5-1. 액션퍼폼에 대한 오버라이드 생성하기
	@Override
	public void actionPerformed(ActionEvent e) {
		// 5-2. 오브젝트 메서드를 사용해서 이벤트 리스너를 등록한 무언가를 실행할 경우
		// 이벤트를 발생시킨 객체의 위치값을 가져옴!!!!!
		Object ob = e.getSource();

		// 5-3. 버튼을 누를 경우 나오는 메세지를 출력! (각 버튼마다 만들기)
		// JOptionPane.showMessageDialog 단순한 알림창을 띄울 수 있는 함수
		if (ob == btn1) {
			JOptionPane.showMessageDialog(this, "왜눌러");
		} else if (ob == btn2) {
			JOptionPane.showMessageDialog(this, "나 병아리 아니다");
		} else if (ob == btn3) {
			JOptionPane.showMessageDialog(this, "스윙 싫어");
		} else if (ob == btn4) {
			JOptionPane.showMessageDialog(this, "언제 잘건데!!!!");
		}

	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingImageIcon_03("아이콘 클릭");

	}

}
