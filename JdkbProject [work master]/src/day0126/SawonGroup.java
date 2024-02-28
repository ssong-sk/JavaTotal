package day0126;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracledb.DbConnect;

public class SawonGroup {

	DbConnect db = new DbConnect(); // 다른 패키지에 있기 때문에 import 형성

	public void connectSawonGroup() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		/*String sql = "select gender, count(buseo) count, to_char(round(avg(pay),0), 'L999,999,999') avgpay,\r\n"
				+ "to_char(max(pay),'L999,999,999') maxpay, to_char(min(pay), 'L999,999,999') minpay\r\n"
				+ "from sawon\r\n"
				+ "group by gender";*/
		
		//입력 값 정리하기 위헤서 stringbuffer을 많이 사용한다.
		StringBuffer sql = new StringBuffer(); //가변(mutable)한 문자열을 처리하기 위한 클래스
		
		sql.append("select gender, count(buseo) count, to_char(round(avg(pay),0), 'L999,999,999') avgpay,");
		sql.append(" to_char(max(pay),'L999,999,999') maxpay, to_char(min(pay), 'L999,999,999') minpay");
		sql.append(" from sawon");
		sql.append(" group by gender");

		conn = db.getOracle();
		System.out.println("오라클 계정 연결 성공!!");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString());
			System.out.println("\t***회사 남녀별 급여통계***");
			System.out.println();
			System.out.println("성별\t인원수\t      평균급여\t                최고급여\t                 최저급여");
			System.out.println("-------------------------------------------------------------------------------------");
			
			
			while(rs.next()) {
				String gender = rs.getString("gender");
				int conunt = rs.getInt("count");
				String avgpay = rs.getString("avgpay");
				String maxpay = rs.getString("maxpay");
				String minpay = rs.getString("minpay");
				
				System.out.println(gender + "\t" + conunt + "\t" + avgpay + "\t" + maxpay + "\t" + minpay);
				
			}
			
			//dbconnect에서 만든 close 대신에 4개중 선택해서 넣어줌,
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		

	}
	/////////////////////////////////////////////////////////////
	public void personGroup() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "select job, count(job) count, round(avg(age), 1) avgage"
				+ " from person"
				+ " group by job";
		
		conn = db.getOracle();
		System.out.println("계정연결 성공!!!");
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("***회사의 job별 인원수와 평균나이***");
			System.out.println();
			System.out.println("직업\t인원수\t평균나이");
			System.out.println("------------------------------------------");
			
			while(rs.next()) {
				String job = rs.getString("job");
				int count = rs.getInt("count");
				int avgage = rs.getInt("avgage");
				
				System.out.println(job + "\t" + count + "\t" + avgage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SawonGroup sgroup = new SawonGroup();
		sgroup.connectSawonGroup();
		//sgroup.personGroup();

	}

}
