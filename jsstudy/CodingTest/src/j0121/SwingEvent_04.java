package j0121;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//1. 상속 및 jframe 형성 
public class SwingEvent_04 extends JFrame { // 0118_07 _ 각 버튼 누르면 해당 컬러버튼대로 백그라운드 색깔이 변경됨.

	// 1-1. 변수선언
	Container cp;
	JButton btn1, btn2;

	// 2.메서드 형성(상속)
	public SwingEvent_04(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(300, 100, 300, 300);
		this.setBackground(new Color(250, 250, 250));

		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {
		// 4-1.3개의 버튼을 만들면 플로우 레이아웃에 배치, 간격, 크기 조절하는 생성자 만들기
		this.setLayout(new FlowLayout());

		// 4-2. 버튼 생성 및 이름 / 버튼 프레임 추가하기.add(Component) 메서드를 JFrame을 추가한다는 뜻!!!
		btn1 = new JButton("버튼색 Gray만들기");
		this.add(btn1);
		btn2 = new JButton("버튼색 Green만들기");
		this.add(btn2);

		// 5.각 버튼 색을 누르면 백그라운드 색깔 변경하는 오버라이드 만들기.
		// 5-1. 익명 내부 클래스 형식만들기 (버튼1 생성 및 이벤트 주기)
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 5-2. 배경색 바꾸기
				cp.setBackground(Color.gray);

			}
		});

		// 5-3. 익명 내부 클래스 형식만들기 (버튼2 생성 및 이벤트 주기)
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 5-4. 배경색 바꾸기
				cp.setBackground(Color.green);

			}
		});

		// 5-5. 각 버튼 색 변경 하기
		btn1.setBackground(Color.gray);
		btn2.setBackground(Color.green);

	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingEvent_04("이벤트 진행");

	}

}
