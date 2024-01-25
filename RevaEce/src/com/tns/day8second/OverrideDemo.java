package com.tns.day8second;
//runtime polymorphism /dynamic binding/method override
public class OverrideDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		rbi = new SBI();
		System.out.println(rbi.getRateOfIntrest());
		rbi = new HDFC();
		System.out.println(rbi.getRateOfIntrest());
		rbi = new ICIC();
		System.out.println(rbi.getRateOfIntrest());
				
	}

}
