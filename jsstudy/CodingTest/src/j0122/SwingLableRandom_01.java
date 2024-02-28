package j0122;

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

//1. 상속 및 jframe 형성                          //5. 액션이벤트 추가하기
public class SwingLableRandom_01 extends JFrame implements ActionListener{ // 0119 _ 01

	// 1-1. 변수선언
	Container cp;
	JLabel[] lblLabel = new JLabel[9];
	String[] str = { "밥", "된장찌개", "오징어채", "배추김치", "메추리알", "제육볶음", "야채쌈", "계란찜", "물" };
	JButton btn;

	// 2.메서드 형성(상속)
	public SwingLableRandom_01(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(800, 100, 500, 500);
		cp.setBackground(new Color(255, 204, 204));

		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {
		
		//4-2. 패널의 그리드 프레임 추가하고 위치지정
		Panel pCenter = new Panel(new GridLayout(3, 3));
		this.add(pCenter,BorderLayout.CENTER);
		
		//4-3. 라벨을 패널에 추가하기(배열)
		for(int i = 0; i < lblLabel.length; i++) {
			lblLabel[i] = new JLabel(str[i], JLabel.CENTER);
			pCenter.add(lblLabel[i]);
			
			//4-4. 라벨 글꼴변경하기
			lblLabel[i].setFont(new Font("나눔고딕", Font.BOLD, 15));
			lblLabel[i].setOpaque(true);
		}
		
		//5-2. 프레임의 하단에 버튼 생성 
		btn = new JButton("랜덤색상변경");
		
		//5-5. RGB액션 버튼에 이벤트 추가 (하단버튼에)
		btn.addActionListener(this);
		this.add(btn, BorderLayout.SOUTH);

	}
	// 5-1. 액션퍼폼에 대한 오버라이드 생성하기
	@Override
	public void actionPerformed(ActionEvent e) {
		//5-3. 버튼을 누르면 프레임 배경색 변경
		for(int i = 0; i < lblLabel.length; i++) {
			
			//5-4. RGB칼라 구하는 공식(0~255 사이의 색)
			int r = (int)(Math.random()*256);
			int g = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			lblLabel[i].setBackground(new Color(r,g,b));
		}
		
	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingLableRandom_01("랜덤 스윙");

	}

	

}
