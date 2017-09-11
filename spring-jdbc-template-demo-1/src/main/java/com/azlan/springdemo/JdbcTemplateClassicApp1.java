package com.azlan.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.azlan.springdemo.dao.OrganizationDao;
import com.azlan.springdemo.daoImpl.OrganizationDaoImpl;
import com.azlan.springdemo.domain.Organization;

public class JdbcTemplateClassicApp1 {

	public static void main(String[] args) {
		
		// Create Application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		OrganizationDao dao = (OrganizationDaoImpl) ctx.getBean("orgDao");
		List<Organization> orgs = dao.getAllOrganizations();
		for(Organization org : orgs)
		{
			System.out.println(org);
		}
		
		// Close the application context
		((ClassPathXmlApplicationContext) ctx).close(); 
	}

}
