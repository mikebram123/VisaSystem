package com.optimizePrime.visaSystem.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.optimizePrime.visaSystem.entities.TravelHistory;

@Path("/visaSystem")
public interface TravelHistoryAPI {
	
	@GET
	@Path("travel history/list")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Iterable<TravelHistory>listAllTravelHistory();
	
	@GET
	@Path("travel history/find/{travelHistoryId}")
	@Produces({MediaType.APPLICATION_JSON})
	public TravelHistory findByTravelHistoryId(@PathParam("travelHistoryId")int travelHistoryId);
	
	@POST
	@Path("travelHistory/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public TravelHistory registerNewTravelHistory(@BeanParam TravelHistory newTravelHistory);

}
