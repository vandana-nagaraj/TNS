package com.tns.day9;
//static block

public class MyClass {
	private int section;
	private static int slno;
	
	static {
		System.out.println("Within static block");
		slno=1000;
	}

	MyClass() {
		System.out.println("within defaault Constructor");
		slno++;
		section++;
	}

	
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}


	static void display() {
//		System.out.println("Section : "+section); //can't access non static members	
		System.out.println("Serial no."+slno);
	}
	
	
	
}
