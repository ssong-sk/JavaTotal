package day0129;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracledb.DbConnect;

public class PstmtStudy {
	
	DbConnect db = new DbConnect();
	Scanner in = new Scanner(System.in);
	
	public void insert() {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		
		System.out.println("type?");
		String type = in.nextLine();
		System.out.println("상품명?");
		String sang = in.nextLine();
		System.out.println("수량은?");
		int su = Integer.parseInt(in.nextLine());
		System.out.println("단가는?");
		int dan = Integer.parseInt(in.nextLine());
		
		
		String sql = "insert into salse vlaues(seq2.nextval, ?, ?, ?, ?, sysdate)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//바인딩
			
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
