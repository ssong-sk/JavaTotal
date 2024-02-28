package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracledb.DbConnect;


//executeUpdate()는 INSERT, UPDATE, DELETE와 같은 DML(Data Manipulation Language)에서 실행 결과로 영향을 받은 레코드 수를 반환
//회원의 이메일을 입력해서 해당 회원의 정보를 가져오는 기능을 구현했다.
//DAO에서는 sql을 실행하고 해당 결과를 DB로 반환받는다.
//이 때 SELECT문은 여러 레코드를 조회하면서 결과 집합을 반환하기 때문에 executeQuery()사용해 실행하고  
//if(rs.next()) 를 통해 다음 결과가 있을 경우 커서를 열(column)을 따라 하나하나 이동해가며 member 객체에 저장하고 반환하게 된다.


//executequery()는 쿼리를 실행하고, 결과를 ResultSet 객체로 반환한다. 반환된 ResultSet 객체를 통해 결과를 가져올 수 있다.
//SELECT는 하나 이상의 레코드를 조회하게 되는데 이 때 결과 집합을 반환한다. ResultSet은 결과 세트에 대한 커서를 포함하므로 사용자가 쿼리 결과를 반복적으로 가져올 수 있다.
//커서는 데이터베이스에서 조회된 결과 집합에서 현재 위치를 나태내는 포인터로 이를 이용해 하나의 행을 읽어오고, 디음 행으로 이동하여 원하는 레코드를 순차적으로 탐색할 수 있다.


public class JdbcPstmt_01 {

	DbConnect db = new DbConnect();
	Scanner in = new Scanner(System.in);

	// insert
	public void insertSangpum() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		// 입력값
		System.out.println("type?");
		String type = in.nextLine();
		System.out.println("상품명?");
		String sang = in.nextLine();
		System.out.println("수량?");
		int su = Integer.parseInt(in.nextLine());
		System.out.println("단가?");
		int dan = Integer.parseInt(in.nextLine());

		// PreparedStatement는 미완의 sql문을 작성할 수 있다.
		// 변수를 ?로 표시 후 나중에 바인딩 시켜주면 된다

		String sql = "insert into sales values(seq2.nextval, ?, ?, ?, ?, sysdate)"; // 4개의 입력 값을 ? 표시

		try {
			pstmt = conn.prepareStatement(sql); // sql문 전달하는 객체 / prepareStatement을통해서

			// ?를 순서대로 바인딩 한 후 업데이트
			pstmt.setString(1, type); // 1번쨰로 입력하는것 타입
			pstmt.setString(2, sang);
			pstmt.setInt(3, su);
			pstmt.setInt(4, dan);

			// 업데이트
			// pstmt.execute();
			int n = pstmt.executeUpdate();

			if (n == 1) {
				System.out.println("인서트 성공!!!!");
			} else {
				System.out.println("인서트 실패!!!!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	public void writeSangpum() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sales order by num asc";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("시퀀스\t카테고리\t상품명\t수량\t단가\t입고일");
			System.out.println("-------------------------------------------------------------");

			while (rs.next()) {
				System.out.println(rs.getInt("num") + "\t" + rs.getString("type") + "\t" + rs.getString("sangpum")
						+ "\t" + rs.getInt("su") + "\t" + rs.getInt("dan") + "\t" + rs.getDate("ipgo"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

	}

	// 삭제
	public void dateSangpum() {
		// 시퀀스 번호로 삭제하기
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.println("삭제할 시퀀스는?");
		int num = Integer.parseInt(in.nextLine());

		String sql = "delete from sales where num = ?"; // 모든 변수처리를 바인딩 처리해줌. num이라고 써도 상관은 없음

		try {
			pstmt = conn.prepareStatement(sql);

			// 바인딩
			pstmt.setInt(1, num);

			int n = pstmt.executeUpdate();

			if (n == 1) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제살패");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	// 수정 num을 인자로 받아서 데이터가 있으면 true, 없으면 flase를 반환하는 메서드 만들기
	public boolean isOneData(String num) { // num을 number라고 해도 int나 string을 써도 상관없음
		boolean b = false;
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sales where num = ?"; // num만 출력

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				b = true;
			} else {
				b = false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

		return b;

	}

	// 수정 시퀀스 입력 후 수정데이터 수정
	public void upDateSangpum() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.println("수정할 시퀀스 번호?");
		String num = in.nextLine();

		// 여기에서 isOneData()를 호출해서 그 번호가 존재하는지 확인
		if (!this.isOneData(num)) {
			System.out.println("해당 번호는 존재하지 않습니다.");
			return; // 메서드 종료 (if문에서 종료는 return)
		}
		System.out.println("수정할 상품명");
		String sang = in.nextLine();
		System.out.println("수정할 수량");
		int su = Integer.parseInt(in.nextLine());
		System.out.println("수정할 단가");
		int dan = Integer.parseInt(in.nextLine());

		String sql = "update sales set sangpum = ?, su = ?, dan = ? where num = ?";

		try {
			pstmt = conn.prepareStatement(sql);

			// 4개 ?를 순서대로 바인딩
			pstmt.setString(1, sang);
			pstmt.setInt(2, su);
			pstmt.setInt(3, dan);
			pstmt.setString(4, num);

			// 업데이트
			pstmt.execute(); // 조건없이 업데이트만 할경우

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	public void searchName() {
		System.out.println("검색할 이름을 입력하시오");
		String sang = in.nextLine();

		String sql = "select num, sangpum, su, dan from sales where sangpum like ?";

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);

			System.out.println("시퀀스\t상품명\t수량\t단가");
			// 바인딩
			pstmt.setString(1, "%" + sang + "%"); // 이름을 포함하는 의미
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("num") + "\t" + rs.getString("sangpum") + "\t" + rs.getInt("su") + "\t"
						+ rs.getInt("dan"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcPstmt_01 sales = new JdbcPstmt_01();
		Scanner in = new Scanner(System.in);

		int n;

		while (true) {
			System.out.println();
			System.out.println("*************************상품입고*******************************");
			System.out.println();

			System.out.println("1.상품추가    2.상품전체출력   3.상품삭제    4.상품수정    5.검색(이름)   9.종료");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("선택할 메뉴의 번호를 입력");
			n = Integer.parseInt(in.nextLine());

			if (n == 1) {
				sales.insertSangpum();
			} else if (n == 2) {
				sales.writeSangpum();
			} else if (n == 3) {
				sales.dateSangpum();
			} else if (n == 4) {
				sales.upDateSangpum();
			} else if (n == 5) {
				sales.searchName();
			} else if (n == 9) {
				System.out.println();
				System.out.println("************************프로그램 종료************************");
				break;
			}
		}

	}

}
