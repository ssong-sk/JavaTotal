package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class CheckRadio_03 extends JFrame implements ActionListener, ItemListener {
	Container cp; // 컨테이너는 담은 그릇......
	JCheckBox[] cbHobby = new JCheckBox[4];
	JCheckBox cbDriver;
	JCheckBox cbfont;
	JButton btnHobby;
	JLabel lblResult;

	public CheckRadio_03(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(1200, 100, 400, 300);
		cp.setBackground(new Color(255, 204, 000));
		initDesign();
		this.setVisible(true);

	}

	public void initDesign() {
		this.setLayout(null); // null값을 주면 원하는 곳에 지정 하기

		cbDriver = new JCheckBox("운전면허");
		cbDriver.setBounds(20, 20, 100, 30);
		cbDriver.setOpaque(false);
		cbDriver.addItemListener(this); // ItemListner 이벤트 핸들러와 연결되는 객체임을 표시
		this.add(cbDriver);
		
		
		// 글씨 체크,,,,
		cbfont = new JCheckBox("글꼴굵기");
		cbfont.setBounds(20, 50, 100, 30);
		cbfont.setOpaque(false);
		cbfont.addItemListener(this);
		this.add(cbfont);

		lblResult = new JLabel("Have a Nice Day!!!!", JLabel.CENTER);
		lblResult.setBounds(20, 200, 300, 50);
		lblResult.setBorder(new LineBorder(Color.GREEN, 5));
		this.add(lblResult);

		// 취미체크박스
		String[] hobbys = { "책읽기", "운동", "감상", "공부" };
		int xpos = 20;

		for (int i = 0; i < cbHobby.length; i++) {
			cbHobby[i] = new JCheckBox(hobbys[i]);
			cbHobby[i].setBounds(xpos, 80, 80, 30);
			cbHobby[i].setOpaque(false);
			this.add(cbHobby[i]);
			xpos += 80;
		}

		// 버튼
		btnHobby = new JButton("나의 취미");
		btnHobby.setBounds(60, 140, 200, 30);
		this.add(btnHobby);

		btnHobby.addActionListener(this); // 버튼에 이벤트 추가

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();

		if (ob == btnHobby) { // 버튼 메서드!

			String s = "나의 취미는 ";
			int select = 0;

			for (int i = 0; i < cbHobby.length; i++) {
				if (cbHobby[i].isSelected()) {
					select++;
					s += "[" + cbHobby[i].getText() + "]";
				}

			}
			if (select == 0) {
				s += "없습니다.";
			} else {
				s += "입니다.";
			}
			// 라벨에 출력
			lblResult.setText(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CheckRadio_03("CheckRadio");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object ob = e.getSource();

		if (ob == cbDriver) {
			String s = "체크상태 : " + cbDriver.isSelected() + "  , 텍스트 : " + cbDriver.getText();
			lblResult.setText(s);
		}
		else if(ob == cbfont) {
			if(cbfont.isSelected()) {
				lblResult.setFont(new Font("",Font.BOLD,26));
			}
			else {
				lblResult.setFont(new Font("",Font.PLAIN,10));
			}
				
		}

	}

}
