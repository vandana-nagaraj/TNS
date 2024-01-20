package com.tns.day5;
import java.util.*;

public class CustomerDemo {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String name,cid,city;
		System.out.println("Enter Customer Name:");
		 name = sc.nextLine();
	
		System.out.println("Enter Customer City:");
		city = sc.next();
		
		System.out.println("Enter Customer ID:");
	 cid = sc.next();
		
		//default constructor
		Customer C = new Customer();
		C.setCustomerCity(city);
		C.setCustomerId(cid);
		C.setCustomerName(name);
		
		System.out.println(C);
		
		
		//parametrized constuctor
		Customer C1 = new Customer(name,cid , city);
		System.out.println("Enter Customer Name:");
		name = sc.nextLine();
		sc.nextLine();
		
		
		System.out.println("Enter Customer City:");
		city = sc.nextLine();
		
		System.out.println("Enter Customer ID:");
		 cid = sc.nextLine();
		
		C1.setCustomerCity(city);
		C1.setCustomerId(cid);
		C1.setCustomerName(name);
		
		sc.close();
		System.out.println(C1);
		
		
		
	}

}
