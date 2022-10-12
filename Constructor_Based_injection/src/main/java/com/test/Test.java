package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student student =(Student)ac.getBean("Std");
		System.out.println(student);
		
	}

}
