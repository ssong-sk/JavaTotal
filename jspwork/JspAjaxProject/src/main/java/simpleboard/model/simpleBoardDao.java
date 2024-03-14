package simpleboard.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.exceptions.RSAException;

import mysql.db.DbConnect;

public class simpleBoardDao {
	
	DbConnect db = new DbConnect();
	
	//insert
	public void insertSimpleBoard (simpleBoardDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into simpleboard values(null,?,?,?,?,0,now())";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//db에 입력한 값 순서대로 바인딩
			pstmt.setString(1, dto.getWriter());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getPass());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	//전체목록
	public List<simpleBoardDto> getAllDatas() {
		List<simpleBoardDto> list = new ArrayList<simpleBoardDto>();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from simpleboard order by num desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				simpleBoardDto dto = new simpleBoardDto();
				
				dto.setNum(rs.getString("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setPass(rs.getString("pass"));
				dto.setReadcount(rs.getInt("readcount"));
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
	
	//내용보기
	public simpleBoardDto getContent(String num) {
		simpleBoardDto dto = new simpleBoardDto();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from simpleboard where num =?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				dto.setNum(rs.getString("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setPass(rs.getString("pass"));
				dto.setReadcount(rs.getInt("readcount"));
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
	
	//readcount 조회수 증가
	public void updateReadCount(String num) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "update simpleboard set readcount = readcount+1 where num=?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//가장 최근에 추가된 글의 num값 알기
	public int getMaxNum() {
		int max = 0;
		
		Connection conn =db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql ="select max(num) max from simpleboard";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				max=rs.getInt("max"); //rs.getInt(1)과 동일
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return max;
	}
	
	//페이징 1.전체갯수반환 2. 부분조회 (startnum 부터 perpage갯수 만큼 반환)
	//1.전체갯수 반환
	
	public int getTotalCount() { //list에 넘겨줘야함.
		int total = 0;
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select count(*) from simpleboard";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}		
		
		return total;		
	}
	
	//2. 부분조회 (startnum 부터 perpage갯수 만큼 반환)
	public List<simpleBoardDto> getPagingList(int startNum, int perPage) {
		List<simpleBoardDto> list = new ArrayList<simpleBoardDto>();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from simpleboard order by num desc limit ?,?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, startNum);
			pstmt.setInt(2, perPage);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				simpleBoardDto dto = new simpleBoardDto();
				
				dto.setNum(rs.getString("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setPass(rs.getString("pass"));
				dto.setReadcount(rs.getInt("readcount"));
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

}
