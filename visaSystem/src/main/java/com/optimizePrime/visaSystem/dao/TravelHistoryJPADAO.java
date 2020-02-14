package com.optimizePrime.visaSystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.optimizePrime.visaSystem.entities.TravelHistory;

public interface TravelHistoryJPADAO extends CrudRepository<TravelHistory, Integer>{

}
