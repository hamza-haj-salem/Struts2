package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbutil.DBUtil;
import pojo.LoginInfo;
// 33333333333333333333
public class LoginDAO {
	
	public static boolean isUserValid(LoginInfo userDetails) {
		
		boolean validStatus = false;
		try {
			Connection conn = DBUtil.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM productManagement WHERE user_name='"+userDetails.getUserName()+"'AND password='"+userDetails.getPassword()+"'");
			while(rs.next()) {
				validStatus = true ;
			}
			System.out.println(validStatus);
			DBUtil.closeConnection(conn);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return validStatus;
	}

}
