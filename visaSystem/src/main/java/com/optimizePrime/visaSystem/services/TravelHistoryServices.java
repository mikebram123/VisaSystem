package com.optimizePrime.visaSystem.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.optimizePrime.visaSystem.dao.TravelHistoryJPADAO;

@Component
@Scope("singleton")
public class TravelHistoryServices {
	
	String exampleProperty;
	
	@Autowired
	TravelHistoryJPADAO thDAO;
	
	
	@PostConstruct
	public void initializeService() {
		System.out.println("Travel History Initialized");
	}
	@PreDestroy
	public void terminateService() {
		System.out.println("Travel History Terminated");
	}
	public void exampleMethod() {
		System.out.println("connect to"+getExampleProperty()+"for business data");
	}
	private String getExampleProperty() {
		return exampleProperty;
	}
	@Value("Spring Example Data Source")
	public void setExampleProperty(String exampleProperty) {
		System.out.println("Example Property Set:"+exampleProperty);
		this.exampleProperty=exampleProperty;
	}
	
}
