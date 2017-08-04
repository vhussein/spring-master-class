package com.azlan.springIOCDemoChallenge;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge2 {
	
	public static void main(String[] args)
	{
		// 1. Create the Application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		// 2. Create the bean
		City city = (City) ctx.getBean("myCity");
		
		// 3. Invoke the city name
		city.cityName();
		
		// 4. Close the context
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
