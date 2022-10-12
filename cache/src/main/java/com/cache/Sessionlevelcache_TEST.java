package com.cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Sessionlevelcache_TEST {
	public static void main(String[] args) {
		System.out.println("line 1 ");
		Configuration configuration = new Configuration();
		System.out.println("line 2 ");
		configuration.configure("hibernate.cfg.xml");
		System.out.println("line 3 ");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		System.out.println("line 4 ");
		Session session = sessionfactory.openSession();
		System.out.println("line 5 ");
		
		// now we are using two session objects
		cache s1 = (cache)session.get(cache.class,9);
		System.out.println("<-------First Student Data is------>");
		System.out.println("student id is --->"+s1.getId());
		System.out.println("student firstname is---->"+s1.getFirstName());
		System.out.println("student firstname is---->"+s1.getLastName());
		System.out.println("student city is---->"+s1.getCity());
		System.out.println("student mobile is---->"+s1.getMobile_No());

		System.out.println("line 6 ");
		cache s2 = (cache)session.get(cache.class,9);
		System.out.println("<-------Second Student Data is------>");
		System.out.println("student id is --->"+s2.getId());
		System.out.println("student firstname is---->"+s2.getFirstName());
		System.out.println("student firstname is---->"+s2.getLastName());
		System.out.println("student city is---->"+s2.getCity());
		System.out.println("student mobile is---->"+s2.getMobile_No());


	}

}
