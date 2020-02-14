package com.optimizePrime.visaSystem.dao;

import org.springframework.data.repository.CrudRepository;

import com.optimizePrime.visaSystem.entities.Applicant;

public interface ApplicantJPADAO extends CrudRepository<Applicant, Integer>{

}
