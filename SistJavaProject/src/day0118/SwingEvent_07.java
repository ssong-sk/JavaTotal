package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEvent_07 extends JFrame {

	Container cp;
	JButton btn1, btn2;

	public SwingEvent_07(String title) {
		super(title);

		cp = this.getContentPane();

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(Color.white);

		initDesign();

		this.setVisible(true);

	}

	public void initDesign() {
		// Flow 레이아웃으로 버튼 2개생성
		this.setLayout(new FlowLayout());

		btn1 = new JButton("버튼색 Gray로 변경");
		btn2 = new JButton("버튼색 Green로 변경");

		// 프레임 추가
		this.add(btn1);
		this.add(btn2);
		
		//버튼 1 생성 및 이벤트 주기)익명 내부 클래스 형식)
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.gray);
				
			}
		});
		
		//버튼2 생성 및 이벤트 주기
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cp.setBackground(Color.GREEN);
			}
		});
		
		// 1개는 버튼 색상 gray로 변경, 1개는 버튼색상 green으로 변경

		btn1.setBackground(Color.gray);
		btn2.setBackground(Color.green);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingEvent_07("이벤트 시작");
	}

}
