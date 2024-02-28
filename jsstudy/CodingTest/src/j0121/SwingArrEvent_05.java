package j0121;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//1. 상속 및 jframe 형성                           //5. 액션이벤트 추가하기
public class SwingArrEvent_05 extends JFrame implements ActionListener {
// 0118_08

	// 1-1. 변수선언 / 배열사용
	Container cp;
	JButton[] btn = new JButton[6];
	String[] btnLabel = { "Red", "Green", "Blue", "Magenta", "Gray", "Yellow" };
	Color[] btnColor = { Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.YELLOW };

	// 2.메서드 형성(상속)
	public SwingArrEvent_05(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(700, 200, 600, 300);
		this.setBackground(new Color(255, 204, 204));

		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {

		// 4-1.판넬 생성 및 판넬 백그라운드 색상 지정
		// JFrame : 화면을 구성하는 큰 틀 / JPanel : JFrame 안에서 나누어지는 구역
		JPanel panel = new JPanel();
		panel.setBackground(Color.pink);

		// 4-2. 판넬 위치 지정 (컨테이너의 공간을 위쪽,아래,왼쪽,오른쪽,중앙으로 배치)
		this.add(panel, BorderLayout.NORTH);

		// 4-3. 배열 반목문 -> 버튼 생성, 버튼 색상변경, 버튼이벤트 추가, 판넬에 버튼 생성하기!!!
		for (int i = 0; i < btn.length; i++) {
			// 버튼 6개 생성
			btn[i] = new JButton(btnLabel[i]);
			// 버튼 6개에 각각의 버튼 색상 변경
			btn[i].setBackground(btnColor[i]);
			// 버튼 6개에 이벤트 추가
			btn[i].addActionListener(this);

			// panel에 버튼 6개 생성
			panel.add(btn[i]);
		}

	}

	// 5-1. 액션퍼폼에 대한 오버라이드 생성하기
	@Override
	public void actionPerformed(ActionEvent e) {
		// 5-2. 오브젝트 메서드를 사용해서 이벤트 리스너를 등록한 무언가를 실행할 경우
		// 이벤트를 발생시킨 객체의 위치값을 가져옴!!!!!
		Object ob = e.getSource();
		
		//5-3. 버튼을 누르면 프레임 배경색 변경
		for(int i = 0; i < btn.length; i++) {
			if(ob == btn[i]) {
				cp.setBackground(btnColor[i]);
				
				//5-4. 버튼 누르면 창 제목 변경
				this.setTitle("Color : " + btnColor[i]);
			}
		}

	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingArrEvent_05("배열 이벤트를 시작합니다");

	}

}
