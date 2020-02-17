package com.optimizePrime.visaSystem.api;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.optimizePrime.visaSystem.entities.Country;

@Path("/visaSystem/")
public interface CountryAPI {
	
	@GET
	@Path("/country/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Iterable<Country> listAllCountries();
	
	@GET
	@Path("countries/find/{countryId}")
	@Produces({MediaType.APPLICATION_JSON})
	public Country findByCountryId(@PathParam("countryId")int countryId);
	
	@POST
	@Path("countries/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Country registerNewCountry(@BeanParam Country newCountry);
	

}
