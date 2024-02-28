package j0121;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//1. 상속 및 JFrame 창 생성   //5. 액션이벤트 추가하기
public class SwingEvent_01 extends JFrame implements ActionListener { // 0118_04 _ 각 버튼별 액션이벤트 넣기

	// 1-2. 변수선언
	Container cp;
	JButton btn1, btn2, btn3;

	// 2. 메서드 형성(상속)
	public SwingEvent_01(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(800, 100, 300, 300);
		cp.setBackground(new Color(255, 205, 000));

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
		btn1 = new JButton("하나");
		this.add(btn1);
		btn2 = new JButton("둘");
		this.add(btn2);
		btn3 = new JButton("셋");
		this.add(btn3);

		// 4-3. 버튼 색상 변경
		btn1.setBackground(Color.white);
		btn2.setBackground(Color.blue);
		btn3.setBackground(Color.yellow);

		// 4-4. 버튼안에 글씨 색상 변경
		btn1.setForeground(Color.green);
		btn2.setForeground(Color.white);
		btn3.setForeground(Color.blue);

		// 5-4. 각 버튼 이벤트(액션) 발생하기 - 이벤트 핸들러와 이벤트 발생한 객체를 버튼을 통해 연결
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

	}

	// 5-1. 액션퍼폼에 대한 오버라이드 생성하기
	@Override
	public void actionPerformed(ActionEvent e) {
		// 5-2. 오브젝트 메서드를 사용해서 이벤트 리스너를 등록한 무언가를 실행할 경우
		// 이벤트를 발생시킨 객체의 위치값을 가져옴!!!!!
		Object ob = e.getSource();

		// 5-3. 버튼을 누를 경우 나오는 메세지를 출력! (각 버튼마다 만들기)
		// JOptionPane.showMessageDialog 단순한 알림창을 띄울 수 있는 함수 / 에러메세지를 넣고 싶으면 null 입력!
		if (ob == btn1) {
			JOptionPane.showMessageDialog(this, "one");
		} else if (ob == btn2) {
			JOptionPane.showMessageDialog(this, "two");
		} else if (ob == btn3) {
			JOptionPane.showMessageDialog(this, "three");
		}

	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingEvent_01("스윙 이벤트");

	}

}
