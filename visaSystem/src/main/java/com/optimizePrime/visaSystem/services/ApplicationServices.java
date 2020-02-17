package com.optimizePrime.visaSystem.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.optimizePrime.visaSystem.api.ApplicationAPI;
import com.optimizePrime.visaSystem.dao.ApplicantJPADAO;
import com.optimizePrime.visaSystem.dao.ApplicationJPADAO;
import com.optimizePrime.visaSystem.dao.TravelHistoryJPADAO;
import com.optimizePrime.visaSystem.entities.Applicant;
import com.optimizePrime.visaSystem.entities.Application;
import com.optimizePrime.visaSystem.entities.TravelHistory;

@Component // marking the class as bean to be created.
@Scope("singleton") // singleton: one object used across test cases, prototype: one object per request.
public class ApplicationServices implements ApplicationAPI {
	
	String exampleApplication;
	
	@Autowired
	ApplicationJPADAO applicationDAO;
	
	@Autowired
	ApplicantJPADAO applicantDAO;
	
	@Autowired
	TravelHistoryJPADAO travelhistoryDAO;
	
	@PostConstruct // initialisation method of the class.
	public void initializeService() {
		System.out.println("Application Service Initialized");
	}
	
	@PreDestroy // calls before the shutting down the application.
	public void terminateService() {
		System.out.println("Application Service Terminated");
	}

	public void exampleMethod() {
		System.out.println("Connect to "+getExampleApplication()+" for business data");
	}

	public String getExampleApplication() {
		return exampleApplication;
	}
	
	@Value("Spring Example Data Source")
	public void setExampleApplication(String exampleApplication) {
		System.out.println("Setting Example Application: "+exampleApplication);
		this.exampleApplication = exampleApplication;
	}

	@Transactional
	public Application assignApplicationToApplicant(int applicationid, int applicationRecords) {
		Application application = applicationDAO.findById(applicationid).get(); // fetch the employee if exists.
		Applicant applicant = applicantDAO.findById(applicationRecords).get(); // fetch the department if exists.
		
		application.setAssignedApplicant(applicant);
		//applicant. wait till atiq for this method
		return application;
	}
	
	@Transactional 
	public TravelHistory assignTravelHistoryToApplication(int travelhisId, int applicationId) {
		TravelHistory th = travelhistoryDAO.findById(travelhisId).get();
		Application ap = applicationDAO.findById(applicationId).get();
		
		//th.setcurrentapplication(ap); fill this is in when merged
		ap.getTravelHistoryRecords().add(th);
		
		travelhistoryDAO.save(th);
		applicationDAO.save(ap);
		
		return th;
	}



	@Override
	public Iterable<Application> listAllApplication() {
		System.out.println("Listing All Applications");
		return applicationDAO.findAll();
	}

	@Override
	public Application findByApplicationId(int applicationid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application registerNewApplication(Application newApplication) {
		// TODO Auto-generated method stub
		return null;
	}


}
