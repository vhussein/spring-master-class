package com.azlan.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.azlan.springdemo.domain.HumanResourceDept;
import com.azlan.springdemo.domain.Organization;

public class DISConstructorApp {

	public static void main(String[] args) {
		// 1. Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// 2. Create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		// 3. Invoke the company slogan via bean
		System.out.println(org.corporateSlogan());
		
		// Print organization details
//		System.out.println(org);
//		
//		System.out.println(org.corporateService());
		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(500));
		
		// 4. Close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
