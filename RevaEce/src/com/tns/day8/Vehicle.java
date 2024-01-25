package com.tns.day8;
//overload
public class Vehicle {

	public Vehicle(String Brand) {
		System.out.println(Brand);
	}
	public Vehicle(String Brand,int cost) {
		System.out.println(Brand +" "+ cost);
	}
	public Vehicle(String fuel,String Brand) {
		System.out.println(fuel + " " +Brand);
	}
	public Vehicle(int cost,String Brand) {
		System.out.println(cost + " "+ Brand);
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle("BMW");
		Vehicle v1 = new Vehicle("BMW",120987);
		Vehicle v2= new Vehicle("Petrol","Audi");
		Vehicle v3= new Vehicle(12345678,"BMW");
	}
}
