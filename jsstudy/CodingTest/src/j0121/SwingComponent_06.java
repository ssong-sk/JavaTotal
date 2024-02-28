package j0121;

import java.awt.Color;
import java.awt.Container;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

//1. 상속 및 jframe 형성
public class SwingComponent_06 extends JFrame { // 0118_09

	// 1-1. 변수선언
	Container cp;
	JTextField text1, text2; // JTextField - 한줄의 문자열을 입력받는 창
	JLabel lbl1, lbl2, lbl3, lbl4; // JPanel : JFrame 안에서 나누어지는 구역

	// 1-2. 아이콘 생성
	ImageIcon icon1 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\ame9.gif");
	ImageIcon icon2 = new ImageIcon("C:\\Users\\승경\\OneDrive\\바탕 화면\\새 폴더\\45-pandadog.gif");

	// 2.메서드 형성(상속)
	public SwingComponent_06(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(300, 100, 300, 400);
		this.setBackground(new Color(255, 205, 000));
		
		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {
		//4-1. 레이아웃 형성(null 지정으로 각 각의 레이아웃을 새롭게 만들어야함.)
		this.setLayout(null);
		
		//4-2. 문자열 입력할 창 생성 및 크기지정
		text1 = new JTextField();
		text1.setBounds(10, 20, 80, 30);
		this.add(text1);
		
		text2 = new JTextField();
		text2.setBounds(10, 60, 150, 30);
		this.add(text2);
		
		//4-3. 각 구역별 라벨 입력하기
		//lbl1
		lbl1 = new JLabel("안녕하세요", JLabel.LEFT);
		lbl1.setBounds(10, 100, 200, 30);
		lbl1.setBackground(Color.orange);
		lbl1.setOpaque(true); //백그라운드 불투명있는 오렌지로 표기가 됨!!!
		this.add(lbl1);
		
		//lbl2
		lbl2 = new JLabel("일요일은 싫어", icon1, JLabel.RIGHT);
		lbl2.setBounds(10, 150, 200, 30);
		lbl2.setBorder(new LineBorder(Color.red,2)); //보더에 라인보더를 만들어 테루리를 라인으로 컬러 및 두께를 줌.
		this.add(lbl2);
		
		//lbl3
		lbl3 = new JLabel("스윙..", icon2, JLabel.CENTER);
		lbl3.setBounds(10, 180, 200, 60);
		lbl3.setBorder(new TitledBorder("쌍용교육")); //보더에 타이틀라인 보더를 만들어 라인에 제목이 들어가게 함.
		this.add(lbl3);
		
		//lbl4 _ 날짜 지정하기 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		lbl4 = new JLabel(sdf.format(new Date()), icon1, JLabel.CENTER);
		lbl4.setBounds(10, 250, 230, 30);
		lbl4.setBorder(new LineBorder(Color.pink,2));
		this.add(lbl4);
		
		
		
	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingComponent_06("스윙 컴포넌트");

	}

}
