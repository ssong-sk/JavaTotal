package day0130;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpdateStuInfo extends JFrame {

	Container cp;
	JTextField tfName, tfJava, tfJsp, tfSpring;
	JComboBox<String> cbBan; // 문자열형 변수에 들어가게 해주는 박스
	JButton btnMod;
	String num; //수정할 번호

	public UpdateStuInfo(String title) {
		super(title);

		cp = this.getContentPane();
		this.setBounds(200, 100, 200, 250);
		cp.setBackground(new Color(255, 204, 204));

		initDesign();
		//this.setVisible(true);

	}

	public void initDesign() {
		this.setLayout(null);

		JLabel lblTitle1 = new JLabel("이름");
		JLabel lblTitle2 = new JLabel("반");
		JLabel lblTitle3 = new JLabel("JAVA");
		JLabel lblTitle4 = new JLabel("JSP");
		JLabel lblTitle5 = new JLabel("SPRING");

		tfName = new JTextField(); // 크기조절로 빈칸으로 나둬도 됨.
		tfJava = new JTextField();
		tfJsp = new JTextField();
		tfSpring = new JTextField();

		String[] ban = { "aws반", "front반", "backend반", "design반" };
		cbBan = new JComboBox<String>(ban);

		lblTitle1.setBounds(30, 10, 60, 30);
		this.add(lblTitle1);
		lblTitle2.setBounds(30, 40, 60, 30);
		this.add(lblTitle2);
		lblTitle3.setBounds(30, 70, 60, 30);
		this.add(lblTitle3);
		lblTitle4.setBounds(30, 100, 60, 30);
		this.add(lblTitle4);
		lblTitle5.setBounds(30, 130, 60, 30);
		this.add(lblTitle5);

		// 이름, 반, 자바, jsp, spring 순서대로
		tfName.setBounds(80, 15, 70, 22);
		this.add(tfName);
		cbBan.setBounds(80, 45, 70, 22);
		this.add(cbBan);
		tfJava.setBounds(80, 75, 70, 22);
		this.add(tfJava);
		tfJsp.setBounds(80, 105, 70, 22);
		this.add(tfJsp);
		tfSpring.setBounds(80, 135, 70, 22);
		this.add(tfSpring);

		// 버튼
		btnMod = new JButton("데이터수정");
		btnMod.setBounds(45, 170, 100, 30);
		this.add(btnMod);

	}

//	public static void main(String[] args) {
//
//		new UpdateStuInfo("학생 정보 수정창");
//	}

}
