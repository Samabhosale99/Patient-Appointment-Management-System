//package com.pams.service.impl;
//
//
////import com.mysql.cj.xdevapi.Statement;
//import com.pams.app.menu.MenuDrivenApplication;
//
//
//import com.pams.configuration.DatabaseConnection;
//import com.pams.configuration.QueryUtil;
//import com.pams.constant.Constant;
//import com.pams.model.Doctor;
//import com.pams.util.MenuCard;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//import java.sql.Statement;
//
//
//
//
//public class DoctorServices {
//	
//	DatabaseConnection databaseConnection =new DatabaseConnection();
//	Doctor doctor = new Doctor();
//	
//	public void insertdoctor() throws SQLException {
//		
//		
//		Scanner scan = new Scanner(System.in);
//		
//		
////		System.out.println(Constant.doctorId);
////		int doctorId = scan.nextInt();
////		doctor.setDoctorId(doctorId
//		
//		
//		System.out.println(Constant.doctorName);
//		String name = scan.next();
//		doctor.setDoctorName(name);
//		
//		System.out.println(Constant.educationDegree);
//		String educationDegree = scan.next();
//		doctor.setEducationDegree(educationDegree);
//		
//		System.out.println(Constant.speciality);
//		String speciality = scan.next();
//		doctor.setSpeciality(speciality);
//		
//		
//		System.out.println(Constant.totalExperience);
//		int totalExperience = scan.nextInt();
//		doctor.setTotalExperience(totalExperience);
//		
//		System.out.println(Constant.consultingCharges);
//		int consultingCharges =scan.nextInt();
//		doctor.setConsultingCharges(consultingCharges);
//		
//		
//		try(Connection connection = DatabaseConnection.getConnection(); )
//		{
//			
//			PreparedStatement preparedStatement =connection.prepareStatement(QueryUtil.updateDoctor());
//			
//			
//			
////			preparedStatement.setInt(1, doctorId);
//			preparedStatement.setString(1, name);
//			preparedStatement.setString(2, educationDegree);
//			preparedStatement.setString(3, speciality);
//			preparedStatement.setInt(4, totalExperience);
//			preparedStatement.setInt(5, consultingCharges);
//			
//			int rows = preparedStatement.executeUpdate();
//			
//			if(rows>0) {
//				System.out.println("doctor added successfully");
//			}
//			else {
//				System.out.println("Failed");
//			}
//			preparedStatement.close();
//			connection.close();
//			
//			
//		}
//				
//}
//	
//	public void getAlldoctor() throws SQLException {
//		
//		try(Connection connection = DatabaseConnection.getConnection()
//				Statement statement = connection.createStatement();
//				ResultSet resultSet = statement.executeQuery(QueryUtil.selectAllDoctors());
//				)
//		{
//			
//			while(resultSet.next()) {
//				
//				printdoctor(resultSet);
//			}
//		}
//	}//end
//	
//	private void printdoctor(ResultSet set) {
//		try {
////			System.out.println("doctor Id :"+set.getInt(1));
//			System.out.println("doctor Name :"+set.getString(1));
//			System.out.println("doctor Email :"+set.getString(2));
//			System.out.println("doctor Contact Number:"+set.getString(3));
//			System.out.println("doctor Address :"+set.getString(4));
//			System.out.println("doctor Date Of Birth :"+set.getString(5));
//			System.out.println("doctor Age:"+set.getString(6));
//			System.out.println("doctor  Id proof :"+set.getString(8));
//			System.out.println("doctor  Preffered LogiId :"+set.getString(9));
//			
//			System.out.println("------------------------------------------");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public boolean getDoctorById(int id) throws SQLException {
//		boolean isBoolean = false;
//		try(Connection connection = DatabaseConnection.DatabaseConnection());
//				Statement statement = connection.createStatement();
//				ResultSet resultSet = statement.executeQuery(QueryUtil.searchSpecificDoctor(id)))
//		{
//		if(resultSet.next()) {
//			isBoolean=true;
//			
//			printdoctor(resultSet);
//		}	else {
//			System.out.println("Record no found");
//		}
//		}
//		return isBoolean;
//		
//	}
//	public void updatedoctor(int id) throws SQLException {
//		Scanner input=new Scanner(System.in);
//		int doctorId = id;
//		try(Connection connection = DatabaseConnection.getConnection());
//		{
//			
//			System.out.println("Press 1: Update Doctor Name: ");
//			System.out.println("Press 2: Update Education degree: ");
//			System.out.println("Press 3: Update Speciality: ");
//			System.out.println("Press 4: Update Doctor's total experience: ");
//			System.out.println("Press 5: Update Consulting Charges: ");
//			System.out.println("Press 6 to exit");
//			
//			int choice = input.nextInt();
//			switch(choice) {
//			case 1:
//				System.out.println("Enter doctor id which you want to update");
//				doctorId = input.nextInt();
//				System.out.println("Enter new doctor name");
//				String newName = input.next();
//				PreparedStatement preparedStatement =connection.prepareStatement(QueryUtil.updateName(doctorId,newName));
//				int rows =preparedStatement.executeUpdate();
//				if(rows>0) {
//					System.out.println("Name updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					//updateDoctor();
//					}
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 2:
//				
//				System.out.println("Enter new Education degree: ");
//				String educationDegree = input.next();
//				PreparedStatement preparedStatement2 =connection.prepareStatement(QueryUtil.updateDegree(doctorId,educationDegree));
//				int rows2 =preparedStatement2.executeUpdate();
//				if(rows2>0) {
//					System.out.println("Doctor's education degree updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					//updateDoctor(educationDegree);
//					}
//					
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 3:
//				System.out.println("Enter new Speciality");
//				String speciality = input.next();
//				PreparedStatement preparedStatement3 =connection.prepareStatement(QueryUtil.updateSpeciality(doctorId,speciality));
//				int rows3 =preparedStatement3.executeUpdate();
//				if(rows3>0) {
//					System.out.println("Contact updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					//updateDoctor(speciality);
//					}					
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 4:
//				System.out.println("Enter updated doctor's total experience");
//				int totalExperience = input.nextInt();
//				PreparedStatement preparedStatement4 =connection.prepareStatement(QueryUtil.updateExperience(doctorId,totalExperience));
//				int rows4=preparedStatement4.executeUpdate();
//				if(rows4>0) {
//					System.out.println("Contact updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					//updatedoctor(newName);
//					}
//					
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 5:
//				System.out.println("Enter new doctor charges: ");
//				int charges = input.nextInt();
//				PreparedStatement preparedStatement5 =connection.prepareStatement(QueryUtil.updateCharges(doctorId,charges));
//				int rows5=preparedStatement5.executeUpdate();
//				if(rows5>0) {
//					System.out.println("Date of birth  updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					//updatedoctor(newName);
//					}
//					
//				}
//				else {
//					System.out.println("Failed");
//				}
////			case 6:
////				System.out.println("Enter new age");
////				String age = input.next();
////				PreparedStatement preparedStatement6 =connection.prepareStatement(QueryUtil.updateCo(newName,age));
////				int rows6=preparedStatement6.executeUpdate();
////				if(rows6>0) {
////					System.out.println("Age updated successfully");
////					System.out.println("Press 1 to go back");
////					
////					int n1=input.nextInt();
////					if(n1==1) {
////					//updatedoctor(newName);
////					}
////					
////				}
////				else {
////					System.out.println("Failed");
////				}
//			case 6:
//				MenuCard.print();
//				break;
//			default :
//				System.out.println("Wrong option selected");
//				//updatedoctor(newName);			
//			
//			}		
//		} 
//	}
//}
//
