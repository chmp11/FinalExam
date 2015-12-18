package QuestionA;

import java.util.Date;

public interface iPersonRead {
	public Date DOB=null;
	public String FirstName=null;
	public String MiddleName=null;
	public String LastName=null;
	public String address=null;
	public String phone_number=null;
	public String email_address=null;
	
	public static String getFirstName() {
		return FirstName;
	}

	public static String getMiddleName() {
		return MiddleName;
	}
	public static String getLastName() {
		return LastName;
	}
	public static Date getDOB() {
		return DOB;
	}
	public static String getAddress() {
		return address;
	}
	public static String getPhone() {
		return phone_number;
	}
	public static String getEmail() {
		return email_address;
	}
}
