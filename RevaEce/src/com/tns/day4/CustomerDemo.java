package com.tns.day4;
import java.util.*;

public class CustomerDemo {

	public static void main(String[] args) {
		
		String name , city , id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter City:");
		city = sc.next();
		System.out.println("Enter ID:");
		id =  sc.next();
		
		Customer C1 = new Customer();//default constructor
		C1.setCustomerCity(city);
		C1.setCustomerId(id);
		C1.setCustomerName(name);
		
		System.out.println(C1);
		
		Customer C2 = new Customer(name,city,id);//parametrized constructor
		
		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("Enter City:");
		city = sc.next();
		System.out.println("Enter ID:");
		id =  sc.next();
		
		C2.setCustomerCity(city);
		C2.setCustomerId(id);
		C2.setCustomerName(name);
		
		System.out.println(C2);
		sc.close();
		
		

	}

}
