package com.optimizePrime.visaSystem.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.optimizePrime.visaSystem.services.VisaSystemServices;


@Component
public class APIConfig extends ResourceConfig {
	
	public APIConfig() {
		register(VisaSystemServices.class);
	}

}