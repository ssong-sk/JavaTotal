package j0122;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

//1. 상속 및 jframe 형성                           //5. 액션이벤트 추가하기
public class SwingRadioChect_02 extends JFrame implements ActionListener { // 0119_02
	// 1-1. 변수선언
	Container cp;
	JRadioButton[] rb = new JRadioButton[4]; // 한번에 1개만 선택 할 수 있는 것이 라디오 버튼
	JCheckBox[] cb = new JCheckBox[4];
	Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.PINK };
	JLabel lblMessage;

	// 2.메서드 형성(상속)
	public SwingRadioChect_02(String title) {
		super(title);
		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(800, 100, 500, 400);
		this.setBackground(new Color(255, 204, 000));

		// 4-1. 디자인 메서드 호출 미리 설정
		initDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void initDesign() {
		// 4-2. 상단패널 보더로 감싼 4개의 라디오 버튼 만들어서 생성하기
		String[] str1 = { "red", "초록초록", "하늘하늘", "퓡~~~하" };
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder("글자색"));
		this.add("North", pTop);

		// 4-3. 라디오 버튼 그룹짓기(라디오 버튼 하나만 생성하려면 그룹을 지워줘야함)
		ButtonGroup bg = new ButtonGroup();

		// 4-4. 라디오버튼 생성
		for (int i = 0; i < rb.length; i++) {
			rb[i] = new JRadioButton(str1[i], i == 3 ? true : false); // 버튼의 디폴트값 넣어줘야함!!!!3입력시 2번쨰 순서 자동체크

			// 4-5 탑패널 및 버튼 그룹 추가
			pTop.add(rb[i]); // 상부 패널 추가
			bg.add(rb[i]); // 버튼 그룹 추가 -> 생성해줘야 하나씩 선택가능
			rb[i].addActionListener(this);
		}

		// 5-1. 가운데 라벨 만들기 /
		lblMessage = new JLabel("왜 벌써 22일인가?????", JLabel.CENTER); // 첫 메인 출력메세지
		lblMessage.setBorder(new LineBorder(Color.red, 2));
		this.add("Center", lblMessage);

		// 5-2. 하단 패널에 보더로 감싼 4개의 체크박스 만들기
		JPanel pBotton = new JPanel();
		pBotton.setBorder(new TitledBorder("가능언어"));
		this.add("South", pBotton);

		// 5-3. 하단 패널에 언어 체크박스 만들기
		String[] str2 = { "영어", "한국어", "훈민정음", "프랑스어" };

		for (int i = 0; i < cb.length; i++) {
			cb[i] = new JCheckBox(str2[i]);
			cb[i].addActionListener(this);
			pBotton.add(cb[i]);
		}
	}

	// 4-6 라디오버튼 / 5-4 체크박스 액션 추가하기
	@Override
	public void actionPerformed(ActionEvent e) {
		// 4-7. 오브젝트 메서드를 사용해서 이벤트 리스너를 등록한 무언가를 실행할 경우
		// 이벤트를 발생시킨 객체의 위치값을 가져옴!!!!!
		Object ob = e.getSource();
		
		//4-8 라디오버튼 호출처리 및 메세지 출력이 컬러별로 출력되게 for문 작성
		for(int i = 0; i < rb.length; i++) {
			if(ob == rb[i]) {
				lblMessage.setForeground(colors[i]);
				lblMessage.setFont(new Font("",Font.BOLD,22));
				
			}
		}
		//5-5 체크박스 호출처리
		String msg = "";
		
		for(int i = 0; i < cb.length; i++) {
			if(cb[i].isSelected() == true) {
				msg += cb[i].getText() + " ";
			}
		}
		lblMessage.setText(msg);

	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름 설정까지)
		new SwingRadioChect_02("스윙 라디오 체크박스_2");

	}

}
