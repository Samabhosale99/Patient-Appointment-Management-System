
package com.pams.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.pams.configuration.DatabaseConnection;
import com.pams.dao.DoctorDao;
import com.pams.model.Doctor;

public class DoctorDaoImplementation implements DoctorDao {
	static Connection con = null;

	
	
	public void addDoctor(Doctor doctor) throws SQLException{
		con = DatabaseConnection.CreateConnection();
		String query = "insert into doctor_record(doctor_name,education_degree, speciality, total_experience, consulting_charge ) VALUES (?, ?, ?, ?,?);";
		PreparedStatement ps = con.prepareStatement(query);
	        ps.setInt(1, doctor.getDoctorId()); //Doctor id is auto increment
		ps.setString(1, doctor.getDoctorName());
				ps.setString(2, doctor.getEducationDegree());
		ps.setString(3, doctor.getSpeciality());
		ps.setInt(4, doctor.getTotalExperience());
		ps.setInt(5, doctor.getConsultingCharges());

		int n = ps.executeUpdate();
		ps.close();	
	return;
	}

	
	
	@Override
	
	 public void deleteDoctor(int doctorId)
    {
        Connection con=null;
        PreparedStatement p=null;
        con = DatabaseConnection.CreateConnection();
        try{
            String sql="delete from doctor_record where doctor_id=?";
             p =con.prepareStatement(sql);
             p.setInt(1,doctorId);
             p.execute();
        }catch(SQLException  e){
            System.out.println(e);
             
        }
        System.out.println("Doctor details deleted succesfully");
    }

		

	@Override
	public void showDoctors() throws SQLException {

		
		Connection con=null;
		PreparedStatement p=null;
		ResultSet rs=null;
		con=DatabaseConnection.CreateConnection();
		String query1 = "select * from doctor_record";
		p = con.prepareStatement(query1);
		rs = p.executeQuery();

		
		while (rs.next()) {
			System.err.println(rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3) + " , "
					+ rs.getInt(4) + " , " + rs.getString(5) + " , " + rs.getString(6));

		}
		
		rs.close();

//       if (check == true) {
//            return doctor;
//        }
//        else
//            return null;
	}
	
	@Override
	public void updateDoctor(Doctor doctor) throws SQLException {
		
		Connection con=null;
		PreparedStatement p=null;
		ResultSet rs=null;
		con=DatabaseConnection.CreateConnection();
		PreparedStatement ps2;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Press 1: Update Doctor Name");
			System.out.println("Press 2: Update Doctor experience");
			System.out.println("Press 3: Update Consulting Charges");
			System.out.println("Press 4: Update Doctor's educational degree");
			System.out.println("Press 5: Update Doctor's Speciality ");
			System.out.println("Press 6 to exit");
			
			int press = sc.nextInt();
			
		switch (press) {
			case 1:
				try {
					System.out.println("Enter doctor id: ");
					int id = sc.nextInt();
					ps2 = con.prepareStatement("update doctor_record set doctor_name=? where doctor_id=?");
					System.out.println("Enter new doctor name: ");
					String name = sc.next();
					
					ps2.setString(1, name);
					ps2.setInt(2, id);
					int s = ps2.executeUpdate();
					if (s > 0) {
						System.out.println("Doctor name Updated");
					} else {
						System.out.println("Not Updated");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 2:
				try {
					System.out.println("Enter the doctor ID");
					int id = sc.nextInt();
					ps2 = con.prepareStatement("update doctor_record set total_experience=? where doctor_id=?");
					System.out.println("Enter new doctor experience: ");
					int experience= sc.nextInt();
					ps2.setInt(1, experience);
					ps2.setInt(2, id);
					int s = ps2.executeUpdate();
					if (s > 0) {
						System.out.println("Experience updated sucessfully");
					} else {
						System.out.println("Not Updated");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println("enter the doctor ID : ");
					int id = sc.nextInt();
					ps2 = con.prepareStatement("update doctor_record set consulting_charge=? where doctor_id=?");
					System.out.println("Enter new consulting charges:");
					int charges= sc.nextInt();
					ps2.setInt(1, charges);
					ps2.setInt(2, id);
					int s = ps2.executeUpdate();
					if (s > 0) {
						System.out.println("Consulting charges updated");
					} else {
						System.out.println("Not Updated");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					System.out.println("enter the doctor ID");
					int id = sc.nextInt();
					ps2 = con.prepareStatement("update doctor_record set education_degree=? where doctor_Id=?");
					System.out.println("Enter new educational degree : ");
					String degree= sc.next();
					ps2.setString(1, degree);
					ps2.setInt(2, id);
					int s = ps2.executeUpdate();
					if (s > 0) {
						System.out.println("Eduactional degree updated");
					} else {
						System.out.println("Not Updated");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					System.out.println("enter the doctor ID");
					int id = sc.nextInt();
					ps2 = con.prepareStatement("update doctor_record set speciality=? where doctor_id=?");
					System.out.println("Enter doctor's updated speciality: ");
					String speciality = sc.next();
					ps2.setString(1, speciality);
					ps2.setInt(2, id);
					int s = ps2.executeUpdate();
					if (s > 0) {
						System.out.println("Doctor's Speciality updated");
					} else {
						System.out.println("Not Updated");
					}
				} catch (Exception e) {					e.printStackTrace();
				}
				
			}

		}
	
		public void exit() throws SQLException { 
	
			System.out.println("*************Thank You*************");
	}
}