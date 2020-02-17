package com.optimizePrime.visaSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.optimizePrime.visaSystem.api.DependantAPI;
import com.optimizePrime.visaSystem.dao.DependantJPADAO;
import com.optimizePrime.visaSystem.entities.Dependant;

@Component
@Scope("singleton")
public class DependentServices implements DependantAPI {
	
	@Autowired
	DependantJPADAO dependDAO;
	
	public Iterable<Dependant> listAllDependents() {
		System.out.println("List all dependants");
		return dependDAO.findAll();
	}

	@Override
	public Dependant findBydependantId(int dependid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dependant registerNewdependant(Dependant newDependant) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
