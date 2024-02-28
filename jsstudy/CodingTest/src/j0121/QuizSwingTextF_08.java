package j0121;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

//1. 상속 및 jframe 형성                          //5. 액션이벤트 추가하기
public class QuizSwingTextF_08 extends JFrame implements ActionListener { // 0118 _ 11 / 색깔5개 지정, 안녕하세요 크게 나타나며 버튼 색상과
																			// 동일하게 글씨 나오게 하기

	// 1-1. 변수선언
	Container cp;
	JButton[] btn = new JButton[5];
	String[] btnLabel = { "Red", "Orange", "Green", "Blue", "Pink" };
	Color[] btnColor = { Color.RED, Color.ORANGE, Color.GREEN, Color.BLUE, Color.PINK };
	JLabel lblNum1;

	// 2.메서드 형성(상속)
	public QuizSwingTextF_08(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(700, 200, 600, 300);
		this.setBackground(new Color(255, 255, 255));

		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {

		// 4-1.판넬 생성 및 판넬 백그라운드 색상 지정
		// JPanel : JFrame 안에서 나누어지는 구역
		JPanel panel = new JPanel();
		panel.setBackground(Color.black);

		// 4-2. 판넬 위치 지정 (컨테이너의 공간을 위쪽,아래,왼쪽,오른쪽,중앙으로 배치)
		this.add(panel, BorderLayout.NORTH); // 왜 오류일까??????????????

		// 4-3. 안녕하세요 위치 및 폰트지정
		lblNum1 = new JLabel("안녕하세요");
		lblNum1.setHorizontalAlignment(JLabel.CENTER);// 텍스트 수평 위치 - Left , center, right
		lblNum1.setFont(new FontUIResource("", Font.BOLD, 25));
		this.add(lblNum1);

		// 4-4. 배열 반목문 -> 버튼 생성, 버튼 색상변경, 버튼이벤트 추가, 판넬에 버튼 생성하기!!!
		for (int i = 0; i < btn.length; i++) {
			// 버튼 5개 생성
			btn[i] = new JButton(btnLabel[i]);
			// 버튼 5개에 각각의 버튼 색상 변경
			btn[i].setBackground(btnColor[i]);
			// 버튼 5개 이벤트 추가

			// panel버튼 5개 생성
			panel.add(btn[i]);
		}

	}

	// 5-1. 액션퍼폼에 대한 오버라이드 생성하기
	@Override
	public void actionPerformed(ActionEvent e) {
		// 5-2. 오브젝트 메서드를 사용해서 이벤트 리스너를 등록한 무언가를 실행할 경우
		// 이벤트를 발생시킨 객체의 위치값을 가져옴!!!!!
		Object ob = e.getSource();
		
		// 5-3. 버튼을 누를 경우 프레임의 배경색이 변경(각 버튼별)
		for(int i = 0; i < btn.length; i++) {
			if(ob == btn[i]) {
				lblNum1.setForeground(btn[i].getBackground()); 
				//blNum1 라벨의 전경색(Foreground Color)을 버튼(btn[i])의 배경색(Background Color)으로 설정하는 코드
			}
		}

	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new QuizSwingTextF_08("퀴즈입니닷!!!");

	}

}
