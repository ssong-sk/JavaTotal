package quiz.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import oracle.db.DbConnect;

public class QuizDao {
	
	//2-1. 데이터 베이스에 접속,/ 3~명령전송 전담 클래스(메서드) 생성
	DbConnect db = new DbConnect();
	
	public void infoInsert(QuizDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		//3-1. sql 추가하기
		String sql = "insert into quizinfo values(seq_2.nextval,?,?,?,?,sysdate)";
		
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩하기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAge());
			pstmt.setString(3, dto.getHp());
			pstmt.setString(4, dto.getDriver());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	//전체 내역 조회하기
	public Vector<QuizDto> getAllDatas(){
		Vector<QuizDto> listDtos = new Vector<QuizDto>();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql="select * from quizinfo order by no";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				QuizDto dto = new QuizDto();
				
				dto.setNo(rs.getString("no"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getString("age"));
				dto.setHp(rs.getString("hp"));
				dto.setDriver(rs.getString("driver"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				
				listDtos.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return listDtos;
		
	}

}
