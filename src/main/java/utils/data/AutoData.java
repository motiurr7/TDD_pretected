package utils.data;

public class AutoData {
	private String firstName;
	private String lastName;
	private String homeAddress;
	private String emailAddress;
	private String phoneNumber;


	public AutoData(String firstName, String lastName, String homeAddress, String emailAddress, String phoneNumber) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.emailAddress = emailAddress;	
		this.phoneNumber = phoneNumber;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getHomeAddress() {
		return homeAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}
