package com.optimizePrime.visaSystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.optimizePrime.visaSystem.entities.TravelHistory;

@Repository
public interface TravelHistoryJPADAO extends 
			CrudRepository<TravelHistory, Integer>{

}
