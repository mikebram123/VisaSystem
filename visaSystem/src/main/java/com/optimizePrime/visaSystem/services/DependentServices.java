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
	public Dependant findBydependid(int dependid) {
		return dependDAO.findById(dependid).get();
	}

	public Dependant save(Dependant newDependant) {
		newDependant = dependDAO.save(newDependant);
		return newDependant;
	}
	

}
