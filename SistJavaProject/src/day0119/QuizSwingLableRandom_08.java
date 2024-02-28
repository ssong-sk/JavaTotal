package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class QuizSwingLableRandom_08 extends JFrame implements ActionListener, ItemListener {

	Container cp; // 컨테이너
	JCheckBox cbjen; // 성별 체크박스
	JCheckBox[] cbCountry; // 나라 체크박스
	JButton btnCountry;// 나라 버튼 4개
	JButton btnColor;// 나라 버튼 4개
	JRadioButton[] jbtn; // 컬러 라디오 박스
	JLabel lblResult;
	Color[] colors = { Color.RED, Color.BLACK, Color.GREEN  };

	public QuizSwingLableRandom_08(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(300, 100, 400, 400);
		cp.setBackground(new Color(255, 204, 000));

		initdesign();
		this.setVisible(true);

	}

	public void initdesign() {

		this.setLayout(null);

		// 1.성별 버튼생성 누르면 남자 / 안누르면 여자
		cbjen = new JCheckBox("성별");
		cbjen.setBounds(20, 10, 100, 30);
		cbjen.setOpaque(false);
		// 1-2. 이벤트 핸들러 넣기
		cbjen.addItemListener(this);
		this.add(cbjen);

		// 2.버튼 컬러 3개
		String[] str1 = { "Red", "검정검정", "초록초록" };
		JPanel panel = new JPanel();
		jbtn = new JRadioButton[3];
		ButtonGroup bg = new ButtonGroup(); //중복체크 방지
		for (int i = 0; i < jbtn.length; i++) {
			jbtn[i] = new JRadioButton(str1[i], i == 0 ? true : false); // 삼항연산자사용 / 디폴트값 넣어주면 재생눌러주면 2번쨰 버튼에 체크되어
			jbtn[i].setOpaque(false);
			jbtn[i].addActionListener(this);
			bg.add(jbtn[i]); // 버튼 그룹에 추가
			panel.add(jbtn[i]);
		}
		
		panel.setBounds(0, 40, 250, 30);
		panel.setOpaque(false);
		this.add(panel); 

		// 3.나라 4개 국가 생성
		cbCountry = new JCheckBox[4];
		String[] country = { "이탈리아", "미국", "영국", "스페인" };
		int xpos = 20; // 정수형 변수를 선언하고 초기값을 20으로 할당

		for (int i = 0; i < cbCountry.length; i++) {
			cbCountry[i] = new JCheckBox(country[i]);
			cbCountry[i].setBounds(xpos, 80, 80, 30);
			cbCountry[i].setSelected(false);
			cbCountry[i].setOpaque(false);
			this.add(cbCountry[i]);
			xpos += 80;
		}

		// 3-1.버튼 생성하기
		btnCountry = new JButton("내가 가본 나라");
		btnCountry.setBounds(20, 140, 200, 30);
		this.add(btnCountry);

		// 3-4. 버튼에 이벤트 추가
		btnCountry.addActionListener(this);

		// 3-5. 결과를 표시할 레이블 생성 및 위치 설정
		lblResult = new JLabel();
		lblResult.setBounds(20, 260, 300, 30);
		this.add(lblResult);
		
		
		// 2-1.버튼 생성하기
		btnColor = new JButton("색상");
		btnColor.setBounds(20, 180, 200, 30);
		this.add(btnColor);

		// 2-2. 버튼에 이벤트 추가
		btnColor.addActionListener(this);

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 3-2.나라 버튼 이벤트 생성

		Object ob = e.getSource();

		if (ob == btnCountry) {
			String s = "내가 가본 나라는";
			int select = 0;

			for (int i = 0; i < cbCountry.length; i++) {
				if (cbCountry[i].isSelected()) {
					select++;
					s += "[" + cbCountry[i].getText() + "]";
				}
			}
			if (select == 0) {
				s += "없습니다.";
			} else {
				s += "입니다.";
			}
			// 3-3. 이벤트 버튼 출력
			lblResult.setText(s);
		}
		
		//2. 색깔
		if (ob == btnColor) {
			// 라디오 버튼 호출처리, 메세지 출력이 컬러별로 출력되도록
			for (int i = 0; i < jbtn.length; i++) {
				if(jbtn[i].getSelectedObjects() != null) {
					lblResult.setForeground(colors[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new QuizSwingLableRandom_08("Study Quiz");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 1-1. 성별 체크 남자, 안체크 여자 부분 이벤트 버튼 만들기

		Object ob = e.getSource();

		if (ob == cbjen) {
			String s = "체크상태 : " + cbjen.isSelected() + " , 텍스트 : " ;
			if(cbjen.isSelected()) {
				s = s + "남자";
			}else {
				s = s + "여자";
			}
			lblResult.setText(s);
		}

	}

}
