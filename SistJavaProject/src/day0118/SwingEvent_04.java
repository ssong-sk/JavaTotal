package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingEvent_04 extends JFrame implements ActionListener{ //ActionListener을 오버라이드 / 원하는 곳에 actionPerformed 생성도 가능

	// 변수선언
	Container cp; // 컨테이너는 담은 그릇......
	JButton btn1, btn2, btn3;

	public SwingEvent_04(String title) {
		super(title);

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(800, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 000));
		
		initDesign(); //디자인 호출해옴.
		
		this.setVisible(true);
	}
	
	public void initDesign() { 
		//레이아웃 변경
		
		this.setLayout(new FlowLayout()); //가로나 세로로 쭈욱 레이아웃 형성
		
		//버튼 3개 생성
		btn1 = new JButton("버튼 #1");
		btn2 = new JButton("버튼 #2");
		btn3 = new JButton("버튼 #3");
		
		//프레임 추가
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		//버튼 색상 변경
		btn1.setBackground(Color.blue);
		btn2.setBackground(Color.GREEN);
		btn3.setBackground(Color.WHITE);
		
		//버튼 글자색 변경
		btn1.setForeground(Color.WHITE);
		btn2.setForeground(Color.red);
		btn3.setForeground(Color.black);
		
		//버튼에 이벤트 발생. 이벤트 핸들러와 이벤트 발생한 객체를 버튼을 통해 연결
		btn1.addActionListener(this); //부모것을 상속받아서 쓴것이기 때문에 this사용
		btn2.addActionListener(this); 
		btn3.addActionListener(this); 
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object ob =  e.getSource(); //ob를 사용하여 객채를 명확하게 하기위해서 사용 => 버튼의 어떤 메서드 호출인지 정확히 지정해주어야함!!!!!
		
		//메세지를 다이얼로그 형태로 보여준다.
		//JOptionPane.showMessageDialog(this, "버튼클릭!!!!");
		
		//버튼마다 다른 메세지 출력하려면?
		if(ob == btn1) {
			JOptionPane.showMessageDialog(this, "1번째 버튼 클릭");
		}
		else if(ob == btn2) {
			JOptionPane.showMessageDialog(this, "2번째 버튼 클릭");
		}
		else if(ob == btn3) {
			JOptionPane.showMessageDialog(this, "3번째 버튼 클릭");
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingEvent_04("버튼 이벤트"); // 창 제목 출력하는 방법!

	}

	
}
