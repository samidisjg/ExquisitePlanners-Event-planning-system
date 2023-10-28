package com.IT22602978Events.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.IT22602978Events.EventClass.EventLogger;

public class DBconnectionT {
	
	private static String url="jdbc:mysql://localhost:3306/eventmanagement";
	private static String user="root";
	private static String pass="Thewa@123";
	private static Connection con;
	
	
	static EventLogger logger=EventLogger.getInstance();
	
	public static Connection getconnection() {
		try {
			//create the connection
			Class.forName("com.mysql.jdbc.Driver");
	         con = DriverManager.getConnection(url, user, pass);
			
		}catch(Exception e) {
			System.out.println("Database connection is not successfull!!");
			try {
				
			} catch (Exception e1) {
				//catch the error exception
				logger.logExceptionWarning("Error Exception (Database Connection):", e1);
				e1.printStackTrace();
			}
		}
		return con;
	}
	

}
