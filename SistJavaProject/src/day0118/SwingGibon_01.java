package day0118;

import java.awt.Color;

import javax.swing.JFrame;

//상속이 기본으로 사용됨.

public class SwingGibon_01  extends JFrame{
	
	public SwingGibon_01(String title) {
		super(title);
		
		//***창 사이즈 및 컬러 조정 및 프레임을 보이게뜸 true 선언하는 방법*****************************
		
		//시작위치, 너비, 높이
		//정사각형 GUI가 만들어짐
		this.setBounds(500, 100, 300, 300); //this는 부모가 가지고 있는 모든 호출을 가지고 옴,
		
		//배경색
		//this.getContentPane().setBackground(Color.yellow); //this에서 컨텐트팬 (윈도에 있는 하나의 필름)으로 얻어옴. -> 필름이 있어야 사용.
		                                     //static 상수를 연결한 색상 color.magenta
		//this.setBackgrowund를 써서 색상을 넣어도 하얀색으로만 보임!!!
		
		//rbg컬러를 불러와서 사용하는 방법 (3가지 컬러를 입력할 시 조합해서 색상 추출이 됨!!)
		this.getContentPane().setBackground(new Color(133, 111, 111));
		
		//프레임에 보이게
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingGibon_01("스윙기본"); //생성자랑 생성이 연결되어서 사용이 됨!

	}

}
