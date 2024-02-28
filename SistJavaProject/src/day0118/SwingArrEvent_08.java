package day0118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingArrEvent_08 extends JFrame implements ActionListener {

	// 변수선언 // 배열사용
	Container cp;
	JButton[] btn = new JButton[6];
	String[] btnLabel = { "Red", "Green", "Blue", "Magenta", "Gray", "Yellow" };
	Color[] btnColor = { Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.YELLOW };

	public SwingArrEvent_08(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(700, 200, 600, 300);
		cp.setBackground(new Color(255, 204, 204));

		initDesign();
		this.setVisible(true);

	}

	public void initDesign() {

		// Panel 기본이 FlowLayout
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);

		this.add(panel, BorderLayout.NORTH); // 프레임 상단에 패널 배치

		// 반복문 (배열)
		for (int i = 0; i < btn.length; i++) { // 공식!!!!!!!!!!! 거꾸로 하지 않는한

			// 버튼 6개 생성
			btn[i] = new JButton(btnLabel[i]);

			// 버튼 6개에 각각의 버튼 색상 변경(btnColors)
			btn[i].setBackground(btnColor[i]);

			// 버튼 6개에 이벤트 추가
			btn[i].addActionListener(this);

			// panel에 버튼 6개 생성
			panel.add(btn[i]);

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		// 각 각의 버튼을 누르면 프레임의 배경색이 변경
		for (int i = 0; i < btn.length; i++) {
			if (ob == btn[i]) {
				cp.setBackground(btnColor[i]); // 프레임 변수를 가져와서 변경해줌.,,

				// 창제목 바꾸기
				this.setTitle("Color : " + btnLabel[i]);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingArrEvent_08("이벤트 시작!!!");

	}
}