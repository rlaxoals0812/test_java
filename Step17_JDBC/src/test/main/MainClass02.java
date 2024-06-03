package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass02 {
	public static void main(String[] args) {
		//create table member
		int num=1;
		String name = "김구라";
		String addr = "노량진";
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
			String sql = "insert into member"
					+" (num,name,addr)"
					+" values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			
			int count = pstmt.executeUpdate();
			System.out.println("회원 정보를 저장헀습니다");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
