package SessionFactoryLevelCache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Test_Session_Factory_Level_Cache {
	public static void main(String[] args) {
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory  sessionfactory = configuration.buildSessionFactory();
	
	Session session = sessionfactory.openSession();
	Student s1 = (Student)session.load(Student.class, 16);
	System.out.println("First Student Data");
	System.out.println("First level cache  ");
	System.out.println("FirstName--->"+s1.getFirstName());
	System.out.println("LastName--->"+s1.getLastName());
	System.out.println("City--->"+s1.getCity());
	System.out.println("Mobile Number--->"+s1.getMobile_No());
	
	System.out.println("Second level cache \n ");
	Session session1 = sessionfactory.openSession();
	Student s2 = (Student)session.load(Student.class, 17);
	System.out.println("FirstName--->"+s2.getFirstName());
	System.out.println("LastName--->"+s2.getLastName());
	System.out.println("City--->"+s2.getCity());
	System.out.println("Mobile Number--->"+s2.getMobile_No());
	

	
	
	}
}