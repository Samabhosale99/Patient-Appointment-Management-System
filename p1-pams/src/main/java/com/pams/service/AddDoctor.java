package com.pams.service;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pams.dao.DoctorDao;
import com.pams.model.Doctor;
import com.pams.database.DatabaseConnection;

/**
 * Servlet implementation class AddDoctor
 */

@WebServlet("/InsertData")
public class AddDoctor extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
		
		String doctorName =request.getParameter("name");
		String educationDegree =request.getParameter("degree");
		String Speciality =request.getParameter("speciality");
		int totalExperience =request.getContentLength();
		String consultingTimeSlots =request.getParameter("timeSlots");
		int consultingCharges =request.getContentLength();
		
		Doctor doctor= new Doctor(doctorName,educationDegree,Speciality,totalExperience,consultingTimeSlots,consultingCharges);
		
		System.out.println(doctor);
		DoctorDao  ado=new DoctorDao(DatabaseConnection.getConnection());
		HttpSession session=request.getSession();
		boolean f= ado.addDetails(doctor);
		
		if(f) {
			session.setAttribute("succMsg","Doctors details submit sucessfully");
			response.sendRedirect("show.jsp");
		}else {
			session.setAttribute("errorMsg","Something wrong on server");
			response.sendRedirect("add.jsp");

		}
	}

}
