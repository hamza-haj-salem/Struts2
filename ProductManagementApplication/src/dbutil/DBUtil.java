package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//11111111111111111
public class DBUtil {
	
	// db connection 
	// all onn at one place
	
	//
	public static Connection getConnection() throws SQLException {
		
		Connection conn = null ;
		
		try {
			//load the db driver
			Class.forName("com.mysql.jdbc.Driver");
			//create the actual connection obj
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/productManagement2","root","");	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return conn ;
	}
	
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
