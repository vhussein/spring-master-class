package com.azlan.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.azlan.springdemo.domain.Organization;

public class CNamespaceApp {

	public static void main(String[] args) {
		// 1. Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// 2. Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// Print organization details
		System.out.println(org);
		
		// 4. Close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
