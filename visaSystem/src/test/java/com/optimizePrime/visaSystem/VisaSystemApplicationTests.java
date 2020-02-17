package com.optimizePrime.visaSystem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.optimizePrime.visaSystem.dao.ApplicantJPADAO;
import com.optimizePrime.visaSystem.dao.ApplicationJPADAO;
import com.optimizePrime.visaSystem.dao.CountryJPADAO;
import com.optimizePrime.visaSystem.dao.DependantJPADAO;
import com.optimizePrime.visaSystem.dao.EmploymentHistoryJPADAO;
import com.optimizePrime.visaSystem.dao.TravelHistoryJPADAO;
import com.optimizePrime.visaSystem.entities.Applicant;
import com.optimizePrime.visaSystem.entities.Application;
import com.optimizePrime.visaSystem.entities.Country;
import com.optimizePrime.visaSystem.entities.Gender;
import com.optimizePrime.visaSystem.entities.RelationshipStatus;
import com.optimizePrime.visaSystem.entities.TravelHistory;
import com.optimizePrime.visaSystem.entities.TypeOfTelephone;
import com.optimizePrime.visaSystem.services.ApplicantServices;

import com.optimizePrime.visaSystem.entities.Dependant;
import com.optimizePrime.visaSystem.entities.EmploymentHistory;
import com.optimizePrime.visaSystem.entities.dependantRelationship;
import com.optimizePrime.visaSystem.services.DependentServices;
import com.optimizePrime.visaSystem.services.TravelHistoryServices;


@SpringBootTest
class VisaSystemApplicationTests {
	
	@Autowired
	DependentServices dependSvc1;

	@Autowired
	ApplicantServices applicantSvc;
	
	@Autowired
	ApplicantJPADAO applicantDAO;
	
	@Autowired
	DependantJPADAO dependDAO;
	
	@Autowired
	TravelHistoryJPADAO thDAO;
	
	@Autowired
	ApplicationJPADAO applnDAO;
	
	@Autowired
	EmploymentHistoryJPADAO ehDAO;
	
	@Autowired
	CountryJPADAO countDAO;
	
	@Autowired
	TravelHistoryServices thsvc;
	
	
	@Test
	void testAddApplicant() {
		Applicant applicant = new Applicant();
		
		applicant.setName("Ricardo");
		applicant.setPassportNo(526173526);
		applicant.setCoutryOfNationality("Spain");
		applicant.setDatOfBirth("01/03/1990");
		applicant.setGender(Gender.MALE);
		applicant.setContactEmail("ricardo123@gmail.com");
		applicant.setContactLanguage("Spanish");
		applicant.setPlaceOfBirth("Centre Medic Sant Jordi de");
		applicant.setCountryOfBirth("Spain");
		applicant.setRelationshipStatus(RelationshipStatus.SINGLE);
		applicant.setHaveEmail(true);
		applicant.setWhoDoesThisEmailBelongTo("Ricardo");
		applicant.setFamilyName("Fernández");
		applicant.setGivenName("Ricardo");
		applicant.setCanBeContactedByTelephone(true);
		applicant.setTypeOfTelephone(TypeOfTelephone.MOBILE);
		applicant.setForUseWhileOutsideOfUK(false);
		applicant.setForUseWhileInsideOfUK(true);
		applicant.setTelephone(07526152451);
		applicant.setRecievedUKMedicalTreatment(true);
		applicant.setHaveUKDrivingLicense(false);
		applicant.setAddress("Rosa de los Vientos 21,Granátula de Calatrava,13360");
		applicant.setOwnershipStatusOfHome("Ricardo");
		applicant.setHowLongHaveYouLivedAtThisAddress(12.6);
		applicant.setThisCorrespondenceAddress(true);
		applicant.setHoldAnyOtherCItizenship(true);
		applicant.setNationalIdentityNo(627381736);
		applicant.setIssuingAuthority("Spanish Government");
		applicant.setEnteredUKIllegally(false);
		applicant.setRemainedInUKBeyondVisa(false);
		applicant.setBreachedConditions(false);
		applicant.setBeenInUkPast10Years(true);
		
		
		applicant=applicantDAO.save(applicant);
		System.out.println(applicant);
		//assertNotNull(applicant,"Applicant not added");
		
		
	}
	
	@Test
	void testDependentDAOAdd() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1997");
		depend.setGivenNames("Amy Louise");
		depend.setFamilyName("Leake");
		depend.setRelationshipToYou(dependantRelationship.SIBLING);
		depend.setCountryOfNationality("UK");
		depend.setAlwaysHadSameNationality(true);
		
		depend = dependSvc1.save(depend);
		
		System.out.println(depend);
		assertNotNull(depend, "Dependent Added");
		
	}
	@Test
	void testListApplicant() {
		Iterable<Applicant> appl=applicantDAO.findAll();
		assertNotNull(appl,"Applicants Not Found");
		for (Applicant applicant:appl) {
			System.out.println(applicant);
		}
	}
		
	@Test
	void testListDependant() {
		Iterable<Dependant> depend=dependDAO.findAll();
		assertNotNull(depend,"Dependant Not Found");
		for (Dependant dependant:depend) {
			System.out.println(dependant);
		}
	}
	@Test
	void testListTravelHistory() {
		Iterable<TravelHistory> th=thDAO.findAll();
		assertNotNull(th,"Travel History Not Found");
		for (TravelHistory travelhistory:th) {
			System.out.println(travelhistory);
		}
	}
	@Test
	void testListApplication() {
		Iterable<Application> appln=applnDAO.findAll();
		assertNotNull(appln,"Application Not Found");
		for (Application application:appln) {
			System.out.println(application);
		}
	}
	@Test
	void testListEmploymentHistory() {
		Iterable<EmploymentHistory> eh=ehDAO.findAll();
		assertNotNull(eh,"Employment History Not Found");
		for (EmploymentHistory employmenthistory:eh) {
			System.out.println(employmenthistory);
		}
	}
	@Test
	void testListCountry() {
		Iterable<Country> count=countDAO.findAll();
		assertNotNull(count,"Country Not Found");
		for (Country country:count) {
			System.out.println(country);
		}
	}
	{
	}
	
	}


