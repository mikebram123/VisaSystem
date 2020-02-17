package com.optimizePrime.visaSystem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.optimizePrime.visaSystem.entities.Dependant;
import com.optimizePrime.visaSystem.entities.dependantRelationship;
import com.optimizePrime.visaSystem.services.DependentServices;

@SpringBootTest
class VisaSystemApplicationTests {
	
	@Autowired
	DependentServices dependSvc1;

	@Test
	void contextLoads() {
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

}
