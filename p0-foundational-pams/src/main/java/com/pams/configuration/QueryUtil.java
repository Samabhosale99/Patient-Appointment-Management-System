package com.pams.configuration;
	

	public class QueryUtil {
		
		
	    public static String selectAllDoctors() {
	        return 	"SELECT * FROM DCOTOR_NAME";
	    }
	    
	    public static String searchSpecificDoctor(int id) {
	    	return "SELECT * FROM doctor_record WHERE DOCTOR_ID ='"+id+"'";
	    }
	    
	    public static final String SELECT_QUERY = "SELECT * FROM DOCTOR_RECORD WHERE DOCTOR_ID = ? ";
	    
	    public static String updateName(int id, String newName) {
	    	
	    	return "UPDATE DOCTOR_RECORD SET DOCTOR_NAME ='"+newName+"' WHERE DOCTOR_ID='"+id+"'";
	    }
	    
	    public static String updateExperience(int id, int newTotalExperience) {
	    	return "UPDATE DOCTOR_RECORD SET TOTAL_EXPERIENCE ='"+newTotalExperience+"' WHERE DOCTOR_ID='"+id+"'";
	    }
	    public static String updateCharges(int id, int newCharges) {
	    	return "UPDATE DOCTOR_RECORD SET CONSULTING_CHARGES ='"+newCharges+"' WHERE DOCTOR_ID='"+id+"'";
	    }
	    public static String updateDegree(int id, String newDegree) {
	    	return "UPDATE DOCTOR_RECORD SET EDUCATION_DEGREE ='"+newDegree+"' WHERE DOCTOR_ID='"+id+"'";
	    }
	    public static String updateSpeciality(int id,String newSpeciality) {
	    	return "UPDATE DOCTOR_RECORD SET SPECIALITY ='"+newSpeciality+"' WHERE DOCTOR_ID='"+id+"'";
	    }

		public static String updateDoctor() {
			return "INSERT INTO doctor_record (name, educationdegree, speciality, totalExperience, consultingCharges) INTO VALUES (?, ?, ?, ?, ?);";
		}
	}
	
