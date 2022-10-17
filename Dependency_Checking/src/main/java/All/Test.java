package All;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext acc=new ClassPathXmlApplicationContext("NewFile2.xml");
		Employee employee=(Employee)acc.getBean("s");
		employee.getAllEmployee();
	}

}
