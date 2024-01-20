package com.tns.day3;

public class NestedIfElse {

	public static void main(String[] args) {
		int marks = 85;
		if(marks >=85 && marks <=100)
			System.out.println("Distinction");
		else if(marks >=65 && marks <=84)
			System.out.println("First class");
		else if(marks >=35 && marks <=64)
			System.out.println("just pass");
		else
			System.out.println("Invalid marks");
	}

}
