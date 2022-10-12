package com.test;

public class Student {
	private String Name;
	private String Age;
	private String City;
	public Student(String name, String age, String city) {
		Name = name;
		Age = age;
		City = city;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Age=" + Age + ", City=" + City + "]";
	}
	
	
	

}
