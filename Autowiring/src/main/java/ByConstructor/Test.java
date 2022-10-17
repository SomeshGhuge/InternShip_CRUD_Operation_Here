package ByConstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
	
		
	Resource res = new ClassPathResource("File1.xml");
	BeanFactory factory =new XmlBeanFactory(res);
	Categories categories= (Categories) factory.getBean("cat");
	categories.show();
	
	/*
		ApplicationContext ac= new ClassPathXmlApplicationContext("File1.xml");
		Categories categories=(Categories)ac.getBean("cat");
		System.out.println(categories);
		
	*/
}
}
