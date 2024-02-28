package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracledb.DbConnect;

public class JdbcScore_02 {

	DbConnect db = new DbConnect();
	Scanner in = new Scanner(System.in);

	// 입력값
	public void insertSungjuk() {
		System.out.println("학생명");
		String name = in.nextLine();
		System.out.println("java 점수");
		int java = Integer.parseInt(in.nextLine());
		System.out.println("oracle 점수");
		int oracle = Integer.parseInt(in.nextLine());

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		String sql = "insert into sungjuk (nym, name, java, oracle) values (seq_score.nextval, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);

			// 바인딩
			pstmt.setString(1, name);
			pstmt.setInt(2, java);
			pstmt.setInt(3, oracle);

			// ?갯수 만큼 모두 바인딩 후 실행하기
			pstmt.execute();
			System.out.println("추가되었습니다~~~!!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	// 총점, 평균구하는 메서드
	public void calcTotalAverage() {
		Connection conn = db.getOracle();
		Statement stmt = null;

		String sql = "update sungjuk set total = java + oracle, average = (java + oracle) / 2";

		try {
			stmt = conn.createStatement();
			stmt.execute(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	// 전체출력
	public void writeALL() {

		// 총점평균 먼저 계산 후 출력
		this.calcTotalAverage();
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sungjuk order by nym";
		System.out.println("\t\t********학생 성적 출력**********");
		System.out.println();
		System.out.println("번호\t이름\t자바\t오라클\t총점\t평균");
		System.out.println("-------------------------------------------------------------------------");

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("nym") + "\t" + rs.getString("name") + "\t" + rs.getInt("java") + "\t"
						+ rs.getInt("oracle") + "\t" + rs.getInt("total") + "\t" + rs.getDouble("average"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

	}

	// 삭제
	public void deleteSungjuk() {

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.println("삭제할 시퀀시 입력");
		int nym = Integer.parseInt(in.nextLine());

		String sql = "delete from sungjuk where nym = ?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, nym);

			int n = pstmt.executeUpdate();

			if (n == 0) {
				System.out.println(nym + "번 학생은 존재하지 않습니다.");
			} else {
				System.out.println(nym + "번 학생 정보를 삭제했습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//업데이트
	public void updateSungjuk() {
		//수정할 num입력 후 java, oracle 의 수정값 입력 받아 수정할것!!!
		//num이 있을경우 "수정됨" 없을 경우 "5번학생은 존재하지않음"
		System.out.println("수정할 번호 선택");
		int nym = Integer.parseInt(in.nextLine());
		
		System.out.println("수정할 자바 점수 입력");
		int java = Integer.parseInt(in.nextLine());
		System.out.println("수정할 오라클 점수 입력");
		int oracle = Integer.parseInt(in.nextLine());
		
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		String sql = "update sungjuk set java = ?, oracle = ? where nym = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setInt(1, java);
			pstmt.setInt(2, oracle);
			pstmt.setInt(3, nym);
			
			//실행
			int n = pstmt.executeUpdate();
			
			if(n == 1) {
				System.out.println("수정완료!");
			}
			else {
				System.out.println(nym + "번 학생이 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
			
		}
		
	
	}

	public void process() {
		while (true) {
			System.out.println();
			System.out.println("1.학생성적 추가   2.학생정보 전체출력   3.학생정보 삭제   4.학생정보 수정   9.종료");
			System.out.println("-------------------------------------------------------------------------");

			int nym = Integer.parseInt(in.nextLine());

			switch (nym) {
			case 1:
				this.insertSungjuk();
				break;
			case 2:
				this.writeALL();
				break;
			case 3:
				this.deleteSungjuk();
				break;
			case 4 :
				this.updateSungjuk();
				break;
			case 9:
				System.out.println("\t\t********성적 프로그램 종료**********");
				System.exit(0); // 강제종료
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcScore_02 score = new JdbcScore_02();
		score.process();
		
	
	

	}

}
