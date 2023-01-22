package com.pams.util;

import java.util.Scanner;

import com.pams.dao.impl.DoctorDaoImplementation;
import com.pams.model.Doctor;
import java.sql.SQLException;

public class MenuCard {
	
	public static void print() throws SQLException {
		
		
		
		Scanner sc = new Scanner(System.in);
		char dimond = '\u2666';
		char heart = '\u2665';
		char club = '\u2663';
		char spade = '\u2660';
		char degree = '\u00B0';
		System.out.println("");
		for (int i = 0; i < 50; i++) {
			System.out.print(dimond);
		}
		System.out.println("");
		for (int i = 0; i < 19; i++) {
			System.out.print("-");
		}
		System.out.print(" DOCTOR RECORD MANAGEMENT " + degree + " ");
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.println("");
		for (int i = 0; i < 50; i++) {
			System.out.print(dimond);
		}
		System.out.println("");
		System.out.println("                  Welcome Admin!");
		System.out.println("");
		System.out.println("      Please Choose from below options-");
		System.out.println("");
		System.out.println("\t1. Add Doctor Details");
		System.out.println("\t2. Show Doctor Details");
		System.out.println("\t3. Delete Doctor ");
		System.out.println("\t4. Update Doctor details");
		System.out.println("\t5. Exit Application\n");
		System.out.println("");
		for (int i = 0; i < 50; i++) {
			System.out.print(dimond);
		}
		System.out.println("");
		
		
		
	
		
		int a = sc.nextInt();
		sc.nextLine();

		DoctorDaoImplementation b1 = new DoctorDaoImplementation();
		Doctor D1 = new Doctor();
		switch (a) {
		case 1:
			D1 = new Doctor();
			
//			System.out.println("Enter the Doctor ID");
//			D1.setDoctorId(sc.nextInt());
//			Doctor id is set as auto increment so no need to take
			
			System.out.println("Enter the doctor name: ");
			D1.setDoctorName(sc.nextLine());

			System.out.println("Enter doctor's total experience: ");
			D1.setTotalExperience(sc.nextInt());

			System.out.println("Enter counsulting charges: ");
			D1.setConsultingCharges(sc.nextInt());
			
			System.out.println("Enter educational degree: ");
			D1.setEducationDegree(sc.next());
			
			System.out.println("Enter the doctor's specility: ");
			D1.setSpeciality(sc.next());
			
			b1.addDoctor(D1);
			System.out.println("Doctor details added sucessfully");
			MenuCard.print();
			break;

		case 2:
				
			b1.showDoctors();
			MenuCard.print();
			break;
		case 3:
			System.out.println("Enter the id of doctor that you want to delete: ");
			int id = sc.nextInt();
			b1.deleteDoctor(id);
			MenuCard.print();
			break;
		case 4:
			System.out.println("Enter doctorId that you want to update details: ");
			int id1 = sc.nextInt();
			b1.updateDoctor(D1);
			MenuCard.print();

			break;
		case 5:
			b1.exit();
			break;
			
		default:
			System.out.println("Please select a valid option");
			MenuCard.print();
			break;
		}
		sc.close();
	}
	
	
}
