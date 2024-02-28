package day0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizJdbcFoodOrder {

	static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

	public void foodshop() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		//String sql = "select j.num, f.fno, order_name, food_name, price, f_shop_name, shop_loc, order_addr from foodshop f, jumun j where f.fno = j.fno";

		StringBuffer sql = new StringBuffer(); //
		sql.append("select j.num, f.fno, order_name, food_name, price, f_shop_name, shop_loc, order_addr");
		sql.append("  from foodshop f, jumun j ");
		sql.append(" where f.fno = j.fno");
		
		try {
			conn = DriverManager.getConnection(URL, "teacher", "a1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString()); //버퍼에 있는 문자를 한번에 출력하는 메소드.

			System.out.println("                                 [주문내역]                                    ");
			System.out.println();
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("주문번호\t음식번호\t주문자\t음식명\t가격\t상호명\t가게위치\t        주문자위치");
			System.out.println("------------------------------------------------------------------------------");

			while (rs.next()) {
				int num = rs.getInt("num");
				int fno = rs.getInt("fno");
				String name = rs.getString("order_name");
				String food = rs.getString("food_name");
				int price = rs.getInt("price");
				String fName = rs.getString("f_shop_name");
				String loc = rs.getString("shop_loc");
				String addr = rs.getString("order_addr");

				System.out.println(num + "번\t" + fno + "번\t" + name + "\t" + food + "\t" + price + "원\t" + fName + "\t"
						+ loc + "\t" + addr);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizJdbcFoodOrder food = new QuizJdbcFoodOrder();
		food.foodshop();

	}

}
