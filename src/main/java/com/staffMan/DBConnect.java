package com.staffMan;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	    //Connection between DB
		private static String url = "jdbc:mysql://localhost:3306/online_staff_management";
		private static String userName = "root";
		private static String password = "MYsql@99";
		private static Connection con;
		
		public static Connection getConnection() {
			
			//Exception handling
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				con = DriverManager.getConnection(url, userName, password);
				
			}
			catch(Exception e) {
				System.out.println("Database connection is not success!!!");
			}
			
			//return value
			return con;
		}
}
