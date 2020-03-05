package com.optimizePrime.visaSystem.api;

import java.util.Set;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.optimizePrime.visaSystem.entities.Applicant;
import com.optimizePrime.visaSystem.entities.Application;

@Path("/visaSystem/")
public interface ApplicantAPI {
	
	@GET  
	@Path("/applicant/list")   
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
	public Iterable<Applicant> listAllApplicants();
	
	@GET
	@Path("/applicant/find/{applicantId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Applicant findByapplicantId(@PathParam("applicantId")int applicantId);
	
	@POST // http method Post used to send data in requests.
	@Path("/applicant/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Applicant registerNewApplicant(@BeanParam Applicant newApplicant);
	
	@GET
	@Path("/applicant/applications/{applicantId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Set<Application> getApplicantApplications(@PathParam("applicantId") int applicantId);
	
	@POST
	@Path("/applicant/applications/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Application registerApplicationForApplicant(@FormParam("applicantId")int applicantId, @BeanParam Application newApplication);

}
