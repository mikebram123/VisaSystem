package com.optimizePrime.visaSystem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.optimizePrime.visaSystem.dao.ApplicantJPADAO;
import com.optimizePrime.visaSystem.entities.Applicant;
import com.optimizePrime.visaSystem.entities.Gender;
import com.optimizePrime.visaSystem.entities.RelationshipStatus;
import com.optimizePrime.visaSystem.entities.TypeOfTelephone;
import com.optimizePrime.visaSystem.services.ApplicantServices;

import com.optimizePrime.visaSystem.entities.Dependant;
import com.optimizePrime.visaSystem.entities.dependantRelationship;
import com.optimizePrime.visaSystem.services.DependentServices;


@SpringBootTest
class VisaSystemApplicationTests {
	
	@Autowired
	DependentServices dependSvc1;

	@Autowired
	ApplicantServices applicantSvc;
	@Autowired
	ApplicantJPADAO applicantDAO;
	
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
	void testDependantDAOAdd() {
		Dependant depend = new Dependant();
		depend.setDateOfBirth("14/08/1997");
		depend.setGivenNames("Michael Bramhall");
		depend.setFamilyName("Leake");
		depend.setRelationshipToYou(dependantRelationship.SIBLING);
		depend.setCountryOfNationality("UK");
		depend.setAlwaysHadSameNationality(true);
		
		depend = dependSvc1.save(depend);
		
		System.out.println(depend);
		assertNotNull(depend, "Dependent Added");
		
	}

}
