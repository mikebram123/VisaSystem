package com.optimizePrime.visaSystem.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.optimizePrime.visaSystem.dao.ApplicantJPADAO;
import com.optimizePrime.visaSystem.dao.ApplicationJPADAO;
import com.optimizePrime.visaSystem.dao.CountryJPADAO;
import com.optimizePrime.visaSystem.dao.DependantJPADAO;
import com.optimizePrime.visaSystem.dao.EmploymentHistoryJPADAO;
import com.optimizePrime.visaSystem.dao.TravelHistoryJPADAO;
import com.optimizePrime.visaSystem.entities.Applicant;
import com.optimizePrime.visaSystem.entities.Application;
import com.optimizePrime.visaSystem.entities.Country;
import com.optimizePrime.visaSystem.entities.Dependant;
import com.optimizePrime.visaSystem.entities.EmploymentHistory;
import com.optimizePrime.visaSystem.entities.TravelHistory;

@Component
@Scope("singleton")
public class VisaSystemServices {

	@Autowired
	ApplicantJPADAO applicantDAO;
	
	@Autowired
	ApplicationJPADAO applicationDAO;
	
	@Autowired
	CountryJPADAO countryDAO;
	
	@Autowired
	DependantJPADAO depDAO;
	
	@Autowired
	TravelHistoryJPADAO travelDAO;
	
	@Autowired
	EmploymentHistoryJPADAO emphisDAO;
	
	@Transactional
	public Application assignApplicationToApplicant(int applicationid, int applicationRecords) {
		Application application = applicationDAO.findById(applicationid).get(); // fetch the employee if exists.
		Applicant applicant = applicantDAO.findById(applicationRecords).get(); // fetch the department if exists.
		
		application.setAssignedApplicant(applicant);
		applicant.getApplicationRecords().add(application);
		
		return application;
	}
	
	@Transactional 
	public TravelHistory assignTravelHistoryToApplication(int travelhisId, int applicationId) {
		TravelHistory th = travelDAO.findById(travelhisId).get();
		Application ap = applicationDAO.findById(applicationId).get();
		
		th.setAssignedApplication(ap);
		ap.getTravelHistoryRecords().add(th);
		
		travelDAO.save(th);
		applicationDAO.save(ap);
		
		return th;
	}
	
	@Transactional
	public TravelHistory assignTravelHistoryToCountry(int travelHisid, int countryId) {
		TravelHistory th = travelDAO.findById(travelHisid).get();
		Country co = countryDAO.findById(countryId).get();
		
		co.setAssignedTravelHistory(th);
		th.getCountryRecords().add(co);
		
		return th;
	}
	
	public EmploymentHistory assignEmploymentHistoryToApplicant(int emphId, int applicantId) {
		EmploymentHistory eh = emphisDAO.findById(emphId).get();
		Applicant applic = applicantDAO.findById(applicantId).get();
		
		eh.setAssignedApplicant(applic);
		applic.getEmploymentHistoryRecords().add(eh);
		
		return eh;
	}
	
	public Dependant assignDependantsToApplicant(int depId,int applicantId) {
		Dependant dep = depDAO.findById(depId).get();
		Applicant applic = applicantDAO.findById(applicantId).get();
		
		dep.setAssignedApplicant(applic);
		applic.getDependantsRecords().add(dep);
		
		return dep;
	}
}
