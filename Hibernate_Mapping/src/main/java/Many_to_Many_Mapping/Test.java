package Many_to_Many_Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		// Use this Schema For this (( hibernate_mapping_many_to_many ))

		/*   USE this in hibernate.cfg.xml file  for many to many mapping
		        <mapping class="Many_to_Many_Mapping.User"></mapping>
		        <mapping class="Many_to_Many_Mapping.Nominee"></mapping>
		 */
		
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml"); //load the file
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Transaction t= session.beginTransaction();

		User user1= new User();
		user1.setName("mohit");
		user1.setEmail("mohit@gmail.com");
		
		User user2= new User();
		user2.setName("ajay");
		user2.setEmail("ajay@gmail.com");
		
		Nominee nominee1= new Nominee();
		nominee1.setName("Sagar");
		
		Nominee nominee2= new Nominee();
		nominee2.setName("Santosh");
		
		Nominee nominee3= new Nominee();
		nominee3.setName("madan");
		
		user1.getNomineeList().add(nominee1);
		user1.getNomineeList().add(nominee2);
		user1.getNomineeList().add(nominee3);
		
		nominee1.getUserList().add(user1);
		nominee2.getUserList().add(user1);
		nominee3.getUserList().add(user1);
		
		user2.getNomineeList().add(nominee2);
		user2.getNomineeList().add(nominee3);
		
		nominee2.getUserList().add(user2);
		nominee3.getUserList().add(user2);
		
		session.persist(user1);
		session.persist(user2);
		
		t.commit();
		session.close();
		sessionFactory.close();

	}
}
