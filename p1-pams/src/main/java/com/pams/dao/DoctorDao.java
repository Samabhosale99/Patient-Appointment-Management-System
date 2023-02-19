package com.pams.dao;

//import java.sql.Connection;

//import java.sql.SQLException;
//
//
//import com.pams.model.Doctor;
//
//public interface DoctorDao{
//	
//	public boolean addDoctor(Doctor doctor) throws SQLException;
//	
//	public void deleteDoctor(int doctorId) throws SQLException;
//	
//	void showDoctors() throws SQLException;
//	
//	void updateDoctor(Doctor doctor) throws SQLException;
//	
//}

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pams.model.Doctor;

public class DoctorDao extends Doctor{
	private Connection conn;
	public DoctorDao(Connection conn){
		super();
		this.conn = conn;
	}
	
	public DoctorDao() {
		// TODO Auto-generated constructor stub
	}

	public boolean addDetails(Doctor doctor) {
		boolean f= false;
		try {
			String sql="INSERT into DOCTOR_RECORD( DOCTOR_NAME, EDUCATION_DEGREE, SPECIALITY, TOTAL_EXPERIENCE, TIME_SLOTS, CONSULTING_CHARGE) values(?,?,?,?,?,?)";
			PreparedStatement ps= conn.prepareStatement(sql);
			
			ps.setString(1, doctor.getDoctorName());
			ps.setString(2, doctor.getEducationDegree());
			ps.setString(3, doctor.getSpeciality());
        	ps.setInt(4, doctor.getTotalExperience());
        	ps.setString(5, doctor.getConsultingTimeSlots());
			ps.setInt(6, doctor.getConsultingCharges() );

			int i=ps.executeUpdate();
			System.out.println("Print");
			if(i==1) {
				f=true;
			}
		}catch( Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	
	
	public List<Doctor> getAllDoctor() 
	{
		List<Doctor> list=new ArrayList<Doctor>();
		Doctor doctor=null;
		try {
			String sql="SELECT * DOCTOR_RECORD";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) 
			{
				doctor=new Doctor();
				doctor.setDoctorName(rs.getString(1));
				doctor.setEducationDegree(rs.getString(2));
				doctor.setSpeciality(rs.getString(3));
				doctor.setTotalExperience(rs.getInt(4));
				doctor.setConsultingTimeSlots(rs.getString(5));
				doctor.setConsultingCharges(rs.getInt(6));
				
				list.add(doctor);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	

	public Doctor getDoctorById(int id) {
		Doctor doctor=null;
		try {
			String sql="select * from DOCTOR_RECORD where DOCTOR_ID=?";
			PreparedStatement ps= conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				doctor=new Doctor();
				doctor.setDoctorName(rs.getString(1));
				doctor.setEducationDegree(rs.getString(2));
				doctor.setSpeciality(rs.getString(3));
				doctor.setTotalExperience(rs.getInt(4));
				doctor.setConsultingTimeSlots(rs.getString(5));
				
				
				
                 
			}
			System.out.println(doctor.getDoctorId());
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return doctor;
	}
	
	
	
	
	
	
	
	public boolean updateUser(Doctor doctor) throws SQLException {
        boolean rowUpdated = false;
        try {
			String sql="UPDATE DOCTOR_RECORD SET DOCTOR_NAME = ?,EDUCATION_DEGREE= ?, SPECIALITY =?, TOTAL_EXPERIENCE =?, TIME_SLOTS =?, CONSULTING_CHARGE WHERE DOCTOR_ID = ?;";
			PreparedStatement ps= conn.prepareStatement(sql);
			
			ps.setString(1, doctor.getDoctorName());
			ps.setString(2, doctor.getEducationDegree());
        	ps.setString(3, doctor.getSpeciality());
			ps.setInt(4, doctor.getTotalExperience() );
			ps.setString(5, doctor.getConsultingTimeSlots());
			ps.setInt(6, doctor.getConsultingCharges());
			
			int i=ps.executeUpdate();
			if(i==1) {
				rowUpdated=true;
			}
		}catch( Exception e) {
			e.printStackTrace();
		}
        return rowUpdated;
    }
}
