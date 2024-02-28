package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Scanner;

import oracle.net.aso.q;
import oracledb.DbConnect;

public class QuizJdbc {

	DbConnect db = new DbConnect();
	Scanner in = new Scanner(System.in);

	// 입력값
	public void insertMembar() {

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.println("사원명 입력");
		String sName = in.nextLine();
		System.out.println("부서명 입력");
		String buseo = in.nextLine();
		System.out.println("포지션 입력");
		String position = in.nextLine();
		System.out.println("성별 입력");
		String gender = in.nextLine();
		System.out.println("월급 입력");
		String pay = in.nextLine();
		System.out.println("보너스 입력");
		String bonus = in.nextLine();

		String sql = "insert into sawonmember values(quizjdbc.nextval, ?, ?, ?, ?, ?, ?, sysdate)";

		try {
			pstmt = conn.prepareStatement(sql);

			// 바인딩
			pstmt.setString(1, sName);
			pstmt.setString(2, buseo);
			pstmt.setString(3, position);
			pstmt.setString(4, gender);
			pstmt.setString(5, pay);
			pstmt.setString(6, bonus);

			pstmt.execute();
			System.out.println("*************사원정보가 추가되었습니다.***************");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	// 출력하기
	public void writeMember() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from sawonmember order by s_no";
		System.out.println("***********************************사원 정보 내역****************************");
		System.out.println();
		System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t        보너스\t        입사날짜");
		System.out.println("-----------------------------------------------------------------------------------");

		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00"); //화폐단위 메소드

		try {
			pstmt = conn.prepareStatement(sql); //화폐단위 메소드
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int s_no = rs.getInt("s_no");
				String s_name = rs.getString("S_NAME");
				String buseo = rs.getString("buseo");
				String position = rs.getString("position");
				String gender = rs.getString("gender");
				int pay = rs.getInt("pay");
				int bonus = rs.getInt("bonus");
				String ipsaday = rs.getString("ipsaday");

				String formattedPay = "￦" + decimalFormat.format(pay);
				String formattedBonus = "￦" + decimalFormat.format(bonus);

				System.out.println(s_no + "\t" + s_name + "\t" + buseo + "\t" + position + "\t" + gender + "\t"
						+ formattedPay + "\t" + formattedBonus + "\t" + ipsaday);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				int formattedNumber;
//				System.out.println(rs.getInt("s_no") + "\t" + rs.getString("S_NAME") + "\t" + rs.getString("buseo")
//						+ "\t" + rs.getString("position") + "\t" + rs.getString("gender") + "\t" + "￦" + rs.getString("pay") + "원"
//						+ "\t" + "￦" + rs.getString("bonus") + "원" + "\t" + rs.getDate("ipsaday"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			db.dbClose(rs, pstmt, conn);
//
//		}

	}

	// 삭제
	public void deleteMember() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.println("삭제할 번호를 입력하시오");
		int s_no = Integer.parseInt(in.nextLine());

		String sql = "delete from sawonmember where s_no = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s_no);

			int n = pstmt.executeUpdate();

			if (n == 0) {
				System.out.println(s_no + "번 학생은 존재하지 않습니다.");
			} else {
				System.out.println(s_no + "번 학생 정보를 삭제했습니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}

	public void updateMember() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		System.out.println("수정할 사원의 사원번호를 입력하시오.");
		int s_no = Integer.parseInt(in.nextLine());

		System.out.println("수정할 부서명");
		String buseo = in.nextLine();
		System.out.println("수정할 직급명");
		String position = in.nextLine();
		System.out.println("수정할 급여 금액");
		String pay = in.nextLine();
		System.out.println("수정할 보너스 금액");
		String bonus = in.nextLine();

		String sql = "update sawonmember set buseo = ?, position = ?, pay = ?, bonus = ? where s_no = ?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, buseo);
			pstmt.setString(2, position);
			pstmt.setString(3, pay);
			pstmt.setString(4, bonus);
			pstmt.setInt(5, s_no);

			int n = pstmt.executeUpdate();

			if (n == 1) {
				System.out.println("***********수정이 완료되었습니다.*************");
			} else {
				System.out.println(s_no + "번은 존재하지 않은 번호입니다.");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 이름검색
	public void searchMember() {

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		System.out.println("검색할 사원명을 입력하시오");
		String sName = in.nextLine();

		String sql = "select * from sawonmember where s_name like '%" + sName + "%' order by s_no";

		System.out.println("*****************************검색한 사원 정보*********************************");
		System.out.println();
		System.out.println("사원번호\t사원명\t부서\t직급\t성별\t월급여\t보너스\t입사날짜");
		System.out.println("-----------------------------------------------------------------------------------");

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("s_no") + "\t" + rs.getString("S_NAME") + "\t" + rs.getString("buseo")
						+ "\t" + rs.getString("position") + "\t" + rs.getString("gender") + "\t" + rs.getString("pay")
						+ "\t" + rs.getString("bonus") + "\t" + rs.getDate("ipsaday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);

		}

	}

	public static void main(String[] args) {
		QuizJdbc quiz = new QuizJdbc();
		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.println();
			System.out.println("1.사원정보입력   2.전체사원출력   3.사원삭제   4.사원수정   5.이름검색   9.시스템종료");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("위에 번호 중 선택하여 입력하시오");
			int n = Integer.parseInt(in.nextLine());

			if (n == 1) {
				quiz.insertMembar();
			} else if (n == 2) {
				quiz.writeMember();
			} else if (n == 3) {
				quiz.deleteMember();
			} else if (n == 4) {
				quiz.updateMember();
			} else if (n == 5) {
				quiz.searchMember();
			} else if (n == 9) {
				System.out.println("****************************입력을 종료하겠습니다.*******************************");
				return;
			}

		}

	}

}
