package com.cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;
public class TestInsert {
	public static void main(String[] args) {
	
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
		cache cache = new cache();

		// how to set the value into object student
		// student.setId(10);
		char q;
		do {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String a= scanner.next();
		System.out.println("Enter Your Last Name");
		String b= scanner.next();
		System.out.println("Enter Your City");
		String c=scanner.next();
		System.out.println("Enter your Mobile number");
		String d= scanner.next();
		cache.setFirstName(a);
		cache.setLastName(b);
		cache.setCity(c);
		cache.setMobile_No(d);
		System.out.println("If you wantn to Update more record press 'y' or 'Y'");
		q=scanner.next().charAt(0);
		session.save(cache);
		transaction.commit();
        session.close();
		
		}while(q=='y' || q=='Y');

		
		System.out.println("Record saved successfully...");
	}
}


