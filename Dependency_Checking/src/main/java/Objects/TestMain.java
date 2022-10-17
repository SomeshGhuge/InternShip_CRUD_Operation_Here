package Objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile1.xml");
		Employee employee = (Employee) context.getBean("s");
		employee.getAllEmployee();
}}

