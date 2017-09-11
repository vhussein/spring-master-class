package com.azlan.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.azlan.springdemo.domain.Organization;
import com.azlan.springdemo.domain.product.promotion.TradeFair;

public class PropertiesWithXmlApp {

	public static void main(String[] args) {
		// 1. Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

//		TradeFair tradeFair = (TradeFair) ctx.getBean("myfair");
//		System.out.println(tradeFair.specialPromotionalPricing());
		Organization org = (Organization) ctx.getBean("myorg");
		System.out.println(org);
		
		// 4. Close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
