package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 *  JDBC ( Java DataBase Connectivity )
 *  
 *  DataBase 에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 *  
 *  Oracle 에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc11.jar 파일을
 *  사용할수 있도록 설정해야 한다.
 *  
 *  프로젝트에 마우스 우클릭 => Build Path => Configure Build Path => Librarys 텝 선택
 *  => classpath 선택 => 우측 Add External jar 버튼을 누른후 => ojdbc11.jar 파일을 찾은다음 => Apply 
 */
public class MainClass01 {
	public static void main(String[] args) {
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
		ResultSet rs = null;
		try {
			String sql = "SELECT empno,ename,job,sal"
					+" FROM emp"
					+" order by empno ASC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble	("sal");
				System.out.println(empno+" | "+ename+" | "+job+" | "+sal);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
