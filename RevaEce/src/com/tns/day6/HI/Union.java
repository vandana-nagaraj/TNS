package com.tns.day6.HI;

public class Union extends RBI {
	private String bankState;
	private int intrestPer;
	public String getBankState() {
		return bankState;
	}
	public void setBankState(String bankState) {
		this.bankState = bankState;
	}
	public int getIntrestPer() {
		return intrestPer;
	}
	public void setIntrestPer(int intrestPer) {
		this.intrestPer = intrestPer;
	}
	@Override
	public String toString() {
		return "Union [bankState=" + bankState + ", intrestPer=" + intrestPer + "]";
	}
	
	
}
