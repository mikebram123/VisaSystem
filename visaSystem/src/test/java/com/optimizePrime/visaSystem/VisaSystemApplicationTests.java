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
import com.optimizePrime.visaSystem.dao.OffendeeDetailsDAO;
import com.optimizePrime.visaSystem.dao.TravelHistoryJPADAO;
import com.optimizePrime.visaSystem.entities.Applicant;
import com.optimizePrime.visaSystem.entities.Application;
import com.optimizePrime.visaSystem.entities.Country;
import com.optimizePrime.visaSystem.entities.Dependant;
import com.optimizePrime.visaSystem.entities.EmploymentHistory;
import com.optimizePrime.visaSystem.entities.Gender;
import com.optimizePrime.visaSystem.entities.RelationshipStatus;
import com.optimizePrime.visaSystem.entities.TravelHistory;
import com.optimizePrime.visaSystem.entities.TypeOfTelephone;
import com.optimizePrime.visaSystem.entities.dependantRelationship;
import com.optimizePrime.visaSystem.services.CriteriaServices;
import com.optimizePrime.visaSystem.services.VisaSystemServices;

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
	
	@Autowired
	OffendeeDetailsDAO offendeeDAO;
	
	@Autowired
	VisaSystemServices visaSrv;
	
	@Autowired
	CriteriaServices critDAO;
	
	@Test
	void testAddApplicant() {
		
	}
    
    //ADDING ENTRIES
    
    @Test
    void testAddApplicantDAO() {
        Applicant applicant = new Applicant();
        
        applicant.setName("Andrew Crooks");
        applicant.setPassportNo(111173522);
        applicant.setCoutryOfNationality("UK");
        applicant.setDatOfBirth("01/0/1987");
        applicant.setGender(Gender.MALE);
        applicant.setContactEmail("andrew123@gmail.com");
        applicant.setContactLanguage("English");
        applicant.setPlaceOfBirth("Sheffield");
        applicant.setCountryOfBirth("England");
        applicant.setRelationshipStatus(RelationshipStatus.MARRIED);
        applicant.setHaveEmail(true);
        applicant.setWhoDoesThisEmailBelongTo("Andrew");
        applicant.setFamilyName("Fernández");
        applicant.setGivenName("Crooks");
        applicant.setCanBeContactedByTelephone(true);
        applicant.setTypeOfTelephone(TypeOfTelephone.MOBILE);
        applicant.setForUseWhileOutsideOfUK(true);
        applicant.setForUseWhileInsideOfUK(true);
        applicant.setTelephone(07236152123);
        applicant.setRecievedUKMedicalTreatment(true);
        applicant.setHaveUKDrivingLicense(true);
        applicant.setAddress("123 Howard Street 8SH 9NS");
        applicant.setOwnershipStatusOfHome("Owned");
        applicant.setHowLongHaveYouLivedAtThisAddress(7.11);
        applicant.setThisCorrespondenceAddress(true);
        applicant.setHoldAnyOtherCItizenship(true);
        applicant.setNationalIdentityNo(627381736);
        applicant.setIssuingAuthority("British Government");
        applicant.setEnteredUKIllegally(false);
        applicant.setRemainedInUKBeyondVisa(false);
        applicant.setBreachedConditions(true);
        applicant.setBeenInUkPast10Years(true);
        
        
        applicant=applicantDAO.save(applicant);
        System.out.println(applicant);
        //assertNotNull(applicant,"Applicant not added");
        
    }
    
    @Test
    void testApplicationDAOAdd() {
        Application app = new Application();
        app.setAddressInUK("688 Spa View Road S3 8HD");
        app.setAmountSpendEachMonth(900);
        app.setAnotherIncome(false);
        app.setDateYouPlanToArriveUK("01/04/2020");
        app.setDateYouPlanToLeaveUK("11/08/2020");
        app.setFamilyInUK(false);
        app.setHaveAddressInUK(true);
        app.setHowMuchDoYouEarnAfterTax(40000.00);
        app.setHowMuchMoneyAreTheyPaying(1000.00);
        app.setHowMuchWillYouBePaid(1000.00);
        app.setLengthOfVisaVisit(4);
        app.setPassportExpiryDate("02/02/2025");
        app.setPassportIssueDate("03/05/2018");
        app.setPassportIssuingAuthority("British Passport Office");
        app.setReasonWhyTherePayingForVisit("Work Related");
        app.setReceivedPublicFundsFromUK(false);
        app.setRelyOnYouFinancially(true);
        app.setTotalPrice(100.50);
        app.setWhatAreYouBeingPaidFor("Work project");
        app.setWhoIsPayingYourVisit("Employer");
        app.setWhoWillBePayingYouInUK("Employer");
        //app.setTravelHistoryRecords(travelHistoryRecords);
        //app.setAssignedApplicant(assignedApplicant);
        
        app = appDAO.save(app);
        
        System.out.println(app);
        assertNotNull(app, "Application Not Added");
    }
    
    
   @Test
    void testCountryDAOAdd() {
        Country country = new Country();
        country.setCountryVisited("Ireland");
        
        country = countryDAO.save(country);
        assertNotNull(country, "Country Not Found");
    }
    
    
    @Test
    void testDependantDAOAdd() {
        Dependant depend = new Dependant();
        depend.setDateOfBirth("14/08/1994");
        depend.setGivenNames("Donna Wellington");
        depend.setFamilyName("Wellington");
        depend.setRelationshipToYou(dependantRelationship.GODPARENT);
        depend.setCountryOfNationality("United States");
        depend.setAlwaysHadSameNationality(true);
        
        depend = dependDAO.save(depend);
        
        System.out.println(depend);
        assertNotNull(depend, "Dependent Not Added");
        
    }
    
    
    @Test
    void testEmployementHistoryDAOAdd() {
        EmploymentHistory employ = new EmploymentHistory();
        employ.setEmployerName("Boots");
        employ.setEmployerAddress("89 Down Street 9JS 8DJ");
        employ.setEmploymentStatus("Perminantly Employed");
        employ.setStartDate("15/07/2018");
        employ.setTelephone(07744455656);
        //employ.setAssignedApplicant(assignedApplicant);
        
        employ = employDAO.save(employ);
        
        System.out.println(employ);
        assertNotNull(employ, "Employee Not Added");
        
    }
    
    @Test
    void testTravelHistoryDAOAdd() {
        TravelHistory history = new TravelHistory();
        //history.setAssignedApplication(assignedApplication);
        history.setBannedFromEntry(false);
        //history.setCountryRecords(countryRecords);
        history.setDeported(false);
        history.setRefusedEntryAtBorder(false);
        history.setRefusedPermissionToStay(false);
        history.setRefusedVisa(false);
        history.setRemoved(false);
        history.setRequiredToLeave(false);
        history.setTimesVisted(7);
        
        history = travelDAO.save(history);
        
        System.out.println(history);
        assertNotNull(history, "Travel History Not Added");
        
    }
    
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

	
	//ASSIGNING OBJECTS TO OBJECTS
	
	// EMPLOYMENT HISTORY AND APPLICANT
	
	@Test
	void testAssignEmploymentHistoryToApplicant() {
		EmploymentHistory employ = visaSrv.assignEmploymentHistoryToApplicant(26, 21);
		assertNotNull(employ.getAssignedApplicant(), "Empoyment History Not Found");
	}
	
	//APPLICATION AND APPLICANT
	
	@Test
	void testAssignApplicationToApplicant() {
		Application app = visaSrv.assignApplicationToApplicant(28, 27);
		assertNotNull(app.getTravelHistoryRecords(), "Applicant Not Found");
	}
	
	//APPLICANT AND DEPENDANT
	
	@Test
	void testAssignDependantToApplicant() {
		Dependant dep = visaSrv.assignDependantsToApplicant(23, 21);
		assertNotNull(dep.getAssignedApplicant(), "Applicant Not Found");
	}
	
	//TRAVEL HISTORY and Application
	
	@Test
	void testAssignTravelHistoryRecordsToApplication() {
		TravelHistory hist = visaSrv.assignTravelHistoryToApplication(40, 28);
		assertNotNull(hist.getAssignedApplication(),"Travel History Not Found");
	}
	
	//COUNTRY AND TRAVEL HISTORY
	
	@Test
	void testAssignTravelHistoryToCountry() {
		TravelHistory trav = visaSrv.assignTravelHistoryToCountry(39, 28);
		assertNotNull(trav.getCountryRecords(), "History Not Found");
	}
	
	//Test Criteria for whether applicant is accepted, rejected or in progress - (being reviewed)
    @Test
    void testVisaCriteria() {
    String a = critDAO.criteriaForVisa(2);
    System.out.println(a);
    
    }

//    @Test
//    void testVisaCriteria() {
//    String a = critDAO.criteriaForVisa(2);
//    System.out.println(a);
//    
//    }
	
	@Test
	void testPrintDateFromConvict() {
		critDAO.listAll();
	}

}
