package Bai4;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	public static Connection getConnection() {
		Connection c = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String Url = "jdbc:mySQL://localhost:3306/ontap";
			String userName = "root";
			String password = "";
			c = DriverManager.getConnection(Url, userName, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return c;
	}
	public static void closeConnection (Connection c) {
		try {
			if(c != null) {
				c.close();
				System.out.println("Đã đóng kết nối");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
