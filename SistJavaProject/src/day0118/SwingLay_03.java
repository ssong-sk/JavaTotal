package day0118;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLay_03 extends JFrame{
	
	
	//변수선언
		Container cp; //컨테이너는 담은 그릇......
		JButton btn1; //버튼 만드는 방법
		
		//상속해서 받아온 메서드
		public SwingLay_03(String title) {
			super(title);
			
			//창 생성************************
			
			cp = this.getContentPane(); //프레임으로 불러온 또 하나의 패널 
			
			//컬러 생성********************
			
			this.setBounds(300, 100, 300, 300);
			cp.setBackground(new Color(255, 204, 000));
			
			//버튼 생성***********************
			btn1 = new JButton("버튼1");
			
			//프레임에 버튼 추가************
			//프레임은 기본이 BorderLayout / 새로 할 경우 new를 붙여서 사용
			//이경우는 위치 지정이 필수!!!!
			
			this.add("North",btn1); //위치를 동서남북 중에 어디에 사용할지 적용해주고 첫글짜가 반드시 대문자여야함!!!!
			
			this.add("South",new JButton("아래쪽")); //위치중에 어느곳에 위치할지 설정
			this.add("West",new JButton("오른쪽")); //위치중에 어느곳에 위치할지 설정
			this.add("East",new JButton("왼쪽")); //위치중에 어느곳에 위치할지 설정
			this.add("Center",new JButton("가운데")); //위치중에 어느곳에 위치할지 설정
			
			//버튼1에 속성추가******************
			btn1.setBackground(Color.black); //버튼1 배경색 변경
			btn1.setForeground(Color.WHITE); //버튼1 글자색 변경
			
			this.setVisible(true); //마지막에 써줘야지 오류가 안남!
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingLay_03("스윙시작"); //창 제목 출력하는 방법!

	}

}
