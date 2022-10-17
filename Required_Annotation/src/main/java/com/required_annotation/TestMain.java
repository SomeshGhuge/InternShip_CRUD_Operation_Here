package com.required_annotation;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");
		Student student = (Student) applicationContext.getBean("s");
		student.getStudentData();
}}
