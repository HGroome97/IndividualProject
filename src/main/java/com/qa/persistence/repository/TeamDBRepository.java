package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.qa.business.service.TeamService;
import com.qa.persistence.domain.Team;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TeamDBRepository implements TeamRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;
	
	@Override
	public String getAllTeamsheets() {
		return null;
	}

	@Override
	public String addTeamsheet(String Team) {
		return null;
	}

	@Override
	public String deleteTeamsheet(Long id) {
		return null;
	}

	@Override
	public String getTeamsheet(Long id) {
		return null;
	}

}
