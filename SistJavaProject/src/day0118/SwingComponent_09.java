package day0118;

import java.awt.Color;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingComponent_09 extends JFrame {

	// 변수선언
	Container cp; // 컨테이너는 담은 그릇......
	JTextField text1, text2;
	JLabel lbl1, lbl2, lbl3, lbl4;

	Icon icon1 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\ame9.gif");
	Icon icon2 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\45-pandadog.gif");

	public SwingComponent_09(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 000));

		initDesign();

		this.setVisible(true);

	}

	public void initDesign() {
		this.setLayout(null); // null을 사용함으로써 값이 없으므로 내용을 적어줘야함.

		text1 = new JTextField();
		text1.setBounds(10, 20, 80, 30);
		this.add(text1);

		text2 = new JTextField("Have a Nice Day");
		text2.setBounds(10, 60, 150, 30);
		this.add(text2);

		lbl1 = new JLabel("안녕하세요", JLabel.CENTER);
		lbl1.setBounds(10, 100, 200, 30);
		lbl1.setBackground(Color.ORANGE);
		lbl1.setOpaque(true); // 불투명도가 있기 때문에 옵파크를 true라고 놔둬야함.. / 없으면 불투명도가 없으므로 배경에 메세지만 출력
		this.add(lbl1);

		lbl2 = new JLabel("해피데이", icon1, JLabel.RIGHT);
		lbl2.setBounds(10, 150, 200, 30);
		lbl2.setBorder(new LineBorder(Color.RED));
		this.add(lbl2);

		lbl3 = new JLabel("스윙공부", icon2, JLabel.CENTER);
		lbl3.setBounds(10, 180, 200, 30);
		lbl3.setBorder(new TitledBorder("쌍용교육"));
		this.add(lbl3);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		
		lbl4 = new JLabel(sdf.format(new Date()),icon1,JLabel.CENTER);
		lbl4.setBounds(10, 210, 200, 30);
		lbl4.setBorder(new LineBorder(Color.PINK, 3));
		this.add(lbl4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingComponent_09("스윙 컴포넌트_9"); //

	}

}
