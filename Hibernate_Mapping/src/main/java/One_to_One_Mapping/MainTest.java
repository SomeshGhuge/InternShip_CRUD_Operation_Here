package One_to_One_Mapping;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		
//      USE THIS IN Hibernate.cfg.xml ----> for One_To_One_Mapping
		
//        <mapping class="One_to_One_Mapping.Customer"></mapping>
//        <mapping class="One_to_One_Mapping.Transection"></mapping>

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Customer customer = new Customer();
		customer.setFirstName("Somesh Ghuge");
		customer.setMobileNumber("8329819043");

		Transection transection = new Transection();
		transection.setDate(new Date());
		transection.setTotal(50000);

		customer.setTransection(transection);

		session.save(customer);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
