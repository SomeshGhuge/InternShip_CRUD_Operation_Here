package One_to_Many_Mapping;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
//   USE THIS IN Hibernate.cfg.xml while running ONE to Many
//    <mapping class="One_to_Many_Mapping.User"></mapping>
//    <mapping class="One_to_Many_Mapping.Policy"></mapping>


	public static Configuration getConfiguration() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		return configuration;                                                                        }

	public static void main(String[] args) {
		Configuration configuration = getConfiguration();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
                          User user = new User();

		// pass the value through constructor
		Policy policy1 = new Policy("J5", "Car Insurance", "Active", user);
                          Policy policy2 = new Policy("J6", "Bike Insurance", "Active", user);

		Set<Policy> set = new HashSet<Policy>();
		set.add(policy1);
		set.add(policy2);

		user.setPolicy(set);
		user.setName("ajay");
		user.setEmail("ajay@gmail.com");

		session.save(user);
		session.save(policy1);
		session.save(policy2);

                          transaction.commit();
		session.close();
		sessionFactory.close();
}}
