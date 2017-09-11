package com.azlan.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.azlan.springdemo.domain.Organization;

public interface OrganizationDao {
	
	// Set the datasource that will be required a connection to the database
	public void setDataSource(DataSource ds);
	
	// Create a record in the organization table
	public boolean creat(Organization org);
	
	// Retrieve a single organization
	public Organization getOrganization(Integer id);
	
	// Retrieve all organizations from the table
	public List<Organization> getAllOrganizations();
	
	// Delete a specific organization from the table
	public boolean delete(Organization org);
	
	// Update an existing organization
	public boolean update(Organization org);
	
	public void cleanup();
}
