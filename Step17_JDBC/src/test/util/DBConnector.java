package test.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	public Connection conn;
	
	public DBConnector() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			this.conn=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("orace DB connect");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		return conn;
	}
}
