package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBtnEvent_05 extends JFrame implements ActionListener {

	// 변수선언
	Container cp; // 컨테이너는 담은 그릇......
	JButton btn1;
	JButton btn2;

	public SwingBtnEvent_05(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(153, 204, 102));
		
		initDegign();
		
		this.setVisible(true);

	}

	public void initDegign() {
		
		this.setLayout(new FlowLayout());

		btn1 = new JButton("◀");
		btn2 = new JButton("▶");

		// 프레임 추가
		this.add(btn1);
		this.add(btn2);

		// 위치이동
		this.add("North", btn1);
		this.add("North", btn2);

		// 버튼색상
		btn1.setBackground(Color.blue);
		btn2.setBackground(Color.GREEN);

		// 글자색상
		btn1.setForeground(Color.WHITE);
		btn2.setForeground(Color.red);
		
		//이벤트 객체(핸들러와 연결) this.add와 연결 된다는 뜻!!!
		btn1.addActionListener(this);
		btn2.addActionListener(this);

		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob =  e.getSource(); //명확한 객체를 주기 위해 사용!!!
		
		if(ob == btn1) {
			JOptionPane.showMessageDialog(this, "왼쪽버튼 클릭!!!!!");
		}
		else if(ob == btn2) {
			JOptionPane.showMessageDialog(this, "오른쪽버튼 클릭!!!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingBtnEvent_05("버튼 이벤트5");

	}

	

}
