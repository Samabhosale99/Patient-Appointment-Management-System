package com.pams.configuration;
	

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

 public class DatabaseConnection {
	
	 public static Connection CreateConnection() {
		 Connection con = null;
		 try{
	            Class.forName("com.mysql.jdbc.Driver");
	            String user="root";
	            String pass="Samarth@99";
	            String url = "jdbc:mysql://localhost:3306/pams";

	            con= DriverManager.getConnection(url,user,pass);
	            System.out.println(" ");

	        }
	        catch(Exception ex){
	            ex.printStackTrace();
	        }

	        return con;
	    }
	 
	 }

	