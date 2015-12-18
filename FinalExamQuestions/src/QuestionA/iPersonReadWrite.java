package QuestionA;

import java.util.Date;

public interface iPersonReadWrite extends iPersonRead{

	public Date DOB=null;
	public String FirstName=null;
	public String MiddleName=null;
	public String LastName=null;
	public String address=null;
	public String phone_number=null;
	public String email_address=null;
	
	public static void setFirstName(String firstName) {
		firstName = FirstName;
	}
	public static void setMiddleName(String middleName) {
		middleName = MiddleName;
	}
	public static void setLastName(String lastName) {
		lastName = LastName;
	}
	public static void setDOB(Date DoB) {
		DoB = DOB;
	}
	public static void setAddress(String newAddress) {
		newAddress = address;
	}
	public default void setPhone(String newPhone_number) {
		newPhone_number = phone_number;
	}
	public static void setEmail(String newEmail) {
		newEmail = email_address;
	}
	
}
