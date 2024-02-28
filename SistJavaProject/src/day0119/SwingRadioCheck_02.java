package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingRadioCheck_02 extends JFrame implements ActionListener {

	// 변수선언
	Container cp; // 컨테이너는 담은 그릇......
	JRadioButton[] rb = new JRadioButton[4]; // 하나만 선택하고 싶을 때 jradiobutton을 사용한다.
	JCheckBox[] cb = new JCheckBox[4];
	Color[] colors = { Color.RED, Color.BLACK, Color.GREEN, Color.BLUE };
	JLabel lblMessage;

	public SwingRadioCheck_02(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(400, 100, 500, 400);
		cp.setBackground(new Color(255, 204, 000));

		initDesign();

		this.setVisible(true);

	}

	public void initDesign() {
		// 상단패널 보더로 감싼 4개의 라디오 버튼 만들기
		String[] str1 = { "Red", "검정검정", "초록초록", "파랗다" };
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder("글자색"));
		this.add("North", pTop);

		// 라디오버튼 하나만 선택되도록 하려면 그룹을 지워줘야함
		ButtonGroup bg = new ButtonGroup();

		for (int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(str1[i], i == 3 ? true : false); // 삼항연산자사용 / 디폴트값 넣어주면 재생눌러주면 2번쨰 버튼에 체크되어
																		// 있음(기본체크)
			pTop.add(rb[i]); // 탑패널에 추가
			bg.add(rb[i]); // 버튼 그룹에 추가
			rb[i].addActionListener(this); // 액션추가

		}

		// 가운데 라벨
		lblMessage = new JLabel("안녕하세요 ~~ 즐거운 금요일", JLabel.CENTER);// 가로 가운데
		this.add("Center", lblMessage);// 세로가운데
		lblMessage.setBorder(new LineBorder(Color.RED, 2)); // 라인 굵기

		// 하단패널에 보더로 감싼 4개의 체크박스 만들기
		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder("가능언어"));
		this.add("South", pBottom);

		String[] str2 = { "영어", "일어", "한국어", "프랑스어" };

		for (int i = 0; i < cb.length; i++) {
			cb[i] = new JCheckBox(str2[i]);
			cb[i].addActionListener(this); // 액션추가,,,
			pBottom.add(cb[i]);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();

		// 라디오 버튼 호출처리, 메세지 출력이 컬러별로 출력되도록
		for (int i = 0; i < rb.length; i++) {
			if (ob == rb[i]) {

				lblMessage.setForeground(colors[i]);
				lblMessage.setFont(new Font("", Font.BOLD, 22));
			}
		}
		//체크박스 호출처리(다중선택 : 자바 JSP)
		String msg = "";
		
		for(int i = 0; i < cb.length; i++) {
			if(cb[i].isSelected() == true); {
				//ture값을 반환하는 값
				msg += cb[i].getText() + " ";
 			}
		}
		lblMessage.setText(msg);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingRadioCheck_02("스윙 라디오 체크박스_2");

	}

}
