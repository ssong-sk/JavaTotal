package day0118;

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
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

/*
 * 색깔 5개 지정하기
 * 버튼은 배열
 * 안녕하세요 크게 나타나며 버튼 색상과 동일하게 글씨 나오게 하기!!!!!!
 * 
 */
public class QuizSwingTextF_11 extends JFrame implements ActionListener {

	// 변수선언
	Container cp; // 컨테이너는 담은 그릇......
	JButton[] btn = new JButton[5];
	String[] btnLabel = { "Red", "Orange", "Yellow", "Green", "Blue" };
	Color[] btnColor = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE };
	JLabel lblNum1;

	public QuizSwingTextF_11(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(700, 200, 600, 300);
		cp.setBackground(new Color(255, 255, 255));

		initDesign();

		this.setVisible(true);

	}

	public void initDesign() {
		// Panel 기본이 FlowLayout
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);

		this.add(panel, BorderLayout.NORTH); // 프레임 상단에 패널 배치

		// 결과확인
		lblNum1 = new JLabel("안녕하세요");
		lblNum1.setHorizontalAlignment(JLabel.CENTER);
		lblNum1.setFont(new FontUIResource("", Font.BOLD, 25)); // 폰트와 폰트스타일 및 크기쓰기 / 글꼴변경...
		this.add(lblNum1);

		// 반복문 (배열)
		for (int i = 0; i < btn.length; i++) { // 공식!!!!!!!!!!! 거꾸로 하지 않는한

			// 버튼 5개 생성
			btn[i] = new JButton(btnLabel[i]);

			// 버튼 5개에 각각의 버튼 색상 변경(btnColors)
			btn[i].setBackground(btnColor[i]);

			// 버튼 5개에 이벤트 추가
			btn[i].addActionListener(this);

			// panel에 버튼 5개 생성
			panel.add(btn[i]);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		// 각 각의 버튼을 누르면 프레임의 배경색이 변경
		for (int i = 0; i < btn.length; i++) {
			if (ob == btn[i]) {
		
				lblNum1.setForeground(btn[i].getBackground());
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new QuizSwingTextF_11("퀴즈");
	}

}
