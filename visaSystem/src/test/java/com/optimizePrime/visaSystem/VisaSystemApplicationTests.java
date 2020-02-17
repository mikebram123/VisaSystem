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


import com.optimizePrime.visaSystem.entities.Dependant;
import com.optimizePrime.visaSystem.entities.EmploymentHistory;
import com.optimizePrime.visaSystem.entities.dependantRelationship;


@SpringBootTest
class VisaSystemApplicationTests {
	
	@Autowired
	DependantJPADAO dependDAO;
	
	@Autowired
	ApplicantJPADAO applicantDAO;
	
	@Autowired
	ApplicationJPADAO appDAO;
	
	@Autowired
	EmploymentHistoryJPADAO employDAO;
	
	@Autowired
	CountryJPADAO countryDAO;
	
	@Autowired
	TravelHistoryJPADAO travelDAO;
	
	@Test
	void testAddApplicant() {
		
	}

	
	//ADDING ENTRIES
	
/*	@Test
	void testAddApplicantDAO() {
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
		
	}*/
	
	/*
    @Test
	void testApplicationDAOAdd() {
		Application app = new Application();
		app.setAddressInUK("65 Plain View Road, Leeds");
		app.setAmountSpendEachMonth(50);
		app.setAnotherIncome(true);
		app.setDateYouPlanToArriveUK("11/12/2020");
		app.setDateYouPlanToLeaveUK("11/08/2021");
		app.setFamilyInUK(true);
		app.setHaveAddressInUK(true);
		app.setHowMuchDoYouEarnAfterTax(30000.00);
		app.setHowMuchMoneyAreTheyPaying(2000.00);
		app.setHowMuchWillYouBePaid(2000.00);
		app.setLengthOfVisaVisit(8);
		app.setPassportExpiryDate("02/02/2025");
		app.setPassportIssueDate("03/05/2018");
		app.setPassportIssuingAuthority("Passport Office");
		app.setReasonWhyTherePayingForVisit("Work Related");
		app.setReceivedPublicFundsFromUK(false);
		app.setRelyOnYouFinancially(true);
		app.setTotalPrice(100.50);
		app.setWhatAreYouBeingPaidFor("Work project");
		app.setWhoIsPayingYourVisit("Employer");
		app.setWhoWillBePayingYouInUK("Client");
		//app.setTravelHistoryRecords(travelHistoryRecords);
		//app.setAssignedApplicant(assignedApplicant);
		
		app = appDAO.save(app);
		
		System.out.println(app);
		assertNotNull(app, "Application Not Added");
	}*/
	
	
	/*@Test
	void testCountryDAOAdd() {
		Country country = new Country();
		//country.setCountryVisited(countryVisited);
		//country.setAssignedTravelHistory(assignedTravelHistory);
		
		country = countryDAO.save(country);
	}*/
	
	
/*	@Test
	void testDependantDAOAdd() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1997");
		depend.setGivenNames("Michael Bramhall");
		depend.setFamilyName("Leake");
		depend.setRelationshipToYou(dependantRelationship.SIBLING);
		depend.setCountryOfNationality("UK");
		depend.setAlwaysHadSameNationality(true);
		
		depend = dependDAO.save(depend);
		
		System.out.println(depend);
		assertNotNull(depend, "Dependent Not Added");
		
	}*/
	
	
/*	@Test
	void testEmployementHistoryDAOAdd() {
		EmploymentHistory employ = new EmploymentHistory();
		employ.setEmployerName("Mastek");
		employ.setEmployerAddress("36 Park Row, Leeds");
		employ.setEmploymentStatus("Perminantly Employed");
		employ.setStartDate("12/04/2017");
		employ.setTelephone(077656);
		//employ.setAssignedApplicant(assignedApplicant);
		
		employ = employDAO.save(employ);
		
		System.out.println(employ);
		assertNotNull(employ, "Employee Not Added");
		
	}*/
	
/*	@Test
	void testTravelHistoryDAOAdd() {
		TravelHistory history = new TravelHistory();
		//history.setAssignedApplication(assignedApplication);
		history.setBannedFromEntry(false);
		//history.setCountryRecords(countryRecords);
		history.setDeported(false);
		history.setRefusedEntryAtBorder(true);
		history.setRefusedPermissionToStay(false);
		history.setRefusedVisa(false);
		history.setRemoved(false);
		history.setRequiredToLeave(true);
		history.setTimesVisted(4);
		
		history = travelDAO.save(history);
		
		System.out.println(history);
		assertNotNull(history, "Travel History Not Added");
		
	}*/
	
	//LIST TEST CASES
	
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
		Iterable<TravelHistory> th=travelDAO.findAll();
		assertNotNull(th,"Travel History Not Found");
		for (TravelHistory travelhistory:th) {
			System.out.println(travelhistory);
		}
	}
	@Test
	void testListApplication() {
		Iterable<Application> appln=appDAO.findAll();
		assertNotNull(appln,"Application Not Found");
		for (Application application:appln) {
			System.out.println(application);
		}
	}
	@Test
	void testListEmploymentHistory() {
		Iterable<EmploymentHistory> eh=employDAO.findAll();
		assertNotNull(eh,"Employment History Not Found");
		for (EmploymentHistory employmenthistory:eh) {
			System.out.println(employmenthistory);
		}
	}
	@Test
	void testListCountry() {
		Iterable<Country> count=countryDAO.findAll();
		assertNotNull(count,"Country Not Found");
		for (Country country:count) {
			System.out.println(country);
		}
		
	}
}

