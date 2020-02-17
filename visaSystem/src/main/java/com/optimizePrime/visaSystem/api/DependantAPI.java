package com.optimizePrime.visaSystem.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.optimizePrime.visaSystem.entities.Dependant;

@Path("/visaSystem")
public interface DependantAPI {
	
	@GET
	@Path("/dependants/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Dependant> listAllDependents();
	
	@GET
	@Path("/dependants/find/{dependid}")
	@Produces({MediaType.APPLICATION_JSON})
	public Dependant findBydependid(@PathParam("DependantId") int dependid);
	
}
