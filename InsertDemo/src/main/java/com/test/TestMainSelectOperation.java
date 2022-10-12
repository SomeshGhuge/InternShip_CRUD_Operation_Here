package com.test;
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMainSelectOperation {
	public static void main(String[]args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		Session session = sessionfactory.openSession();
		
		
		// pass the class name
		Query query = session.createQuery("From Student");
		List<Student>students=query.list();
		for(Student student:students) {
			System.out.println("Your Id is --->"+student.getId());
			System.out.println("Firstname--->"+student.getFirstName());
		    System.out.println("LastName---->"+student.getLastName());
		}
		session.close();
		sessionfactory.close();
		System.out.println("Record is done");
	}
}
