/*
 * package com.pams.database;


 * 
 * import java.sql.*; import java.util.ResourceBundle;
 * 
 * public class DatabaseConnection { private static Connection connection =null;
 * 
 * public static Connection getConnection(){ if(connection == null) {
 * ResourceBundle resourceBundle = ResourceBundle.getBundle("config"); String
 * dburl = resourceBundle.getString("dburl"); String username =
 * resourceBundle.getString("username"); String password =
 * resourceBundle.getString("password"); try {
 * Class.forName(resourceBundle.getString("driver")); connection =
 * DriverManager.getConnection(dburl,username,password); }
 * catch(ClassNotFoundException | SQLException e) {
 * System.out.println(e.getMessage());
 * 
 * } }
 * 
 * return connection; } }
 * 
 */



package com.pams.database;
	
import java.sql.Connection;

import java.sql.SQLException;
import java.util.ResourceBundle;

import java.sql.DriverManager;


 public class DatabaseConnection {
	 
	 
	 private static Connection connection = null;
		public static Connection getConnection() {
			if (connection == null) {

				String dburl="jdbc:mysql://localhost:3306/PAMS";
				String driver="com.mysql.jdbc.Driver";

				try {
					Class.forName(driver);
					connection = DriverManager.getConnection(dburl, "root", "Samarth@99");
					System.out.println("connected");
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
					
				}
			}
			return connection;
		}
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
//	 public static Connection getConnection() {
//
//		 Connection connection = null;
//		 try{
//	            Class.forName("com.mysql.jdbc.Driver");
//	            String user="root";
//	            String pass="Samarth@99";
//	            String url = "jdbc:mysql://localhost:3306/PAMS";
//
//	            connection= DriverManager.getConnection(url,user,pass);
//	            System.out.println("Connected ");
//
//	        }
//	        catch(Exception ex){
//	            ex.printStackTrace();
//	        }
//
//	        return connection;
//	    }
	 
//	 }
