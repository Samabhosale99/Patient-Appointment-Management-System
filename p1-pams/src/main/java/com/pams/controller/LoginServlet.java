package com.pams.controller;

import java.io.IOException;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pams.database.DatabaseConnection;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = DatabaseConnection.getConnection();

	
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html;charset=UTF-8");
			

			String username=request.getParameter("username");
			String password =request.getParameter("pass");
			boolean flag=true;
		
			try {
				Statement stm=connection.createStatement();
				ResultSet rs = stm.executeQuery("SELECT USER_NAME, PASSWARD FROM AUTHENTICATION;");
				while(rs.next()) {
					if(username.equals(rs.getString(1))&& password.equals(rs.getString(2))) {
						flag=false;
						RequestDispatcher rd=request.getRequestDispatcher("inner-page.jsp");
		                rd.forward(request, response);
						
					}
					
				}
	                
	                if(flag==true) {
	                	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		                rd.forward(request, response);
	                	
	                }
	             
	           
			} catch (SQLException e)
			{
				e.printStackTrace();
				}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}


