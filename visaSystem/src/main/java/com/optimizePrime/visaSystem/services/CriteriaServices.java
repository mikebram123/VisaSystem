package com.optimizePrime.visaSystem.services;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.optimizePrime.visaSystem.dao.ApplicantJPADAO;
import com.optimizePrime.visaSystem.dao.ApplicationJPADAO;
import com.optimizePrime.visaSystem.dao.CountryJPADAO;
import com.optimizePrime.visaSystem.dao.DependantJPADAO;
import com.optimizePrime.visaSystem.dao.EmploymentHistoryJPADAO;
import com.optimizePrime.visaSystem.dao.OffendeeDetailsDAO;
import com.optimizePrime.visaSystem.dao.TravelHistoryJPADAO;
import com.optimizePrime.visaSystem.entities.Applicant;
import com.optimizePrime.visaSystem.entities.Dependant;
import com.optimizePrime.visaSystem.entities.OffendeeDetails;

@Component
public class CriteriaServices {

	
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
	
	@Autowired
	OffendeeDetailsDAO dnaDAO;
	
	@Transactional
	public boolean isApplicantOnCriminalDatabase(Applicant applicant,int applicantId) {
		Applicant ap = applicantDAO.findById(applicantId).get();
		long passportNo = ap.getPassportNo();
		//query mongoDB with passportNo
		//if it is return true
		return false;
		
	}
	
	@Transactional
	public boolean isDependantOnCriminalDatabase(Applicant applicant, int applicantId) {
		Applicant ap = applicantDAO.findById(applicantId).get();
		Set<Dependant> dependants = applicant.getDependantsRecords();
//		for (Dependant dependant : dependants) {
//			query mongoDB for dependant with name
//			if(dependant Exists In MongoDB) {
//				break;
//				return true;
//			}	
//		}
		return false;	
	}
	
	@Transactional
	public String checkApplicationProgress(int applicationId) {
		
		return "Accepted";
	}
	
	@Transactional
	public String criteriaForVisa(int applicantId) {
		Applicant ap = applicantDAO.findById(applicantId).get();
		if(ap.isRemainedInUKBeyondVisa()&&ap.isBreachedConditions()&&ap.isEnteredUKIllegally()) {
			return "Rejected";
		}
		else if(ap.isRemainedInUKBeyondVisa()||ap.isBreachedConditions()||ap.isEnteredUKIllegally()) {
			return "In Progress";
		}
		else {
			return "Accepted";
		}
	}
	
	public void listAll() {
		List<OffendeeDetails> db = dnaDAO.findByPassportNo(986742241);
		for (OffendeeDetails offendeeDetails : db) {
			String date = offendeeDetails.getDate();
			System.out.println(date);
		}
		
		
	}
	
}
