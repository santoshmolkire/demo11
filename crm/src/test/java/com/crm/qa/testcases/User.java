package com.crm.qa.testcases;

public class User {

	private String firstname;
	private String lastname;
	private String adress1;
	private String city;
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
	public String getAdress1() {
		return adress1;
	}
	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public User(String firstname, String lastname, String adress1, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress1 = adress1;
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", adress1=" + adress1 + ", city=" + city
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}
