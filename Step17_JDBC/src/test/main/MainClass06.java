package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		String name = "김구라";
		String addr = "노량진";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = new DBConnector().getConn();
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
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {	}
		}
	}
}
