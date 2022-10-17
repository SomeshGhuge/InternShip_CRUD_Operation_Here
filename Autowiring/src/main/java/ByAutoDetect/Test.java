package ByAutoDetect;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("NewFile1.xml");
		Categories categories=(Categories)ac.getBean("categories");
		System.out.println(categories);
		


	}
}
