package com.example;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	public Student(int id, String fName, String lName, String email) {
		this.id= id;
		this.firstName = fName;
		this.lastName = lName;
		this.emailId = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Student{" + "id='" + id + '\'' + ", first name='" + firstName + '\''+", first name='" + firstName + '\''+", last name='" + lastName + '\''+", email='" + emailId + '\'' + '}';
	}
}