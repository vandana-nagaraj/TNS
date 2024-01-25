package com.tns.day6.HI;

public class RBI {
	private long Loan;
	private long Intrest;
	public long getLoan() {
		return Loan;
	}
	public void setLoan(long loan) {
		Loan = loan;
	}
	public long getIntrest() {
		return Intrest;
	}
	public void setIntrest(long intrest) {
		Intrest = intrest;
	}
	@Override
	public String toString() {
		return "RBI [Loan=" + Loan + ", Intrest=" + Intrest + "]";
	}
	
}
