package Model;

import java.util.Random;

public class Customer 
{
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String mobileNumber;
	private String DOB;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Customer(int id, String firstname, String lastname, String email, String mobileNumber, String dOB, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.mobileNumber = mobileNumber;
		DOB = dOB;
		this.password = password;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", DOB=" + DOB + ", password=" + password + "]";
	}
	
}
