package com.optimizePrime.visaSystem.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.optimizePrime.visaSystem.entities.OffendeeDetails;

@Repository
public interface OffendeeDetailsDAO extends MongoRepository<OffendeeDetails, Integer>{
	// map the Document & Identifier type with MongoRepository
}