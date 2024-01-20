package com.tns.day2;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit typecasting
		float f = 45.8f;
		double d = f;
		System.out.println(d);
		
		short s = 3;
		float i =s;
		System.out.println(i);
		
		char ch='A';
		int m = ch;
		System.out.println(m);
		
		//explicit type casting - narrowing 
		double c = 10d;
		float a = (float)c;
		System.out.println(a);
		
		char r = 'a';
		byte e = (byte)r;
		System.out.println(e);		
	}

}
