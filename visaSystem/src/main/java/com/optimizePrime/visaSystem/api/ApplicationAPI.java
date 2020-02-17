package com.optimizePrime.visaSystem.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.optimizePrime.visaSystem.entities.Application;

@Path("/visaSystem/") // URL pattern to access the current API Interface.
public interface ApplicationAPI {
	
	// http://localhost:7777/visaSystem/application/list
			@GET // we do support http Method: GET
			@Path("/application/list") // URL Path to access this method.
			@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) // formats which the method supports.
			public Iterable<Application> listAllApplication();
			
			@GET
			@Path("/application/find/{applicationid}")
			@Produces({MediaType.APPLICATION_JSON})
			public Application findByApplicationId(@PathParam("applicationid") int applicationid);
			
			@POST // http method Post used to send data in requests.
			@Path("/application/register")
			@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
			@Produces(MediaType.APPLICATION_JSON)
			public Application registerNewApplication(@BeanParam Application newApplication);
			
		}

