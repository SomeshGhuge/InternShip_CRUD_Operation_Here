package com.required_annotation;
//@Required Annotation:--->
//It is used to set the particular property of class 
//called as @Required annotation.This is the method level annotation.
//
//
//Why-------?
//If there are 5 setter method or dependency in class and 
//I want to make only one setter base injection mandatory or setter
//method at time. Simple dependency checking not worked, to overcome
//above problem we should go for @Required annotation.


import org.springframework.beans.factory.annotation.Required;
public class Student {
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String City;
	
	
	public String getFirstName() {
		return firstName;
	}
	
	@Required
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	@Required
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public void getStudentData() {
		System.out.println("FirstName----->"+firstName);
		System.out.println("LastName------>"+lastName);
		System.out.println("MobileNumber-->"+mobileNumber);
		System.out.println("City---------->"+City);
	}

}
