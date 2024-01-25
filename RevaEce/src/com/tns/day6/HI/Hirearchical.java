package com.tns.day6.HI;

public class Hirearchical {

	public static void main(String[] args) {
		
		Union u=new Union();
		u.setLoan(123);
		u.setIntrest(23);
		u.setBankState("Karnataka");
		u.setIntrestPer(21);
		System.out.println(u);
		
		SBI s = new SBI();
		s.setFullName("State Bank of India");
		s.setIntrest(23);
		s.setIntrestPer(25);
		s.setLoan(123);
		System.out.println(s);
	}

}
