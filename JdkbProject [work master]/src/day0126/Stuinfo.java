package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracledb.DbConnect;

public class Stuinfo {

	// 1. DBconnect 생성
	DbConnect db = new DbConnect();

	// 2. insert 메서드 형성
	public void insert() {

		// 2-1. 입력값 생성 및 변수 설정
		Scanner in = new Scanner(System.in);
		String name, gender, hp;
		int age;
		String sql = "";

		// 2-2. 이름, 성별, 나이, 핸드폰 입력값 나오게 생성
		System.out.println("학생명?");
		name = in.nextLine();

		System.out.println("성별?");
		gender = in.nextLine();

		System.out.println("나이");
		age = Integer.parseInt(in.nextLine());

		System.out.println("연락처?");
		hp = in.nextLine();

		// 2-3. 입력 후 sql에 넣기
		sql = "insert into stuinfo values(seq_info.nextval, '" + name + "', '" + gender + "', '" + age + "', '" + hp
				+ "', sysdate)";

		System.out.println(sql);

		// 2-4. db연결하기 값
		Connection conn = null;

		// 2-5. 행하기 위한 역할을 담당하는 클래스 - 값
		Statement stmt = null;

		// 2-6. 연결할 오라클 값 가져오기
		conn = db.getOracle();

		// 2-7.데이터베이스로 SQL 문을 보내기 위한 개체 만들기 -> try - catch
		try {
			stmt = conn.createStatement();

			// 2-8.SQL문 실행
			stmt.execute(sql); // 매개변수로 전달받은 SQL 구문을 수행하는 메소드
			System.out.println("***데이터 추가 완료***");

			// 2-9.finally 추가 및 close
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	// 3. select 메서드 형성
	public void select() {
		// 3-1. 연결하는 값
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 3-2. 입력값 생성 및 변수 설정
		StringBuffer sql = new StringBuffer();
		sql.append("select s_no, s_name, s_gender, s_age, s_hp, gaipday");
		sql.append(" from stuinfo");

		// 3-3. 연결할 오라클 값 가져오기
		conn = db.getOracle();
		System.out.println("오라클 계정 생성");

		// 3-4.데이터베이스로 SQL 문을 보내기 위한 개체 만들기 -> try - catch
		try {

			// 3-5.SQL문 실행
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString());

			// 3-6 출력값 생성
			System.out.println("********가입정보********");
			System.out.println();
			System.out.println("시퀀스\t이름\t성별\t나이\t핸드폰번호\t         가입날짜");
			System.out.println("-------------------------------------------------------------------");

			// 3-7. while문 작성 (입력한 값에 대한 최종 출력값이 출력되기 위해서 작성 필요)
			while (rs.next()) {
				int num = rs.getInt("s_no");
				String name = rs.getString("s_name");
				String gender = rs.getString("s_gender");
				int age = rs.getInt("s_age");
				String hp = rs.getString("s_hp");
				String date = rs.getString("gaipday");

				// 3-8. 출력값
				System.out.println(num + "\t" + name + "\t" + gender + "\t" + age + "\t" + hp + "\t" + date);

			}
			// 3-9.finally 추가 및 close
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}

	}

	// 4. delete 메서드 형성
	public void delete() {
		// 4-1. 입력값 생성 및 변수 설정
		Scanner in = new Scanner(System.in);
		String num;
		String sql = "";

		// 4-2. 삭제 입력값 나오게 생성
		System.out.println("삭제할 정보 번호");
		num = in.nextLine();

		// 4-3. 입력 후 sql에 넣기
		sql = "delete from stuinfo where s_no = " + num;
		System.out.println(sql);

		// 4-4. db연결하기 값 / 행하기 위한 역할을 담당하는 클래스 - 값
		Connection conn = null;
		Statement stmt = null;

		// 4-5. 연결할 오라클 값 가져오기
		conn = db.getOracle();

		// 4-6.데이터베이스로 SQL 문을 보내기 위한 개체 만들기 -> try - catch
		try {
			// 4-7.SQL문 실행
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql); // 조건 설정

			// 4-8.없는 번호 입력시 삭제 안된다는 if문 작성해주기.
			if (a == 0) {
				System.out.println("없는 데이터 번호 입니다.");
			} else {
				System.out.println("***************************  삭제완료  ***************************");
			}

			// 4-9.finally 추가 및 close
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	// 5. update 메서드 형성
	public void update() {
		// 5-1. 입력값 생성 및 변수 설정
		Scanner in = new Scanner(System.in);
		String num, name, gender, age, hp;

		// 5-2. 수정 입력값 나오게 생성
		System.out.println("수정할 번호를 입력");
		num = in.nextLine();

		// 6-8. if문으로 작성 / 해당번호가 존재하지 않을경우 메서드 종료하기
		if (!getOneData(num)) {
			System.out.println("해당 번호는 존재하지 않습니다.");
			return;
		}

		System.out.println("수정할 이름으로 변경");
		name = in.nextLine();
		System.out.println("수정할 성별로 변경");
		gender = in.nextLine();
		System.out.println("수정할 나이로 변경");
		age = in.nextLine();
		System.out.println("수정할 핸드폰번호로 변경");
		hp = in.nextLine();

		// 5-3. 입력값 및 출력
		String sql = "update stuinfo set s_name = '" + name + "', s_gender = '" + gender + "', s_age = " + age
				+ ", s_hp = '" + hp + "' where s_no = " + num; // 컬럼명
		System.out.println(sql);

		// 5-4. db연결하기 값 / 행하기 위한 역할을 담당하는 클래스 - 값
		Connection conn = null;
		Statement stmt = null;

		// 5-5. 연결할 오라클 값 가져오기
		conn = db.getOracle();

		// 5-6.데이터베이스로 SQL 문을 보내기 위한 개체 만들기 -> try - catch
		try {
			// 5-7.SQL문 실행
			stmt = conn.createStatement();
			int a = stmt.executeUpdate(sql);

			// 5-8.없는 번호 입력시 존재하지 않는다는 if문 작성해주기.
			if (a == 0) {
				System.out.println("수정할 데이터가 존재하지 않습니다.");
			} else {
				System.out.println("***************************  수정완료  ***************************");
			}

			// 5-9.finally 추가 및 close
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}

	}

	// 6. update 데이터조회 메서드 형성
	public boolean getOneData(String num) {
		// 6-1. boolean 변수 선언후 sql에 넣기
		boolean flag = false;
		String sql = "select * from stuinfo where s_no = " + num;

		// 6-2. 연결하는 값
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 6-3. 연결할 오라클 값 가져오기
		conn = db.getOracle();

		// 6-4.데이터베이스로 SQL 문을 보내기 위한 개체 만들기 -> try - catch
		try {
			// 6-5.SQL문 실행
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// 6-6.한개의 조회할 경우 if문 작성해주기.
			if (rs.next()) {
				flag = true;
			} else {
				flag = false;
			}

			// 6-7.finally 추가 및 close
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}

		return flag;

	}

	// 7. 학생검색 메서드 만들기
	public void search() {
		// 7-1. 입력값 생성 및 변수 설정
		Scanner in = new Scanner(System.in);
		String sName;
		
		//7-2.검색
		System.out.println("검색할 학생명을 입력");
		sName = in.nextLine();
	
        //7-3.
		String sql = "select * from stuinfo where s_name like '%" + sName + "%' order by s_name";
		
		// 7-4. 연결하는 값
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 7-5. 연결할 오라클 값 가져오기
		conn = db.getOracle();

		// 7-6.데이터베이스로 SQL 문을 보내기 위한 개체 만들기 -> try - catch
		try {

			// 7-7.SQL문 실행
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			// 7-8 출력값 생성
			System.out.println("********가입정보********");
			System.out.println();
			System.out.println("시퀀스\t이름\t성별\t나이\t핸드폰번호\t         가입날짜");
			System.out.println("-------------------------------------------------------------------");

			// 7-9. while문 작성 (입력한 값에 대한 최종 출력값이 출력되기 위해서 작성 필요)
			while (rs.next()) {
				int num = rs.getInt("s_no");
				String name = rs.getString("s_name");
				String gender = rs.getString("s_gender");
				int age = rs.getInt("s_age");
				String hp = rs.getString("s_hp");
				String date = rs.getString("gaipday");

				// 7-10. 출력값
				System.out.println(num + "\t" + name + "\t" + gender + "\t" + age + "\t" + hp + "\t" + date);

			}
			// 7-11.finally 추가 및 close
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		}

	}

	public static void main(String[] args) {
		// 1-1. 출력문 생성
		Stuinfo stu = new Stuinfo();
		// stu.insert();

		Scanner in = new Scanner(System.in);

		// 1-2. while문 생성하기 (선택하는 번호에 맞춰서 if문으로 입력 받아서 출력)
		while (true) {
			System.out.println("*******************Stuinfo 번호 선택해주세요****************************");
			System.out.println();
			System.out.println("1.학생정보입력   2.정보출력   3.정보삭제   4.학생정보수정   5. 학생검색   9.종료");
			System.out.println("-------------------------------------------------------------------");

			// 1-3. 입력 받을 값에 형 변환 해주기.
			int s = Integer.parseInt(in.nextLine());

			// 2-10. insert if문 작성
			if (s == 1) {
				stu.insert();
			}
			// 3-10. select if문 작성
			else if (s == 2) {
				stu.select();
			}
			// 4-10. delete if문 작성
			else if (s == 3) {
				stu.delete();
			}
			// 5-10. update if문 작성
			else if (s == 4) {
				stu.update();
			}
			// 7-11. search if문 작성
			else if (s == 5) {
				stu.search();
			}
			else if (s == 9) {
				System.out.println("***************************  입력종료  ***************************");
				break;
			}

		}

	}

}
