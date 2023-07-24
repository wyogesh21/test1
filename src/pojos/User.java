package pojos;
//id | first_name | last_name | email          | password | reg_amt | reg_date   | role

import java.sql.Date;

public class User {
	private int userId;
	private String firstName;
	private String email;
	
	public User() {
		// not used in JDBC , BUT required in hibernate
	}
	public User(int userId, String firstName, String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		
		this.email = email;
		
	}
	
	
	//getters n setters : MUST for hibernate
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", email=" + email + "]";
	}
	
	
	
	
}
