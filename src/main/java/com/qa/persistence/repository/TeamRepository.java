package com.qa.persistence.repository;

public interface TeamRepository {
	
	String getAllTeamsheets();
	
	String addTeamsheet(String Team);

	String deleteTeamsheet(Long id);
	
	String getTeamsheet(Long id);


}
