package com.pams.app;
import com.pams.dao.DoctorDao;



import com.pams.dao.impl.*;
import com.pams.dao.impl.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;


public class Application {
	
	public static void main(String[] args) {
				
		usingResourceBundle();

	}


	private static void usingResourceBundle() {
		
		ResourceBundle resourceBundle=ResourceBundle.getBundle("config");
		String dburl=resourceBundle.getString("dburl");
		String driver=resourceBundle.getString("driver");
		String username=resourceBundle.getString("username");
		String password=resourceBundle.getString("password");
		System.out.println("dburl "+ dburl);
		System.out.println("driver "+ driver);
		System.out.println("username "+ username);
		System.out.println("password "+ password);
	
	}
}
	
