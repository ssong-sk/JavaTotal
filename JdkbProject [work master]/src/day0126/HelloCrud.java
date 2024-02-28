package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracledb.DbConnect;

public class HelloCrud {

	DbConnect db = new DbConnect();

	// 1. insert 값 입력
	public void insert() {
		Scanner in = new Scanner(System.in);
		String name, addr;
		String sql = ""; // 선언만 해둠.

		System.out.println("이름을 입력하세요");
		name = in.nextLine();

		System.out.println("주소를 입력하세요");
		addr = in.nextLine();

		// 입력 후에 sql이 들어가야함. ////현재 teacher에 시퀀스를 만들어서 작업! -> table 도 마찬가지.
		sql = "insert into hello values(seq2.nextval, '" + name + "', '" + addr + "', sysdate)"; // 오라클에서는 문자 ''으로 쓰기
																									// 때문에 자바에서 ""
																									// (대따옴표) 안에 넣어둬야함.
		System.out.println(sql);

		// 1.db연결
		Connection conn = null;

		// 2.statement
		Statement stmt = null; // sql문 객체 전송에 필요한 API

		conn = db.getOracle();

		try {
			stmt = conn.createStatement();

			// 3.SQL문 실행
			stmt.execute(sql);
			System.out.println("**데이터 추가됨**");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);

		}

	}

	// 2. 최종 출력 값 보이게
	public void select() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		StringBuffer sql = new StringBuffer();
		sql.append("select num, name, addr, sdate");
		sql.append(" from hello"); // 또는 "select * from hello order by num"; 으로도 적용가능.

		conn = db.getOracle();
		System.out.println("오라클 계정 생성");

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString());

			System.out.println("******가입날짜 기록*******");
			System.out.println();
			System.out.println("시퀀스\t이름\t주소\t        가입날짜");
			System.out.println("------------------------------------------------");

			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				String date = rs.getString("sdate");

				System.out.println(num + "\t" + name + "\t" + addr + "\t" + date);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}

	}

	// 3. 삭제할 번호 입력 후 삭제
	public void delete() {
		Scanner in = new Scanner(System.in);
		String num;
		String sql = "";

		System.out.println("삭제할 번호 입력");
		num = in.nextLine(); // string으로 더 많이 사용하기 때문에 문자로 받아줌, (int로 받으면 문자형 변경해줘야하기 때문)

		sql = "delete from hello where num = " + num;
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();

			int a = stmt.executeUpdate(sql); // 조건을 주고 싶을떄 사용 -> 성공한 레코드의 갯수

			// 없는 번호 입력 시 실제 삭제가 안되므로 0이 반환
			if (a == 0) {
				System.out.println("없는 데이터 번호 입니다.");
			} else {
				System.out.println("***삭제완료!***");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);

		}

	}

	// 4-1 수정하려는 데이터 조회
	public boolean getOneData(String num) { // 하나의 데이터만 조회하려고 하는것.
		boolean flag = false; // num에 해당하는 테이터가 있으면 ture, 없으면 false
		String sql = "select * from hello where num = " + num;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// 한개만 조회할 경우는 if문
			if (rs.next()) { // 데이터가 있는경우
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}

		return flag;
	}

	// 4.수정
	public void update() {
		// 수정할 시퀀스를 입력 후 이름, 주소 입력
		Scanner in = new Scanner(System.in);
		String num, name, addr;

		System.out.println("수정할 번호를 입력");
		num = in.nextLine();

		if (!getOneData(num)) { // 또는 !this.getonedata(num)해줘도 됨. /값을 넘겼는데 존재하지 않을경우.
			System.out.println("해당번호는 존재하지 않습니다.");
			return; // 메서드 종료

		}

		System.out.println("수정할 이름으로 변경");
		name = in.nextLine();
		System.out.println("수정할 주소로 변경");
		addr = in.nextLine();

		String sql = "update hello set name = '" + name + "', addr = '" + addr + "'where num = " + num;
		System.out.println(sql);

		Connection conn = null;
		Statement stmt = null;

		conn = db.getOracle();
		try {
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);

			if (a == 0) {
				System.out.println("수정할 테이터가 존재하지 않습니다.");

			} else {
				System.out.println("***수정되었습니다***");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloCrud hello = new HelloCrud();
		// hello.select();

		Scanner in = new Scanner(System.in);
		int n;

		while (true) {
			System.out.println("**hello db 연습**");
			System.out.println("1. insert  2.select  3.delete  4.update  9.exit");
			System.out.println("------------------------------------------------------");

			n = Integer.parseInt(in.nextLine());

			if (n == 1) {
				hello.insert();
			} else if (n == 2) {
				hello.select();
			} else if (n == 3) {
				hello.delete();
			} else if (n == 4) {
				hello.update();
			} else if (n == 9) {
				System.out.println("종료합니다");
				break;
			}

		}

	}

}
