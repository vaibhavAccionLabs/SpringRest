package com.springrest.springrest.entities;

public class User {
	private String email;
    private String gender;
	public User(String email, String gender) {
		super();
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", gender=" + gender + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
