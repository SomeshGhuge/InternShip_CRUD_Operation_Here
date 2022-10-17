package None;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	

	ApplicationContext accc=new ClassPathXmlApplicationContext("NewFile3.xml");
Employee employee=(Employee)accc.getBean("s");
employee.getDetailsEmployeee();
}
}
