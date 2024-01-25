package com.tns.day8;
//METHOD OVERLOADING
public class MethodOverLoadingDemo {
		
	public static float add(float a , float b) {
		return (a+b);
	}
	
	public static int add(int a , int b) {
		return (a+b);
	}
	
	public static float add(int a , float b) {
		return (a+b);
	}
	public static float add(float a , int b) {
		return (a+b);
	}
	public static String add(String a , String b) {
		return (a+b);
	}

	@Override
	public String toString() {
		return "MethodOverLoadingDemo []";
	}
	
	
}
