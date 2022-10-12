package com.cache;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

public class Querylevelcache_Test {

  public static void main(String[] args) {
	System.out.println("line 1");
	Configuration configuration=new Configuration();
	System.out.println("line 2");
	configuration.configure("hibernate.cfg.xml");
	System.out.println("line 3");
	SessionFactory sessionfactory = configuration.buildSessionFactory();
	System.out.println("line 4");
	Session session =sessionfactory.openSession();
	System.out.println("line 5");
	System.out.println(" <---------First Query------->");
	Query query=session.createQuery("from cache");
	query.setCacheable(true);
	List<cache>caches=query.list();
	for(cache cache:caches) {
		System.out.println("Id------------->"+cache.getId());
		System.out.println("FirstName------>"+cache.getFirstName());
		System.out.println("LastName------->"+cache.getLastName());
		System.out.println("City----------->"+cache.getCity());
		System.out.println("Mobile number-->"+cache.getMobile_No());
	}
	session.close();
	sessionfactory.close();
	System.out.println("<------------------Record was get successfully----------------------->");
	
}
}
