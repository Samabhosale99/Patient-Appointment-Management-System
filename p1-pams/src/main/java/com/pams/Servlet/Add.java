package com.pams.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pams.database.DatabaseConnection;
import com.pams.dao.DoctorDao;
import com.pams.model.Doctor;

/**
 * Servlet implementation class AddingDetails
 */
@WebServlet("/addServlet")
public class Add extends HttpServlet {

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           
		String name=request.getParameter("DOCTOR_NAME");
		

		String speciality=request.getParameter("SPECIALITY");
	
		int experience=Integer.parseInt(request.getParameter("TOTAL_EXPERIENCE"));
		String timeSlots = request.getParameter("TIME_SLOTS");
		int charges=Integer.parseInt(request.getParameter("CONSULTING_CHARGE"));
		String degree=request.getParameter("EDUCATION_DEGREE");
		
		Doctor Doctor=new Doctor(name,degree,speciality,experience,timeSlots,charges);
		
		
		System.out.println(Doctor);
		DoctorDao  dao=new DoctorDao(DatabaseConnection.getConnection());
		HttpSession session=request.getSession();
		boolean f= dao.addDetails(Doctor);
		
		if(f) {
			session.setAttribute("succMsg","Doctor details submit sucessfully");
			response.sendRedirect("List.jsp");
		}else {
			session.setAttribute("errorMsg","Something wrong on server");
			response.sendRedirect("List.jsp");

		}
	}
	}


