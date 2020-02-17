package com.optimizePrime.visaSystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.optimizePrime.visaSystem.entities.Application;

@Repository
public interface ApplicationJPADAO extends
				CrudRepository<Application, Integer>{// Crud repository <class, PrimaryKeyType {

}