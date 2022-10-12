package FirstSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestFirstSpring {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student)context.getBean("s");
		System.out.println("Student data>>"+student);
		
	}
}
//<properties>
//<spring.version>5.3.18.RELEASE</spring.version>
//</properties>${spring.version}