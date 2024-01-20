package com.tns.day4;
import java.util.*;

public class PersonDemo {

	public static void main(String[] args) {
		
		
		Person obj=new Person();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name:");
		String name = sc.nextLine();
		
		System.out.println("Gender:");
		String gender = sc.next();
		
		System.out.println("Income:");
		int income = sc.nextInt();
		System.out.println("Age:");
		int age = sc.nextInt();
		//System.out.println("Tax:");
		//int tax = sc.nextInt();
		
		obj.setAge(age);
		obj.setGender(gender);
		obj.setIncome(income);
		obj.setName(name);
		//obj.setTax(tax);
		
		System.out.println(obj);
		
		sc.close();
	}

}
