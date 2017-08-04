package com.azlan.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

	public static void main(String[] args) {
		// 1. Create the application context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// 2. Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// 3. Invoke the company slogan via bean
		org.corporateSlogan();
		
		// 4. Close the application context
		((FileSystemXmlApplicationContext) ctx).close();

	}

}
