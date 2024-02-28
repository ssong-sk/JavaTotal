package j0118;

import java.awt.Color;

import javax.swing.JFrame;

/*
 * GUI(Graphical User Interface)란?
 * 사용자가 편리하게 입출력 할 수 있도록 그래픽 화면을 구성하여 마우스나 키보드로 입력을 받을 수 있도록 지원하는 사용자 인터페이스
 * =컴포넌트들로 구성
 * =강력한 GUI 컴포넌트 제공, 쉬운 GUI 프로그래밍
 * 
 *  **Swing이란?
 *  컴포넌트가 자바로 작성되어 있기 때문에 어떤 플랫폼에서도 일관된 화면 작성 가능
 *  <특징>
 *  1. 스윙 GUI 컴포넌트 _ 형식화된 텍스트 입력이나 패스워드 필드 동작과 같은 복잡한 기능들이 제공
 *  2. 자바 2D API _ 그림이나 이미지, 애니메이션 기능 제공, 교체 가능한 룩앤필(Look and Feel/컴포넌트 모양바꾸는것) 지원
 *  3. 데이터전송 _ 자르기, 복사, 붙이기, 드래그 앤 드롭 등 데이터 전송 기능 제공
 * 
 * 컨테이너란? _ 다른 컴포넌트를 포함할 수 있는 GUI컴포넌트 (add()를 사용하면 컨네이너 안에 컴포넌트 추가)
 * 컴포넌트란? _ 컨테이너에 포함되어야 화면에 출력될 수 있는 GUI객체
 * 
 * *****용어
 * setLocation, setBounds, setSize _ 프레임의 위치와 크기를 설정
 * setIconImage _ 윈도우 시스템에 타이틀 바, 데스크 스위처에 표시할 아이콘을 알려줌
 * setTitle_ 타이틀 바의 제목변경
 * setResizable _ 사용자가 크기를 조절할 수 있는지 설정
 * setVisible(boolean b) - 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김

 * 
 * ******컴포넌트 용어
 * 레이블(lable) _ 편집이 불가능한 텍스트를 표시 (JLbel label = new JLbel();)
 * 버튼(Button) _편집이 불가능한 텍스트를 표시 (JButton btn = new JButton();)
 * 텍스트필드(TextField) _ 입력이 가능한 한줄의 텍스트 필드 (JTextField text = new JTexField();)
 * 
 * 디폴트 배치관리자 
 * 1. FlowLayout _ 배치관리자를 지정하지 않으면 묵시적으로 지정 / 컴포넌트를 수평 방향으로 배치
 * -왼쪽에서 오른쪽, 위에서 아래로 순차적으로 배열
 * -if 한줄에 모두 배치 못하면 다음 줄에 연속하여 배열
 * 
 * 2. BorderLayout 컴포넌트를 추가할 때 방향을 지정하여 추가할 수 있는 기능을 제공 
 * -배치 방향은 동(East), 서(West) , 남(South), 북(North), 중앙(Center)
 * -add() 메소드
 * 
 * 3.GridLayout _ 컴포넌트를 행과 열을 가진 배열 형태로 배치
 * -컨테이너 공간을 동일한 사각형 격자(그리드)로 분할하고 각 셀에 컴포넌트 하나씩 배치
 * -rows(행) / cols(열) / hgap(컴포넌트 사이 간격) / vgap(픽셀단위)
 * 
 * 
 * 컴포넌트 크기와 위치 설정 메소드
 * 1. void setSize 컨포넌트 크기설정
 * 2. void setLocation 컨포넌트 위치 설정
 * 3. void setBounds 위치와 크기 동시 설정
 * 
 * 
 */


public class SwingGibon_05 extends JFrame{ //스윙은 인터페이스(동작) 구현하기 위한 클래스로 JFame 구현되는 하나의 창 / 상속
	
	
    public SwingGibon_05(String title) { //0118_01
		super(title);
		
		//***창 사이즈 및 컬러 조정 및 프레임을 보이게끔 true 선언하는 방법
		
		//정사각형 GUI 만들기
		this.setBounds(500, 100, 300, 300); //가로위치, 세로위치, 가로길이, 세로길이
		
		//배경색
		//this.getContentPane().setBackground(Color.GREEN);
		
		//RBG로 배경색 추출가능
		this.getContentPane().setBackground(new Color(255, 255, 255)); 
		//getContentPane() _ JFrame 이 가지고 있는 컨텐트팬을 리턴
		//setBackground _ 해당 프레임의 배경색을 변경
		
		//프레임 보이게 창표시
		this.setVisible(true);
	}

	public static void main(String[] args) {//0118_01 


		new SwingGibon_05("Swing");

	}

}
