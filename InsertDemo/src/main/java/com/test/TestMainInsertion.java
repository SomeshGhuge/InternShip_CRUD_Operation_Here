package com.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMainInsertion {
	public static void main(String[] args) {
		

//		 to creat table only change update and type create to creat the table in xml file
		
		
		
		// step-1
		System.out.println("line 1");
		Configuration configuration = new Configuration(); // creating configuration object
		System.out.println("line 2");
		configuration.configure("hibernate.cfg.xml"); // this method is used to load cfg file
		// step-2
		System.out.println("line 3");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// step-3
		Session session = sessionFactory.openSession();

		// step-4
		Transaction transaction = session.beginTransaction();

		// insert data into database
		Student student = new Student();

		// how to set the value into object student
		// student.setId(10);
		char q;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your first Name");
		String a= scanner.next();
		System.out.println("Enter Your Last Name");
		String b= scanner.next();
		student.setFirstName(a);
		student.setLastName(b);
		System.out.println("If you wantn to Update more record press 'y' or 'Y'");
		q=scanner.next().charAt(0);
		session.save(student);
		transaction.commit();
        session.close();
		
		}while(q=='y' || q=='Y');

		
		System.out.println("Record saved successfully...");
	}
}
