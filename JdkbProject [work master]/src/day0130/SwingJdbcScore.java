package day0130;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import oracledb.DbConnect;

public class SwingJdbcScore extends JFrame implements ActionListener {

	DbConnect db = new DbConnect();
	Container cp;

	DefaultTableModel model; // 테이블 추가 삭제  <<DefaultTableModel 클래스 사용이유 -> JTABLE에서는 추가, 삭제기능을 못함 / DTM사용 시 addrow(), removerow() 사용가능>>
	JTable table;
	JButton btnAdd, btnDel, btnUpdate;

	AddStuInfo addForm = new AddStuInfo("성적추가"); // AddStuInfo에 추가하는 버튼 가져오기, 생성할시 제목은 입력을 해줘야함.
	UpdateStuInfo updateForm = new UpdateStuInfo("데이터 수정"); //UpdateStuInfo에서 추가버튼 가져오기

	// 생성자
	public SwingJdbcScore(String title) {
		super(title);

		cp = this.getContentPane();
		this.setBounds(200, 100, 400, 300);
		cp.setBackground(new Color(255, 255, 200));

		initDesign();
		this.setVisible(true);

	}

	////////////////////////////////////////////// //////////////테이블 출력하는 메서드 만들기
	public void tableWrite() {
		// 테이블 초기화
		model.setRowCount(0); // 테이블 초기화 하려면 0으로 입력

		// db연결
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from stuinfo_1 order by num";

		conn = db.getOracle();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Vector<String> data = new Vector<String>(); // vector 컬렉션 객체를 통해서 데이터를 무한대로 추가시켜줄 때 사용

				data.add(rs.getString("num"));
				data.add(rs.getString("name"));
				data.add(rs.getString("java"));
				data.add(rs.getString("jsp"));
				data.add(rs.getString("spring"));
				data.add(rs.getString("total"));
				data.add(rs.getString("average"));
				data.add(rs.getString("ban"));

				// 테이블에 추가
				model.addRow(data); // 각 입력했던 값을 한개로 묶어서 model에 추가 -> 열들의 꾸러미들을 꾸려서 전달함.

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	////////////////////////////////////////////////////////////// 판넬 레이아웃
	public void initDesign() {
		String[] title = { "번호", "이름", "반", "Java", "Jsp", "Spring", "총점", "평균" }; // 배열선언
		model = new DefaultTableModel(title, 0); // 0은 데이터 하나도 없다는 의미 / 처음 디폴트 설정시 0으로 놔둬야함. / DefaultTableModel 써야 추가,
													// 삭제가 가능함.
		table = new JTable(model); // 테이블안에 model을 넣어줌.
		this.add("Center", new JScrollPane(table));

		// 테이블에 db데이터 출력
		tableWrite();

		// 버튼 3개 올릴 패널
		JPanel pTop = new JPanel();
		this.add("North", pTop);

		// 추가버튼
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pTop.add(btnAdd);

		// 추가폼에 있는 추가버튼에 액션 추가
		addForm.btnAdd.addActionListener(this);

		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		pTop.add("North", btnDel);

		// 추가폼에 있는 수정버튼에 액션 추가 //최종 수정이 되는 버튼!
		updateForm.btnMod.addActionListener(this);

		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(this);
		pTop.add("North", btnUpdate);

	}

	////////////////////////////////////////// insert
	public void insertData() {
		String name = addForm.tfName.getText(); // getText는 이름 값을 가져오는것 /텍스트필드이기 때문에 string으로 해줘야함
		String java = addForm.tfJava.getText();
		String jsp = addForm.tfJsp.getText();
		String spring = addForm.tfSpring.getText();
		String ban = (String) addForm.cbBan.getSelectedItem(); // 형맞추기

		int tot = Integer.parseInt(java) + Integer.parseInt(jsp) + Integer.parseInt(spring);
		double avg = tot / 3.0;

		String sql = "insert into stuinfo_1 values(seq2.nextval, ?, ?, ?, ?, ?, ?, ?)";

		// db연결 / sql문전송
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			// ? 순서대로 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avg);
			pstmt.setString(7, ban);

			// 업데이트
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	public void deletedata(String num) {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null; // 메서드를 넘겨주는것

		String sql = "delete from stuinfo_1 where num = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			int n = pstmt.executeUpdate();

			if (n == 0) {
				JOptionPane.showMessageDialog(this, "없는 테이터 번호입니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	/////////////////////////////////////// 수정
	public void updateData() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		String num = updateForm.num;
		String name = updateForm.tfName.getText(); // getText는 이름 값을 가져오는것 /텍스트필드이기 때문에 string으로 해줘야함
		String java = updateForm.tfJava.getText();
		String jsp = updateForm.tfJsp.getText();
		String spring = updateForm.tfSpring.getText();
		String ban = (String) updateForm.cbBan.getSelectedItem(); // 형맞추기

		int tot = Integer.parseInt(java) + Integer.parseInt(jsp) + Integer.parseInt(spring);
		double avg = tot / 3.0;

		// String sql = "update stuinfo_1 set name = ?, java = ?, jsp = ?, spring = ?,
		// total = ?, average =?, ban = ? where num = ? ";

		String sql = "update stuinfo_1 set name = ?, java = ?, jsp = ?, spring = ?, total = " + tot + ", average = "
				+ avg + ", ban = ?  where num = ? ";

		try {

			pstmt = conn.prepareStatement(sql);

			// ? 순서대로 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, java);
			pstmt.setString(3, jsp);
			pstmt.setString(4, spring);
			// pstmt.setInt(5, tot);
			// pstmt.setDouble(6, avg);
			pstmt.setString(5, ban);
			pstmt.setString(6, num);

			// 업데이트
			pstmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	/////////////////////////////////////////// 버튼 디자인
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == btnAdd) { // 추가버튼
//			System.out.println("추가합니다");
			addForm.setVisible(true); // 생성된 addForm 을 보여주게 함.

		} else if (ob == addForm.btnAdd) { // 학생추가 버튼이벤트
			// 입력하는 데이터를 읽어서 db 추가
			insertData();
			this.tableWrite();

			// 초기화하면서 추가폼은 사라지게
			addForm.tfName.setText("");
			addForm.tfJava.setText("");
			addForm.tfJsp.setText("");
			addForm.tfSpring.setText("");

			addForm.setVisible(false);

		} else if (ob == btnDel) {

			String num = JOptionPane.showInputDialog("삭제할 시퀀스는?");

			deletedata(num);
			this.tableWrite(); // 삭제된 화면 반영

		} else if (ob == btnUpdate) {
			String num = JOptionPane.showInputDialog("수정할 시퀀스는?");

			String sql = "select * from stuinfo_1 where num = ?";
			Connection conn = db.getOracle();
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			try {
				pstmt = conn.prepareStatement(sql);
				// 바인딩 후 실행~
				pstmt.setString(1, num);
				rs = pstmt.executeQuery();

				// 데이터 하나 조회
				if (rs.next()) {

					updateForm.num = num; // num 히든처리
					updateForm.tfName.setText(rs.getString("name")); // db에 있는 이름을 가지고 와서 아까 수정창에 있는 네임창에 띄어줌 / 기존에 있던
																		// 네임창에 새로운 이름을 불러오는 것이므로?
					updateForm.tfJava.setText(rs.getString("java"));
					updateForm.tfJsp.setText(rs.getString("jsp"));
					updateForm.tfSpring.setText(rs.getString("spring"));
					updateForm.cbBan.setSelectedItem(rs.getString("ban"));

					updateForm.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "존재하지 않은 번호입니다.");
				}

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				db.dbClose(rs, pstmt, conn);
			}

		} else if (ob == updateForm.btnMod) {

			updateData();
			this.tableWrite();

			// 초기화하면서 추가폼은 사라지게
			updateForm.tfName.setText("");
			updateForm.tfJava.setText("");
			updateForm.tfJsp.setText("");
			updateForm.tfSpring.setText("");

			updateForm.setVisible(false);
		}

	}

	public static void main(String[] args) {
		new SwingJdbcScore("학생성적관리 DB");

	}

}
