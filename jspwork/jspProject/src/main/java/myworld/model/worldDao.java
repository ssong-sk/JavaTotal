package myworld.model;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;

public class worldDao {

	DbConnect db = new DbConnect();
	
	public void insertWorld(worldDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql = "insert into myworld values(null,?,?,?,now())";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getAvata());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
	}
	
	public List<worldDto> getAllmyWorld() {
		List<worldDto> list = new Vector<worldDto>();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql = "select * from myworld order by num desc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			
			
			while(rs.next()) {
				worldDto dto = new worldDto();
				
				dto.setNum(rs.getString("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setAvata(rs.getString("avata"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				
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
	public void deleteWorld(String num) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql = "delete from myworld where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//num에 해당하는 dto 반환
	public worldDto getData(String num) {
		worldDto dto = new worldDto();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from myworld where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs=pstmt.executeQuery();
			
			
			while(rs.next()) {
				
				dto.setNum(rs.getString("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setContent(rs.getString("content"));
				dto.setAvata(rs.getString("avata"));
				dto.setWriteday(rs.getTimestamp("writeday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
				
		return dto;
	}
	
	//수정
	
	public void worldUpdata(worldDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "update myworld set writer=?, content=?, avata=? where num=? ";
	    
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getContent());
			pstmt.setString(3, dto.getAvata());
			pstmt.setString(4, dto.getNum());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
}
