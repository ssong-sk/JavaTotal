package day0131;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import oracledb.DbConnect;

public class ShopDbModel {

	DbConnect db = new DbConnect();

	// 추가
	public void insertShop(ShopDto dto) {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		String sql = "insert into s_shop values(seq2.nextval, ?, ?, ?, ?, sysdate)";

		try {
			pstmt = conn.prepareStatement(sql);

			// 바인딩 처리
			pstmt.setString(1, dto.getSangpum()); // ShopDto에서 가져옴
			pstmt.setString(2, dto.getPhoto());
			pstmt.setInt(3, dto.getSu());
			pstmt.setInt(4, dto.getDan());

			// 업데이트
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}

	}

	// 전체조회
	public Vector<ShopDto> getAllSangpums() {
		
		Vector<ShopDto> list = new Vector<ShopDto>();
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from s_shop order by sangpum";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//db에서 하나의 레코드를 읽어서 dto에 넣는다
				ShopDto dto = new ShopDto();
				
				dto.setNum(rs.getString("num"));
				dto.setSangpum(rs.getString("sangpum"));
				dto.setPhoto(rs.getString("photo"));
				dto.setSu(rs.getInt("su"));
				dto.setDan(rs.getInt("dan"));
				dto.setGuipday(rs.getDate("guipday"));
				
				//list dto추가
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

	// 삭제
	

	// 수정

}
