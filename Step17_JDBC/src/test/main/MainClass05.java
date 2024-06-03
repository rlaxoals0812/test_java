package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass05 {
	public static void main(String[] args) {
		String name = "김구라";
		String addr = "노량진";
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("oracle DB connect");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into member"
					+" (num,name,addr)"
					+" values(member_seq.NEXTVAL,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			
			int count = pstmt.executeUpdate();
			System.out.println("회원 정보를 저장헀습니다");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
