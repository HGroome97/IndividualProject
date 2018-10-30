package com.qa.business.service;

public interface TeamService {

	String getAllTeamsheets();
	
	String addTeamsheet(String Team);

	String deleteTeamsheet(Long id);
	
	String getTeamsheet(Long id);

}
