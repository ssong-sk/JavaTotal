package intro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;



public class IntroDao {
	DbConnect db = new DbConnect();
	public void insertIntro(IntroDto dto) {

	      Connection conn = db.getConnection();
	      PreparedStatement pstmt = null;

	      String sql = "insert into intro (name,age,birthday,hometown,hobby,memo) values(?,?,?,?,?,?)";

	      try {
	         pstmt = conn.prepareStatement(sql);

	         pstmt.setString(1, dto.getName());
	         pstmt.setString(2, dto.getAge());
	         pstmt.setString(3, dto.getBirthday());
	         pstmt.setString(4, dto.getHometown());
	         pstmt.setString(5, dto.getHobby());
	         pstmt.setString(6, dto.getMemo());

	         // 실행
	         pstmt.execute();

	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      } finally {
	         db.dbClose(pstmt, conn);
	      }

	   }

	
	
	//전체조회
	public List<IntroDto> listIntro() {
		List<IntroDto> list = new Vector<IntroDto>();

	      Connection conn = db.getConnection();
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;

	      String sql = "select * from intro order by num";

	      try {
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();

	         while (rs.next()) {
	            IntroDto dto = new IntroDto();

	            dto.setNum(rs.getString("num"));
	            dto.setName(rs.getString("name"));
	            dto.setAge(rs.getString("age"));
	            dto.setBirthday(rs.getString("birthday"));
	            dto.setHometown(rs.getString("hometown"));
	            dto.setHobby(rs.getString("hobby"));
	            dto.setMemo(rs.getString("memo"));

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
	
	//수정 (나이, 생년월일, 거주지역, 취미, 성격)
	
	//삭제 (시퀀스에 해당 하는 db 삭제)
	public void deleteIntro(String num) {
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		
		String sql = "delete from intro where num=?";
		
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
}
