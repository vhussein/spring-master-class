package com.azlan.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.azlan.springdemo.domain.Organization;

public class BeanScopeApp {

	public static void main(String[] args) {
		// 1. Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// 2. Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg");
		org2.setPostalCode("98989");
		
		// 3. Invoke the company slogan via bean
		System.out.println(org.corporateSlogan());
		
		// Print organization details
		System.out.println(org);
		System.out.println(org2);
		
		if(org == org2)
		{
			System.out.println("Singelton scope test: org and org2 point to the same instance");
		}
		else
		{
			System.out.println("Both org and org2 are separate instances");
		}
		
//		System.out.println(org.corporateService());
		
		// 4. Close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
