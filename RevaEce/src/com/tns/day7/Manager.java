package com.tns.day7;

public class Manager {
	
	private int teamSize;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int teamSize) {
		super();
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + "]";
	}
	

}
