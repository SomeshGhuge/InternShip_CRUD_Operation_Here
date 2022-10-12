package com.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMainDelete {
	public static void main(String[] args) {
		
		//step:-1-->creating configuration object
		System.out.println("Step 1");
		Configuration configuration = new Configuration();
		
		// step:-2-->This method is used to  load the cfg file
		System.out.println("Step 2");
		configuration.configure("hibernate.cfg.xml");
		
		//Step:-3--->Build session factory
		System.out.println("Step 3");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		
		//Step:-4---> creat session object 
		System.out.println("Step 4");
		Session session = sessionfactory.openSession();
		
		// Step:-5---> Create transaction object
		System.out.println("Step 5");
		Transaction transaction = session.beginTransaction();
		
		//Step:-6---> Insert data in to database
		System.out.println("Step 6");
		Student student = (Student) session.get(Student.class,2);// get ready to creat delete process
		
	    session.delete(student);// here session is deleted
		transaction.commit(); // here process is completed
		
		sessionfactory.close();// here objects is closed
		session.close();
		
		System.out.println("Record deleted successfully");
		
		
		
		
		
		
	}

}
