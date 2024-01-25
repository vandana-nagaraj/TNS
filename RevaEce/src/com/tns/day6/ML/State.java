package com.tns.day6.ML;

public class State extends Country {
	private String stateName;
	private String stateLanguage;
	
	
	public State(String stateName, String stateLanguage) {
		super();
		this.stateName = stateName;
		this.stateLanguage = stateLanguage;
	}
	
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateLanguage() {
		return stateLanguage;
	}
	public void setStateLanguage(String stateLanguage) {
		this.stateLanguage = stateLanguage;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", stateLanguage=" + stateLanguage + "]";
	}
	
	
}
