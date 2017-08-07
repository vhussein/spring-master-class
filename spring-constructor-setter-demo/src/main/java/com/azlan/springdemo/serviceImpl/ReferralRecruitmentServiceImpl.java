package com.azlan.springdemo.serviceImpl;

import java.util.Random;

import com.azlan.springdemo.service.RecruitmentService;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " +
					random.nextInt(numberOfRecruitments) + " employees " + 
					" which was referred to the company by the employees";
		
		return hiringFacts;
	}

}
