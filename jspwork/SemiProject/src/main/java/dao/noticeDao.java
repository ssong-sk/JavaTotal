package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dto.noticeDto;
import mysql.DbConnect;

public class noticeDao {
	 
	DbConnect db = new DbConnect();
	
	//insert 저장
	public void insertNotice(noticeDto dto) {
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into noticeboard values(null,?,?,?,0,0,now())";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getN_subject());
			pstmt.setString(2, dto.getN_content());
			pstmt.setString(3, dto.getN_image());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//noticelist 전체 출력
	public List<noticeDto> getAllNotice() {
		List<noticeDto> list = new ArrayList<noticeDto>();
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from noticeboard order by n_num desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				noticeDto dto = new noticeDto();
				
				dto.setN_num(rs.getString("n_num"));
				dto.setN_subject(rs.getString("n_subject"));
				dto.setN_content(rs.getString("n_content"));
				dto.setN_readcount(rs.getInt("n_readcount"));
				dto.setN_chu(rs.getInt("n_chu"));
				dto.setN_writeday(rs.getTimestamp("n_writeday"));
				
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
	
	//전체 페이지수 dto 반환하기
	public int getTotalCount() {
		
		int total = 0;
		
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select count(*) from noticeboard";
		
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
	
	// paging list (한 페이지에서 첫번쨰랑 마지막번호 출력 하고 그 이상은 다음 페이지로 넘김)
		public List<noticeDto> getList(int start, int perPage) {
			List<noticeDto> list = new ArrayList<noticeDto>();

			Connection conn = db.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			String sql = "select * from noticeboard order by n_num desc limit ?,?";

			try {
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, start);
				pstmt.setInt(2, perPage);

				rs = pstmt.executeQuery();

				while (rs.next()) {

					noticeDto dto = new noticeDto();

					dto.setN_num(rs.getString("n_num"));
					dto.setN_subject(rs.getString("n_subject"));
					dto.setN_content(rs.getString("n_content"));
					dto.setN_readcount(rs.getInt("n_readcount"));
					dto.setN_chu(rs.getInt("n_chu"));
					dto.setN_writeday(rs.getTimestamp("n_writeday"));

					list.add(dto);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(rs, pstmt, conn);
			}

			return list;
		}
		
		
		//detail페이지 num값 넘겨주기 -> dto 반환!!
		public noticeDto getDataNotice(String n_num) {
			noticeDto dto = new noticeDto();
			
			Connection conn = db.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "select * from noticeboard where n_num=?";
			
			try {
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, n_num);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					
					dto.setN_num(rs.getString("n_num"));
					dto.setN_subject(rs.getString("n_subject"));
					dto.setN_content(rs.getString("n_content"));
					dto.setN_readcount(rs.getInt("n_readcount"));
					dto.setN_chu(rs.getInt("n_chu"));
					dto.setN_writeday(rs.getTimestamp("n_writeday"));
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				db.dbClose(rs, pstmt, conn);
			}
			
			return dto;
		}
		
		// readcount 해주기 / 조회수 및 추천 
		public void updateReadcount(String n_num) {
			Connection conn = db.getConnection();
			PreparedStatement pstmt = null;

			String sql = "update noticeboard set n_readcount=n_readcount+1 where n_num=?";

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, n_num);
				pstmt.execute();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				db.dbClose(pstmt, conn);
			}
		}
}
