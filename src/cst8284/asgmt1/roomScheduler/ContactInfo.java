package cst8284.asgmt1.roomScheduler;

public class ContactInfo {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String organization;
	
	// Constant
	private static String DefaultOrganization = "Algonquin College";
	
	// constructor
	public ContactInfo(
			String i_firstName,
			String i_lastName,
			String i_phoneNumber,
			String i_organization) 
	{
		setFirstName(i_firstName);
		setLastName(i_lastName);
		setPhoneNumber(i_phoneNumber);
		setOrganization(i_organization);
	}
	
	public ContactInfo(
			String i_firstName,
			String i_lastName,
			String i_phoneNumber) 
	{
		setFirstName(i_firstName);
		setLastName(i_lastName);
		setPhoneNumber(i_phoneNumber);
		setOrganization(DefaultOrganization);
	}
	
	public String toString()
	{
		return "";
	}
	
	// getter
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getOrganization() {
		return organization;
	}
		
	// setter
	public void setFirstName(String i_firstName) {
		this.firstName = i_firstName;
	}
	public void setLastName(String i_lastName) {
		this.lastName = i_lastName;
	}	
	public void setPhoneNumber(String i_phoneNumber) {
		this.phoneNumber = i_phoneNumber;
	}
	public void setOrganization(String i_organization) {
		this.organization = i_organization;
	}	

}
