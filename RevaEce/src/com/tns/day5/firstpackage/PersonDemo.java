package com.tns.day5.firstpackage;
import java.util.*;
public class PersonDemo {

	public static void main(String[] args) {
		
		String name , city;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Personal Details");
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter City:");
		city = sc.next();
		System.out.println("Enter age:");
		age = sc.nextInt();
		
		Person p = new Person();
		p.setName(name);
		p.setCity(city);
		p.setAge(age);
		System.out.println(p);
		sc.close();
		

	}

}
