package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass03 {
	public static void main(String[] args) {
		int num=1;
		String name="에이콘";
		String addr="강남";
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("orace DB connect");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		try {
			String sql = "UPDATE member"
					+" SET name = ?,addr=?"
					+" WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			
			int count = pstmt.executeUpdate();
			System.out.println("회원 정보를 저장헀습니다");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
