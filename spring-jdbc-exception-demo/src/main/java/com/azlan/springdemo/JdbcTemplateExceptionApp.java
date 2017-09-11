package com.azlan.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;

import com.azlan.springdemo.dao.OrganizationDao;
import com.azlan.springdemo.daoImpl.OrganizationDaoImpl;
import com.azlan.springdemo.domain.Organization;

public class JdbcTemplateExceptionApp {

	public static void main(String[] args) {
		
		// Create Application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		OrganizationDao dao = (OrganizationDaoImpl) ctx.getBean("orgDao");
		
		List<Organization> orgs = null;
		
		try
		{
			
			dao.getAllOrganizations();
			
		}
		catch (BadSqlGrammarException bge)
		{
			System.out.println("SUB EXCEPTION MESSAGE: " + bge.getMessage());
			System.out.println("SUB EXCEPTION CLASS: " + bge.getClass());
		}
		catch (DataAccessException dae)
		{
			System.out.println("EXCEPTION MESSAGE: " + dae.getMessage());
			System.out.println("EXCEPTION CLASS: " + dae.getClass());
		}
		
		for(Organization org : orgs)
		{
			System.out.println(org);
		}
		
		// Close the application context
		((ClassPathXmlApplicationContext) ctx).close(); 
	}

}
