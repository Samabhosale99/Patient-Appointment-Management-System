/**
 * 
 */
package com.pams.model;

public class Doctor {
	
	private int doctorId;
	private String doctorName;
	private String educationDegree;
	private String Speciality;                   
	private int totalExperience;
	private String consultingTimeSlots;
	private int consultingCharges;
	
	public int getDoctorId() {
		return doctorId;
	}
//	public void setDoctorId(int doctorId) {
//		this.doctorId = doctorId;
//	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getEducationDegree() {
		return educationDegree;
	}
	public void setEducationDegree(String educationDegree) {
		this.educationDegree = educationDegree;
	}
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String Speciality) {
		this.Speciality = Speciality;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public String getConsultingTimeSlots() {
		return consultingTimeSlots;
	}
	public void setConsultingTimeSlots(String consultingTimeSlots) {
		this.consultingTimeSlots = consultingTimeSlots;
	}
	public int getConsultingCharges() {
		return consultingCharges;
	}
	public void setConsultingCharges(int consultingCharges) {
		this.consultingCharges = consultingCharges;
	}
	public Doctor(int doctorId, String doctorName, String educationDegree, String Speciality, int totalExperience,
		String consultingTimeSlots, int consultingCharges) {
		super();
//		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.educationDegree = educationDegree;
		this.Speciality = Speciality;
		this.totalExperience = totalExperience;
		this.consultingTimeSlots = consultingTimeSlots;
		this.consultingCharges = consultingCharges;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctorName, String educationDegree, String Speciality, int totalExperience, String consultingTimeSlots, int consultingCharges) {
		
		super();
		this.doctorName = doctorName;
		this.educationDegree = educationDegree;
		this.Speciality = Speciality;
		this.totalExperience = totalExperience;
		this.consultingTimeSlots = consultingTimeSlots;
		this.consultingCharges = consultingCharges;
	}
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", educationDegree=" + educationDegree
				+ ", Speciality=" + Speciality + ", totalExperience=" + totalExperience + ", consultingTimeSlots=" + consultingTimeSlots + "consultingCharges=" + consultingCharges + "]";
	}
	
}