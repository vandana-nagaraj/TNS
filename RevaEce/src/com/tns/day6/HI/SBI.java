package com.tns.day6.HI;

public class SBI extends RBI{
	private String fullName;
	private int intrestPer;
	

	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getIntrestPer() {
		return intrestPer;
	}
	public void setIntrestPer(int intrestPer) {
		this.intrestPer = intrestPer;
	}
	@Override
	public String toString() {
		return "SBI [fullName=" + fullName + ", intrestPer=" + intrestPer + "]";
	}
	
	
}
