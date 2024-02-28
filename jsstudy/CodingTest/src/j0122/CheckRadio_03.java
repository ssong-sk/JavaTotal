package j0122;

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

//1. 상속 및 jframe 형성                    //5. 액션이벤트 추가하기      //5. 액션이벤트 추가하기
public class CheckRadio_03 extends JFrame implements ActionListener, ItemListener { // 0119 _03
	// 1-1. 변수선언

	Container cp;
	JCheckBox[] cbHobby = new JCheckBox[4];
	JCheckBox cbDrive;
	JCheckBox cbFont;
	JButton btnHobby;
	JLabel lblResult;

	// 2.메서드 형성(상속)
	public CheckRadio_03(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(800, 100, 400, 300);
		this.setBackground(new Color(255, 204, 000));

		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {
		// 4-2. 레이아웃 형성(null 지정으로 각 각의 레이아웃을 새롭게 만들어야함.)
		this.setLayout(null);

		// 4-3.운전 체크박스 만들기
		cbDrive = new JCheckBox("운전면허");
		cbDrive.setBounds(20, 20, 100, 30);
		cbDrive.setOpaque(false);
		cbDrive.addItemListener(this);
		this.add(cbDrive);

		// 4-4. 글씨 체크박스 만들기
		cbFont = new JCheckBox("글꼴굵기");
		cbFont.setBounds(20, 50, 100, 30);
		cbFont.setOpaque(false);
		cbFont.addItemListener(this);
		this.add(cbFont);

		// 4-5. 라벨 기본 생성하기
		lblResult = new JLabel("오늘은 월요일이랍니다!!!!!!!!!", JLabel.CENTER);
		lblResult.setBounds(20, 200, 300, 50);
		lblResult.setBorder(new LineBorder(Color.green, 5));
		this.add(lblResult);

		// 4-6 취미 체크박스 만들기
		String[] hobby = { "책읽어", "운동?", "드라마봐", "공부ㅠ" };
		int xpos = 20;

		for (int i = 0; i < cbHobby.length; i++) {
			cbHobby[i] = new JCheckBox(hobby[i]);
			cbHobby[i].setBounds(xpos, 80, 80, 30);
			cbHobby[i].setOpaque(false);
			this.add(cbHobby[i]);
			xpos += 80;
		}
		// 4-7. 취미 버튼 만들기
		btnHobby = new JButton("나의 취미");
		btnHobby.setBounds(20, 140, 300, 40);
		btnHobby.addActionListener(this);
		this.add(btnHobby);

	}

	// 5-1. 액션퍼폼에 대한 오버라이드 생성하기
	@Override
	public void actionPerformed(ActionEvent e) {
		// 5-2. 오브젝트 메서드를 사용해서 이벤트 리스너를 등록한 무언가를 실행할 경우
		// 이벤트를 발생시킨 객체의 위치값을 가져옴!!!!!
		Object ob = e.getSource();

		// 5-3. 취미버튼 메서드 만들기
		if (ob == btnHobby) {
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
			// 5-4. 라벨에 출력
			lblResult.setText(s);
		}

	}

	// 6-1. 아이템이벤트에 대한 오버라이드 생성하기
	@Override
	public void itemStateChanged(ItemEvent e) {
		// 6-2. 오브젝트 메서드를 사용해서 이벤트 리스너를 등록한 무언가를 실행할 경우
		// 이벤트를 발생시킨 객체의 위치값을 가져옴!!!!!
		Object ob = e.getSource();

		// 6-3. 드라이브 체크박스에 이벤트 주기
		if (ob == cbDrive) {
			String s = "체크상태 : " + cbDrive.isSelected() + " , 텍스트 : " + cbDrive.getText();
			lblResult.setText(s);
		}
		// 6-3. 폰트 체크박스에 이벤트 주기
		else if (ob == cbFont) {
			if (cbFont.isSelected()) {// 활성화 되었을경우 ture, 비활성화는 false
				lblResult.setFont(new Font("", Font.BOLD,25));
			}
			else {
				lblResult.setFont(new Font("", Font.CENTER_BASELINE,12));
			}
		}
	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new CheckRadio_03("CheckRadio");

	}

}
