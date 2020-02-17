package com.optimizePrime.visaSystem.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.optimizePrime.visaSystem.api.ApplicantAPI;
import com.optimizePrime.visaSystem.entities.Applicant;

@Component   //marking the class as a bean to be created 
@Scope("singleton")
public class ApplicantServices implements ApplicantAPI{

	@Override
	public Iterable<Applicant> listAllApplicants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Applicant findByapplicantId(int applicantId) {
		// TODO Auto-generated method stub
		return null;
	}

}
