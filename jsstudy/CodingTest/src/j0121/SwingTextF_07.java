package j0121;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

//1. 상속 및 jframe 형성                     
public class SwingTextF_07 extends JFrame { // 0118_10 / 사칙연산 + - * / 계산되는 스윙 만들기

	// 1-1. 변수선언
	Container cp;
	JTextField tfNum1, tfNum2;
	JButton btnAdd, btnMiu, btnGob, btnNa;
	JLabel lblNum1, lblNum2, lblResult;

	// 2.메서드 형성(상속)
	public SwingTextF_07() {
		super("텍스트 필드 문제");

		// 2-1. 패널 생성(JFrame의 객체 메소드)
		cp = this.getContentPane();

		// 2-2. GUI창 만들기 및 배경색 설정
		this.setBounds(300, 100, 400, 300);
		this.setBackground(new Color(255, 204, 000));
		// 4-1. 디자인 메서드 호출 미리 설정
		setDesign();

		// 3. 매개 변수 b의 값에 따라 이 창을 표시하거나 숨김 - 창을 나타낼 것이므로 true로 설정!!
		this.setVisible(true);
	}

	// 4. 디자인 메서드 생성
	public void setDesign() {
		// 4-1. 레이아웃 형성(null 지정으로 각 각의 레이아웃을 새롭게 만들어야함.)
		this.setLayout(null);

		// 4-2. 라벨이름 및 크기 지정해서 생성
		// lblNum1
		lblNum1 = new JLabel("숫자1");
		lblNum1.setBounds(20, 20, 50, 30);
		this.add(lblNum1);

		// lblNum2
		lblNum2 = new JLabel("숫자2");
		lblNum2.setBounds(20, 60, 50, 30);
		this.add(lblNum2);

		// 4-3 텍스처 입력칸 만들기
		// tfNum1
		tfNum1 = new JTextField();
		tfNum1.setBounds(80, 20, 60, 30);
		this.add(tfNum1);

		// tfNum2
		tfNum2 = new JTextField();
		tfNum2.setBounds(80, 60, 60, 30);
		this.add(tfNum2);

		// 4-4 사칙연산 버튼 만들기
		// btnAdd
		btnAdd = new JButton("+");
		btnAdd.setBounds(40, 110, 50, 40);
		this.add(btnAdd);

		// btnMiu
		btnMiu = new JButton("-");
		btnMiu.setBounds(100, 110, 50, 40);
		this.add(btnMiu);

		// btnGob
		btnGob = new JButton("*");
		btnGob.setBounds(160, 110, 50, 40);
		this.add(btnGob);

		// btnNa
		btnNa = new JButton("/");
		btnNa.setBounds(220, 110, 50, 40);
		this.add(btnNa);

		// 4-5. 결과확인
		lblResult = new JLabel("결과는?");
		lblResult.setBounds(20, 170, 250, 60);
		lblResult.setBorder(new TitledBorder("결과확인"));
		lblResult.setFont(new FontUIResource("", Font.BOLD, 13));
		this.add(lblResult);

		// 5. 익명클래스 - 오버라이드를 통해 사칙연산 각 각 계산식 만들기
		// 5-1. + 공식 만들기
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim()); //// getText : 텍스트뷰의 값 호출

				int sum = num1 + num2;

				String s = (num1 + " + " + num2 + " = " + sum);
				lblResult.setText("결과 : " + s);
				// setText : 텍스트뷰의 텍스트 설정

			}
		});

		// 5-2. - 공식만들기
		btnMiu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim()); //// getText : 텍스트뷰의 값 호출

				int sum = num1 - num2;

				String s = (num1 + " - " + num2 + " = " + sum);
				lblResult.setText("결과 : " + s);
				// setText : 텍스트뷰의 텍스트 설정

			}
		});

		// 5-3. * 공식 만들기
		btnGob.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim()); //// getText : 텍스트뷰의 값 호출

				int sum = num1 * num2;

				String s = (num1 + " * " + num2 + " = " + sum);
				lblResult.setText("결과 : " + s);
				// setText : 텍스트뷰의 텍스트 설정

			}
		});

		// 5-4. / 공식 만들기
		btnNa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim()); //// getText : 텍스트뷰의 값 호출

				int sum = num1 / num2;

				String s = (num1 + " / " + num2 + " = " + sum);
				lblResult.setText("결과 : " + s);
				// setText : 텍스트뷰의 텍스트 설정

			}
		});

	}

	public static void main(String[] args) {
		// 3-1. 창 생성하기 (상단 이름은 super에서 설정함!!!!)
		new SwingTextF_07();

	}

}
