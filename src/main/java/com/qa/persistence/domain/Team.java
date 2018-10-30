package com.qa.persistence.domain;

import java.util.ArrayList;

public class Team {
	private ArrayList<Integer> teamList = new ArrayList<>();
	
	private ArrayList<Integer> atk = new ArrayList<>();

	private ArrayList<Integer> mid = new ArrayList<>();
	
	private ArrayList<Integer> def = new ArrayList<>();

	private double possession;
	
	public Team(ArrayList<Integer> team){
		this.teamList = team;
		teamSplitter();
	}
	
	public void teamSplitter(){
		ArrayList<Integer> formation = new ArrayList<>();
		for(int i = 11; i < 14; i++) formation.add(teamList.get(i));
		int count = 0;
		for(int i = 0; i <= formation.get(0); i++) this.def.add(teamList.get(i));
		count += formation.get(0);
		for(int i = 1; i <= formation.get(1); i++) this.mid.add(teamList.get(i+count));
		count += formation.get(1);
		for(int i = 1; i <= formation.get(2); i++) this.atk.add(teamList.get(i+count));		
	}
	
	
	public ArrayList<Integer> getTeamList() {
		return teamList;
	}

	public void setTeamList(ArrayList<Integer> teamList) {
		this.teamList = teamList;
	}

	public ArrayList<Integer> getAtk() {
		return atk;
	}

	public void setAtk(ArrayList<Integer> atk) {
		this.atk = atk;
	}

	public ArrayList<Integer> getMid() {
		return mid;
	}

	public void setMid(ArrayList<Integer> mid) {
		this.mid = mid;
	}

	public ArrayList<Integer> getDef() {
		return def;
	}

	public void setDef(ArrayList<Integer> def) {
		this.def = def;
	}

	public double getPossession() {
		return possession;
	}

	public void setPossession(double possession) {
		this.possession = possession;
	}

}