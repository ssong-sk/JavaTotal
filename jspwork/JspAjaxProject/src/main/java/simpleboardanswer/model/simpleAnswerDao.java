package simpleboardanswer.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.BindValue;

import mysql.db.DbConnect;

public class simpleAnswerDao {
	
	DbConnect db = new DbConnect();
	
	
	//insert
	public void insertAnswer(simpleAnswerDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql  = "insert into simpleboardanswer values (null,?,?,?,now())";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getNum());
			pstmt.setString(2, dto.getNickname());
			pstmt.setString(3, dto.getContent());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
				
	}
	
	//전체조회
    public List<simpleAnswerDto> getAllData(String num) {
    	List<simpleAnswerDto> list = new ArrayList<simpleAnswerDto>();
    	
    	Connection conn = db.getConnection();
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	
    	String sql = "select * from simpleboardanswer where num =? order by idx desc";
    	
    	try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				simpleAnswerDto dto = new simpleAnswerDto();
				
			    dto.setIdx(rs.getString("idx"));
				dto.setNum(rs.getString("num"));
				dto.setNickname(rs.getString("nickname"));
				dto.setContent(rs.getString("content"));
				dto.setWirteday(rs.getTimestamp("writeday"));
				
				list.add(dto);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
    	
    	return list;
    }
    
    //삭제
    public void deleteAnswer(String idx) {
    	
    	Connection conn = db.getConnection();
    	PreparedStatement pstmt = null;
    	
    	String sql = "delete from simpleboardanswer where idx =?";
    	
    	try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, idx);
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
    }
}
