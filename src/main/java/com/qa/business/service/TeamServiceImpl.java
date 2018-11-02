package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.TeamRepository;

public class TeamServiceImpl implements TeamService {

	@Inject
	private TeamRepository repo;

	@Override
	public String getAllTeamsheets() {
		return repo.getAllTeamsheets();
	}

	@Override
	public String addTeamsheet(String Team) {
		return repo.addTeamsheet(Team);
	}

	@Override
	public String deleteTeamsheet(Long id) {
		return repo.deleteTeamsheet(id);
	}

	@Override
	public String getTeamsheet(Long id) {
		return repo.getTeamsheet(id);
	}
	
	public void setRepo(TeamRepository repo) {
		this.repo = repo;
	}

}
