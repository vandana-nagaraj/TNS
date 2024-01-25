package com.tns.day8;
//OVERLOADING
public class OverLoadingDemo {

	public static void main(String[] args) {
		
		System.out.println("--------constructor overloading---------");
		Point p = new Point();//default constructor is invoked
		System.out.println(p);
		Point p1 = new Point(12f);
		System.out.println(p1);
		Point p2 = new Point(11f,2.32f);
		System.out.println(p2);
		
		System.out.println("---------------Method overloading--------");
		
		System.out.println(MethodOverLoadingDemo.add(12.67f, 13.4f ));
	}

}
