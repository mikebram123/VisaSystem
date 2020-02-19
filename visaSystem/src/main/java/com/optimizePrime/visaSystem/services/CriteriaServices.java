package com.optimizePrime.visaSystem.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
	public boolean isApplicantOnCriminalDatabase(int applicantId) {
		Applicant ap = applicantDAO.findById(applicantId).get();
		long passportNo = ap.getPassportNo();
		
		OffendeeDetails offendeeDetails=null;
		try {
			offendeeDetails= listAll(passportNo).get(0);
		
/*		if(db.isEmpty()) {
			System.out.println("Applicant is not on Mongo database");
			return false;
		}
*/			String dateOffence = offendeeDetails.getDate();
			
			System.out.println(dateOffence);
			System.out.println(inLast10Years(dateOffence));
			
			if(inLast10Years(dateOffence)) {
				System.out.println("Applicant is on Mongo database and within 10 years");
				return true;	
			}
			else {
				System.out.println("Applicant is on Mongo database and offence commited after 10 years");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Transactional
	public boolean isDependantOnCriminalDatabase(int applicantId) {
		Applicant ap = applicantDAO.findById(applicantId).get();
		Set<Dependant> dependants = ap.getDependantsRecords();
		for (Dependant dependant : dependants) {
			long depPNO = dependant.getPassportNo();
			if(listAll(depPNO).isEmpty()){
				System.out.println("Dependants are not in Mongo Database");
				return false;
			}
		}
		System.out.println("Dependants are in Mongo Database");
		return true;	
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
			if(isApplicantOnCriminalDatabase(applicantId)&&isDependantOnCriminalDatabase(applicantId)) {
				return "Rejected";
			}
			else if(isApplicantOnCriminalDatabase(applicantId)||isDependantOnCriminalDatabase(applicantId)) {
				return "In Progress";
				
			}
		}
		return "Accepted";
	}
	
	public List<OffendeeDetails> listAll(long passportNo) {
		List<OffendeeDetails> db = dnaDAO.findByPassportNo(passportNo);
		return db;
		}
	
	
	public static boolean inLast10Years(String Date) {//parameter using to find data in Last 10years
		double years = 0;
		try {
			//this converts DataBase date from String to Date Object
			Date date = new SimpleDateFormat("dd-MM-yyyy").parse(Date); 
			//this gets the current date; as in todays date.
			Date currentDate = new Date(); 
//The 'formula' to get the years between dates
			long diffMil = currentDate.getTime() - date.getTime(); //get miliseconds between dates
			long days = TimeUnit.MILLISECONDS.toDays(diffMil); //gets the number of days between dates
			years = days / 365.25; //gets the number of years between dates
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return years <= 10; //return date if its less than 10years or equals to ten years.
	}
	
}
