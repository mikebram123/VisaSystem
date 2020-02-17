package com.optimizePrime.visaSystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.optimizePrime.visaSystem.entities.Country;

@Repository
public interface CountryJPADAO extends 
			CrudRepository<Country, Integer> {

}
