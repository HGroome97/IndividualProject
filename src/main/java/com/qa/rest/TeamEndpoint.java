package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import com.qa.business.service.TeamService;

@Path("/teamsheet")
public class TeamEndpoint {

	@Inject
	private TeamService service;
	
	@Path("/getAllTeamsheets")
	@GET
	@Produces({ "application/json" })
	public String getAllAccounts() {
		return service.getAllTeamsheets();
	}

	@Path("/createTeamsheet")
	@POST
	@Produces({ "application/json" })
	public String addAccount(String account) {
		return service.addTeamsheet(account);
	}

	@Path("/deleteTeamsheet/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteAccount(@PathParam("id") Long id) {
		return service.deleteTeamsheet(id);
	}
	
	@Path("/getTeamsheet/{id}")
	@GET
	@Produces({ "application/json" })
	public String getAccount(@PathParam("id") Long id) {
		return service.getTeamsheet(id);
	}

	public void setService(TeamService service) {
		this.service = service;
	}


}
