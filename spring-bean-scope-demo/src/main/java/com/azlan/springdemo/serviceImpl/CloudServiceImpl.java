package com.azlan.springdemo.serviceImpl;

import java.util.Random;

import com.azlan.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an organization, " + companyName +
				" offers world class Cloud Computing infrastructure. " +
				"\nThe annual income exceeds " + random.nextInt(revenue) + " dollars";
		
		return service;
	}

}
