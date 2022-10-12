package com.test;

public class Student {

	private String city;

	public void setCity(String city) {
		this.city = city;
	}

	public void getMessage(String name) {
		System.out.println("Hello,"+name+","+city);
}}
