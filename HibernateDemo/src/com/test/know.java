package com.test;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class know {
	public static void main(String[] args) {
		System.out.println(" Project start");
		Configuration cfg = new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory= cfg.buildSessionFactory();
	System.out.println(factory.isClosed());
	}

}
