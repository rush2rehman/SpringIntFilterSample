package com.mycompany.SpringIntFilterSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class App {

	//public static ApplicationContext NOTIFICATION_SPRING_CTX;
	
	
	public static void main(String... args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		//CustomerService cs = ac.getBean("customerService", CustomerService.class);
		System.out.println("Test");
	}

	

}