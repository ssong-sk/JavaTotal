package day0125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest { // 드라이브 연결하기
	// 드라이버 연결 방법 _ Jre System Library 오른쪽 마우스 build path -> configure build path
	// 누르기 -> module path 선택 -> add external jaras 누르기 -> 드라이버 설치파일 선택 -> 드라이버 연결
	// 완료,

	// 1. URL입력하는 상수 입력
	static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

	// 2. 메서드 입력 ( 연결 / 정보 / 가져올 데이터에 대해 변수설정)
	public void connectSawon() {
		Connection conn = null; // 연결 / 메서드 안에서는 초깃값 형성 안되기 때문에 null로 초깃값 설정
		Statement stmt = null; // 정보
		ResultSet rs = null; // 레코드를 자바로 가지올 때 사용

		String sql = "select * from sawon order by num";

		try {
			// 3. 각 연결/정보/객체 가져오는 코딩작성 (try -catch해주기)
			// 연결하기
			conn = DriverManager.getConnection(URL, "teacher", "a1234");
			// 정보불러오기
			stmt = conn.createStatement();
			// 테이블 객체를 그대로 가져오기(sql문 전달)
			rs = stmt.executeQuery(sql);

			// 4. 여러줄을 가져올 때는 while문으로 가져온다.
			// rs.next() : 다음 데이터로 이동하면서 true 반환, 더이상 데이터 없으면 false 반환
			while (rs.next()) {
				// DB로 부터 데이터 가져오기
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String buseo = rs.getString("buseo");
				int pay = rs.getInt("pay");
				// 가져올 사원의 명칭을 가져오기..

				// 5.출력
				System.out.println(num + "\t" + name + "\t" + gender + "\t" + buseo + "\t" + pay);

			}

			System.out.println("오라클 드라이버 연결 성공!!!!");

			// 6. finally 및 close 작성
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("오라클 드라이버 연결 실패!!!!");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	////////////////////////////////////////////////////////////////////////////////////////
	// 싱글톤이기 때문에 객체는 메서드 마다 하나하나 연결해서 사용해줘야함.
	public void connectShop() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select idx,c.num,sangpum,color,cnt,guipday from shop s,cart2 c where s.num=c.num";

		try {
			conn = DriverManager.getConnection(URL, "teacher", "a1234");
			System.out.println("오라클 성공!!!");

			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("****회원님 장바구니 리스트****");

			System.out.println("주문번호\t상품번호\t상품명\t색상\t구입갯수\t구입날짜");
			System.out.println("------------------------------------------------------------");

			while (rs.next()) {
				int idx = rs.getInt("idx");
				int num = rs.getInt("num");
				String sang = rs.getString("sangpum");
				String color = rs.getString("color");
				int cnt = rs.getInt("cnt");
				String guipday = rs.getString("guipday");

				System.out.println(idx + "\t" + num + "\t" + sang + "\t" + color + "\t" + cnt + "\t" + guipday + "\t");
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

//////////////////////////////////////////////////////////////////////////////////
	public void sawonRead() {
		// 부서별 인원수 평균급여
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select buseo, count(*) cnt, round(avg(pay),0) pay from sawon group by buseo";

		try {
			conn = DriverManager.getConnection(URL, "teacher", "a1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("  [부서별 평균 인원 및 급여구하기]  ");
			System.out.println();
			System.out.println("부서명\t인원수\t평균급여");
			System.out.println("=================================");

			while (rs.next()) {
				String buseo = rs.getString("buseo");
				int cnt = rs.getInt("cnt");
				int pay = rs.getInt("pay");

				System.out.println(buseo + "\t" + cnt + "명\t" + pay + "원");

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

	public void foodshop() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select f.fno, order_name, food_name, price, f_shop_name, shop_loc, order_addr from foodshop f, jumun j where f.fno = j.fno";

		try {
			conn = DriverManager.getConnection(URL, "teacher", "a1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("**********주문내역************");
			System.out.println();
			System.out.println("------------------------------------------------------------------");
			System.out.println("주문번호\t음식번호\t주문자\t음식명\t가격\t상호명\t가게위치\t주문자위치");

			while (rs.next()) {
				int fno = rs.getInt("fno");

				String name = rs.getString("order_name");
				String food = rs.getString("food_name");
				int price = rs.getInt("price");
				String fName = rs.getString("f_shop_name");
				String loc = rs.getString("shop_loc");
				String addr = rs.getString("order_addr");

				System.out.println(
						fno + "\t" + name + "\t" + food + "\t" + price + "원\t" + fName + "\t" + loc + "\t" + addr);

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
		ConnectTest ct = new ConnectTest();
		// ct.connectSawon();

		// ct.connectShop();

		// ct.sawonRead();
		ct.foodshop();

	}

}
