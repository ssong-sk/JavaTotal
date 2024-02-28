package oracledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	// url 변수만들기
	static final String ORACLE_DB = "jdbc:oracle:thin:@localhost:1521:XE"; // 오라클 퀀텀에 가서 주소 복사해서 넣으면 됨...

	// CONNECT 메서드 만들기
	public Connection getOracle() { // void타입이 아니면 무조건 return 해줘야함.
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(ORACLE_DB, "teacher", "a1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("로칼 오라클 연결 실패!!!!");
		}

		return conn;

	}

	// close 메서드 만들기 - select만 rs가 들어감...(ResultSet) / 총 4개
	// 1번째
	public void dbClose(ResultSet rs, Statement stmt, Connection conn) { // 역순으로 변수값 지정해주기

		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 2번째
	public void dbClose(Statement stmt, Connection conn) { // 역순으로 변수값 지정해주기

		try {
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 3번째 PreparedStatement
	public void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) { // 역순으로 변수값 지정해주기

		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 4번째
	public void dbClose(PreparedStatement pstmt, Connection conn) { // 역순으로 변수값 지정해주기

		try {

			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
