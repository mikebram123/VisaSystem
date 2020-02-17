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
import com.optimizePrime.visaSystem.entities.Dependant;

@Path("/visaSystem")
public interface DependantAPI {
	
	@GET
	@Path("/dependant/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Dependant> listAllDependents();
	
	@GET
	@Path("/dependant/find/{dependantId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Dependant findBydependantId(@PathParam("dependantId") int dependid);
	
	@POST // http method Post used to send data in requests.
	@Path("/dependant/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Dependant registerNewdependant(@BeanParam Dependant newDependant);
}
