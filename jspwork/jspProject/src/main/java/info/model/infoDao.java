package info.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.xml.transform.Result;

import oracle.db.DbConnect;

public class infoDao {
	
	DbConnect db= new DbConnect();
	
	public void infoInsert(infoDto dto) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql = "insert into info values(seq_2.nextval,?,?,sysdate)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//? 바인딩(순서대로적기)
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			//업데이트
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
		
	}
	
	//전체데이터조회
	public Vector<infoDto> getAllDatas(){
		Vector<infoDto> listDtos = new Vector<infoDto>();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql="select * from info order by num";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			//여러개의 데이터 얻을땐 while
			while(rs.next()) {
				infoDto dto = new infoDto();
				
				
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				dto.setSdate(rs.getTimestamp("sdate"));
				
				listDtos.add(dto);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs,pstmt, conn);
		}
		
		return listDtos;
	}
	
	//삭제
	public void infoDelete(String num) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql = "delete from info where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setString(1, num);
			
			//업데이트
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	//수정버튼 누르면 하나의 데이터 조회
	public infoDto getData(String num) {
		infoDto dto = new infoDto();
		
		Connection conn=db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		
		String sql="select * from info where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs=pstmt.executeQuery();
			
			//수정하려는 1개의 데이터 조회
			if(rs.next()) {
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
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
	public void infoUpdate(infoDto dto) {
	
		Connection conn=db.getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "update info set name=?, addr=? where num=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setString(3, dto.getNum());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
}


