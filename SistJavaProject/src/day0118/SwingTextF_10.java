package day0118;

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

//2개의 텍스트필드에 숫자를 넣고 버튼을 만든 후 클릭하면 라벨에  2+3 = 5나오게 출력
public class SwingTextF_10 extends JFrame {

	// 변수선언
	Container cp; // 컨테이너는 담은 그릇......
	JTextField tfNum1, tfNum2;
	JButton btnAdd, btnmiu, btngob, btnna; // 더하기 값
	JLabel lblNum1, lblNum2, lblResult;

	public SwingTextF_10() {
		super("텍스트 필드 문제");

		cp = this.getContentPane(); // 프레임으로 불러온 또 하나의 패널

		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255, 204, 000));
		setDesign();
		this.setVisible(true);

	}

	public void setDesign() {

		this.setLayout(null);
		lblNum1 = new JLabel("숫자1");
		lblNum2 = new JLabel("숫자2");

		lblNum1.setBounds(20, 20, 50, 30);
		this.add(lblNum1);

		lblNum2.setBounds(20, 60, 50, 30);
		this.add(lblNum2);

		tfNum1 = new JTextField();
		tfNum1.setBounds(80, 20, 60, 30);
		this.add(tfNum1);

		tfNum2 = new JTextField();
		tfNum2.setBounds(80, 60, 60, 30);
		this.add(tfNum2);

		// 버튼 만들어주기!!!!!!!
		btnAdd = new JButton("+");
		btnAdd.setBounds(40, 110, 50, 40); // x축, y축, 가로, 세로
		this.add(btnAdd);

		btnmiu = new JButton("-");
		btnmiu.setBounds(100, 110, 50, 40);
		this.add(btnmiu);

		btngob = new JButton("*");
		btngob.setBounds(160, 110, 50, 40);
		this.add(btngob);

		btnna = new JButton("/");
		btnna.setBounds(220, 110, 50, 40);
		this.add(btnna);

		// 결과확인
		lblResult = new JLabel("결과 나오는곳...");
		lblResult.setBounds(20, 170, 250, 60);
		lblResult.setBorder(new TitledBorder("결과확인"));
		lblResult.setFont(new FontUIResource("", Font.BOLD, 25)); // 폰트와 폰트스타일 및 크기쓰기 / 글꼴변경...
		this.add(lblResult);

		// 익명내부 클래스 (더하기)
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 더하기
				int num1 = Integer.parseInt(tfNum1.getText().trim()); // 앞 뒤 공백제거 후 변환 / 값을 입력하면 getText해서 넘겨짐
				int num2 = Integer.parseInt(tfNum2.getText().trim());

				int sum = num1 + num2;

				String s = (num1 + " + " + num2 + " = " + sum);
				lblResult.setText("결과 : " + s); // getText를 받아서 setText String을 불러와서 변경 되서 출력됨.

			}

		});

		// 빼기
		btnmiu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 더하기
				int num1 = Integer.parseInt(tfNum1.getText().trim()); // 앞 뒤 공백제거 후 변환 / 값을 입력하면 getText해서 넘겨짐
				int num2 = Integer.parseInt(tfNum2.getText().trim());

				int sum = num1 - num2;

				String s = (num1 + " - " + num2 + " = " + sum);
				lblResult.setText("결과 : " + s); // getText를 받아서 setText String을 불러와서 변경 되서 출력됨.

			}

		});

		// 곱하기
		btngob.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim());

				int sum = num1 * num2;

				String s = (num1 + " * " + num2 + " = " + sum);
				lblResult.setText("결과 : " + s);
			}
		});

		// 나누기
		btnna.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int num1 = Integer.parseInt(tfNum1.getText().trim());
				int num2 = Integer.parseInt(tfNum2.getText().trim());

				int sum = num1 / num2;

				String s = (num1 + " / " + num2 + " = " + sum);
				lblResult.setText("결과 : " + s);
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingTextF_10();
	}

}
