package j0122;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

//1. 상속 및 jframe 형성 
public class SwingTable_04 extends JFrame {
	// 1-1. 변수선언
	Container cp;
	JLabel lblTitle;
	JLabel lblOut;
	JTable table;

	// 2.메서드 형성(상속)
	public SwingTable_04(String title) {
		super(title);

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(800, 100, 300, 300);
		this.setBackground(new Color(255, 204, 000));

		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {
		// 4-2. 다중 배열 선언
		String[][] data = { { "권지용", "서울", "010-1111-2222" }, { "이동욱", "강원도", "010-3333-4444" },
				{ "강동원", "미국", "010-5555-6666" } };
		String[] title = { "이름", "주소", "연락처" };

		// 4-3. 타이틀 및 결과 라벨 만들기
		lblTitle = new JLabel("JLbel 연습", JLabel.CENTER);
		this.add("North", lblTitle);
		lblOut = new JLabel("결과출력", JLabel.CENTER);
		this.add("South", lblOut);

		// 4-4. 테이블 만들기
		table = new JTable(data, title);
		JScrollPane pane = new JScrollPane(table); // 컴포넌트에 스크롤 기능을 제공한다. 화면보다 더 큰 컴포넌트를 표시하기 위해서는 스크롤 기능이 필요
		table.addMouseListener(new TableEvent());
		this.add(pane);

	}
	//5. 클래스 생성 후 상속
	class TableEvent extends MouseAdapter {
		   
		   @Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
			
			//5-1. 선택한 행 번호 얻기
			int rowNum = table.getSelectedRow();
			
			//5-2. 테이블 누르면 결과값 나오게 클릭 이벤트 설정
			String str = "이름 : " + table.getValueAt(rowNum, 0) + " 주소 : " + table.getValueAt(rowNum, 1) + " 핸드폰 : " + table.getValueAt(rowNum, 2);
			lblOut.setText(str);
		}
	   }


	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingTable_04("스윙 테이블");

	}

}
