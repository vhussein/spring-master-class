package com.azlan.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApp {

	public static void main(String[] args) {
		// 1. Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// 2. Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg2");
		
		// 3. Invoke the company slogan via bean
//		org.corporateSlogan();
		
		// Print organization details
		System.out.println(org);
		System.out.println(org2);
		
		// 4. Close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
