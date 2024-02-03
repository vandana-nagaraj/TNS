//program to demonstrate abstraction
package com.tns.dayten;

//abstract class
public abstract class Shape {
	protected float area;
	//abstract method
	abstract void calArea();
	
	//concrete method
	void show()
	{
		System.out.println("Area is :"+area);
	}

}