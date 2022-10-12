package Many_to_One_Mapping;




import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	
//   USE this  in Hibernate.xfg.xml  for  many to one mapping
	
//    <mapping class="Many_to_One_Mapping.Address"></mapping>
//    <mapping class="Many_to_One_Mapping.Employee"></mapping>


	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("ram");
		e1.setEmail("ram@gmail.com");

		Employee e2 = new Employee();
		e2.setName("sachin");
		e2.setEmail("sachin@gmail.com");

		Address address1 = new Address();
		address1.setCity("Pune");
		address1.setState("Maharashtra");
		address1.setCountry("India");
		address1.setPinCode("411035");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml"); // load the file

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		e1.setAddress(address1);
		e2.setAddress(address1);

		session.save(e1);
		session.save(e2);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
