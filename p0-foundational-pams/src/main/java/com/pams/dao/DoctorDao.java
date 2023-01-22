package com.pams.dao;

import java.sql.SQLException;

import com.pams.model.Doctor;

public interface DoctorDao{
	
	public void addDoctor(Doctor doctor) throws SQLException;
	
//	public void updateDoctor(Doctor doctor, int doctorId) throws SQLException;
	
	public void deleteDoctor(int doctorId) throws SQLException;
	
	void showDoctors() throws SQLException;
	
	void updateDoctor(Doctor doctor) throws SQLException;
	
}