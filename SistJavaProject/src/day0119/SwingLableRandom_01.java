package day0119;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingLableRandom_01 extends JFrame implements ActionListener{
	
	//변수선언
	Container cp; //컨테이너는 담은 그릇......
	JLabel [] lblLabel = new JLabel[9];
	String [] str = {"샌드위치", "햄버거", "피자", "치킨", "라면", "한정식", "오렌지주스", "제육볶음", "아이스크림"};
	JButton btn;
	
	public SwingLableRandom_01(String title) {
		super(title);
		
		cp = this.getContentPane(); //프레임으로 불러온 또 하나의 패널 
		
		this.setBounds(1000, 100, 500, 530);
		cp.setBackground(new Color(255, 204, 204));
		
		initDesign();
		
		this.setVisible(true);
		
	}
	
	public void initDesign() {
		//패널을 프레임의 센터에 추가
		Panel pCenter = new Panel(new GridLayout(3, 3));
		this.add(pCenter,BorderLayout.CENTER); //this는 JFrame을 의미!!!!!!!!!!!!!!!/borderlayout은 하단 생성,,
		
		//라벨을 패널에 추가
		for(int i = 0; i <lblLabel.length; i++) {
			lblLabel[i] = new JLabel(str[i],JLabel.CENTER); //JLable.center을 입력해주면 센터로 글짜가 감!!!!!!!!
			
			//RGB칼라는 0~255사이의 색 R,G,B (랜덤컬러 구하는 공식) -> 패널을 추가하고 컬러 랜덤값 미리 넣어줘도 상관 없음!!!
			int r= (int)(Math.random()*256); //0~255
			int g= (int)(Math.random()*256);
			int b= (int)(Math.random()*256);
			lblLabel[i].setBackground(new Color(r,g,b)); 
		
			//패널에 라벨추가
			pCenter.add(lblLabel[i]);
			
			//글꼴변경
			lblLabel[i].setFont(new Font("궁서체", Font.BOLD, 15));
			lblLabel[i].setOpaque(true);
		}
		
		//프레임의 하단에 버튼 생성 후 추가
		btn = new JButton("라벨색상변경");
		
		//버튼에 이번트 추가...하단에 위치
		btn.addActionListener(this);
		this.add(btn,BorderLayout.SOUTH);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i < lblLabel.length; i++ ) {
			
			//RGB칼라는 0~255사이의 색 R,G,B (랜덤컬러 구하는 공식)
			int r= (int)(Math.random()*256); //0~255
			int g= (int)(Math.random()*256);
			int b= (int)(Math.random()*256);
			lblLabel[i].setBackground(new Color(r,g,b)); 
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingLableRandom_01("랜덤컬러생성_1");

	}

}
