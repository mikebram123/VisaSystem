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
public class CriteriaTests {
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


	//Applicant Status Should be Accepted 
	//NOT ON DATABASE DEPENDANT NOT ON DATABASE ANSWERED QUESTIONS CORRECTLY
	//@Test
	void testAddApplicantDAOAccepted() {
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
		applicant.setWhereDoYouUseTelephone("Home");
		applicant.setHowLongHaveYouLivedAtThisAddress(7.11);
		applicant.setThisCorrespondenceAddress(true);
		applicant.setHoldAnyOtherCItizenship(true);
		applicant.setNationalIdentityNo(627381736);
		applicant.setIssuingAuthority("British Government");
		applicant.setEnteredUKIllegally(false);
		applicant.setRemainedInUKBeyondVisa(false);
		applicant.setBreachedConditions(false);
		applicant.setBeenInUkPast10Years(true);


		applicant=applicantDAO.save(applicant);
		System.out.println(applicant);
	}


	//@Test
	void testDependantDAOAddAccepted() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1994");
		depend.setGivenNames("Donna Wellington");
		depend.setFamilyName("Wellington");
		depend.setRelationshipToYou(dependantRelationship.GODPARENT);
		depend.setCountryOfNationality("United States");
		depend.setAlwaysHadSameNationality(true);
		depend.setPassportNo(111111);

		depend = dependDAO.save(depend);

		System.out.println(depend);
		assertNotNull(depend, "Dependent Not Added");

	}

	//@Test
	void testAssignDependantToApplicantAccepted() {
		Dependant dep = visaSrv.assignDependantsToApplicant(40,39);
		assertNotNull(dep.getAssignedApplicant(), "Applicant Not Found");
	}

																			//RUN THIS IS ON DEMO
	@Test
	void testPassVisaCriteriaAccepted() {
		critDAO.criteriaForVisa(39);
	}


	//This person is in the criminal database and committed an offence after 10 years => therefore in accepted
	//@Test
	void testAddApplicantDAOAcceptedAfter10() {
		Applicant applicant = new Applicant();

		applicant.setName("Kevin Higgs");
		applicant.setPassportNo(939873450l);
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
		applicant.setWhereDoYouUseTelephone("Home");
		applicant.setNationalIdentityNo(627381736);
		applicant.setIssuingAuthority("British Government");
		applicant.setEnteredUKIllegally(false);
		applicant.setRemainedInUKBeyondVisa(false);
		applicant.setBreachedConditions(false);
		applicant.setBeenInUkPast10Years(true);


		applicant=applicantDAO.save(applicant);
		System.out.println(applicant);
		//assertNotNull(applicant,"Applicant not added");

	}


	//@Test
	void testDependantDAOAddAcceptedAfter10() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1994");
		depend.setGivenNames("jake Paul");
		depend.setFamilyName("Paul");
		depend.setRelationshipToYou(dependantRelationship.GODPARENT);
		depend.setCountryOfNationality("United States");
		depend.setAlwaysHadSameNationality(true);
		depend.setPassportNo(111111);

		depend = dependDAO.save(depend);

		System.out.println(depend);
		assertNotNull(depend, "Dependent Not Added");

	}

	//@Test
	void testAssignDependantToApplicantAcceptedAfter10() {
		Dependant dep = visaSrv.assignDependantsToApplicant(42,41);
		assertNotNull(dep.getAssignedApplicant(), "Applicant Not Found");
	}

	//@Test											//RUN FOR DEMO
	void testPassVisaCriteriaAcceptedAfter10() {
		critDAO.criteriaForVisa(41);  							
	}




	//This person has entered incorrect question but only one => therefore in Progress
	//@Test
	void testAddApplicantDAOInProgress() {
		Applicant applicant = new Applicant();

		applicant.setName("Andrew Brooks");
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
		applicant.setWhereDoYouUseTelephone("Home");
		applicant.setIssuingAuthority("British Government");
		applicant.setEnteredUKIllegally(false);
		applicant.setRemainedInUKBeyondVisa(true);
		applicant.setBreachedConditions(false);
		applicant.setBeenInUkPast10Years(true);


		applicant=applicantDAO.save(applicant);
		System.out.println(applicant);
		//assertNotNull(applicant,"Applicant not added");

	}


	//@Test
	void testDependantDAOAdd() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1994");
		depend.setGivenNames("Donna Wellington");
		depend.setFamilyName("Wellington");
		depend.setRelationshipToYou(dependantRelationship.GODPARENT);
		depend.setCountryOfNationality("United States");
		depend.setAlwaysHadSameNationality(true);
		depend.setPassportNo(111111);

		depend = dependDAO.save(depend);

		System.out.println(depend);
		assertNotNull(depend, "Dependent Not Added");

	}

	//@Test
	void testAssignDependantToApplicant() {
		Dependant dep = visaSrv.assignDependantsToApplicant(44,43);
		assertNotNull(dep.getAssignedApplicant(), "Applicant Not Found");
	}
																			//Run this for DEMO
	//@Test
	void testPassVisaCriteria() {
		critDAO.criteriaForVisa(43);
	}


	//This person is in the criminal database but not his dependant => therefore in Progress
	//@Test
	void testAddApplicantDAOInProgresspt2() {
		Applicant applicant = new Applicant();

		applicant.setName("Martin Leonard");
		applicant.setPassportNo(000376763l);
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
		applicant.setWhereDoYouUseTelephone("Home");
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
		applicant.setRemainedInUKBeyondVisa(true);
		applicant.setBreachedConditions(false);
		applicant.setBeenInUkPast10Years(true);


		applicant=applicantDAO.save(applicant);
		System.out.println(applicant);
		//assertNotNull(applicant,"Applicant not added");

	}


	//@Test
	void testDependantDAOAddInProgresspt2() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1994");
		depend.setGivenNames("John Wayne");
		depend.setFamilyName("Wayne");
		depend.setRelationshipToYou(dependantRelationship.GODPARENT);
		depend.setCountryOfNationality("United States");
		depend.setAlwaysHadSameNationality(true);
		depend.setPassportNo(111111);

		depend = dependDAO.save(depend);

		System.out.println(depend);
		assertNotNull(depend, "Dependent Not Added");

	}

	//@Test
	void testAssignDependantToApplicantpt2() {
		Dependant dep = visaSrv.assignDependantsToApplicant(45,46);
		assertNotNull(dep.getAssignedApplicant(), "Applicant Not Found");
	}
											//RUN This for DEMO

	//@Test
	void testPassVisaCriteriapt2() {
		critDAO.criteriaForVisa(46);
	}


	//This person has entered incorrect questions  => therefore in rejected
	//@Test
	void testAddApplicantDAORejected() {
		Applicant applicant = new Applicant();

		applicant.setName("jammy dodger");
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
		applicant.setWhereDoYouUseTelephone("Home");
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
		applicant.setEnteredUKIllegally(true);
		applicant.setRemainedInUKBeyondVisa(true);
		applicant.setBreachedConditions(true);
		applicant.setBeenInUkPast10Years(true);


		applicant=applicantDAO.save(applicant);
		System.out.println(applicant);
		//assertNotNull(applicant,"Applicant not added");

	}


	//@Test
	void testDependantDAORejected() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1994");
		depend.setGivenNames("Donna Wellington");
		depend.setFamilyName("Wellington");
		depend.setRelationshipToYou(dependantRelationship.GODPARENT);
		depend.setCountryOfNationality("United States");
		depend.setAlwaysHadSameNationality(true);
		depend.setPassportNo(111111);

		depend = dependDAO.save(depend);

		System.out.println(depend);
		assertNotNull(depend, "Dependent Not Added");

	}

	//@Test
	void testAssignDependantToApplicantRejected() {
		Dependant dep = visaSrv.assignDependantsToApplicant(47,48);
		assertNotNull(dep.getAssignedApplicant(), "Applicant Not Found");
	}

											//Run This for Demo
	//@Test
	void testPassVisaCriteriaRejected() {
		critDAO.criteriaForVisa(48);
	}


	//This person is in the criminal database and his dependant is => therefore in rejected
	//@Test
	void testAddApplicantDAORejectedForBothDependantApplicant() {
		Applicant applicant = new Applicant();

		applicant.setName("Should be rejected 2");
		applicant.setPassportNo(00376000l);
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
		applicant.setWhereDoYouUseTelephone("Home");
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
		applicant.setBreachedConditions(false);
		applicant.setBeenInUkPast10Years(true);


		applicant=applicantDAO.save(applicant);
		System.out.println(applicant);
		//assertNotNull(applicant,"Applicant not added");

	}


	//@Test
	void testDependantDAOAddRejectedPT2() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1994");
		depend.setGivenNames("Lee Smith123");
		depend.setFamilyName("Smith");
		depend.setRelationshipToYou(dependantRelationship.GODPARENT);
		depend.setCountryOfNationality("United States");
		depend.setAlwaysHadSameNationality(true);
		depend.setPassportNo(456376090l);

		depend = dependDAO.save(depend);

		System.out.println(depend);
		assertNotNull(depend, "Dependent Not Added");

	}

	//@Test
	void testAssignDependantToApplicantRejectedPT2() {
		Dependant dep = visaSrv.assignDependantsToApplicant(49,50);
		assertNotNull(dep.getAssignedApplicant(), "Applicant Not Found");
	}

	
										//RUN IN DEMO
	//@Test
	void testPassVisaCriteriaRejectedPT2() {
		critDAO.criteriaForVisa(50);
	}



}
