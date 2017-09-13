package com.azlan.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azlan.springdemo.dao.OrganizationDao;
import com.azlan.springdemo.domain.Organization;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;
	
	public List<Organization> getOrgList()
	{
		List<Organization> orglist = organizationDao.getAllOrganizations();
		return orglist;
	}
}
