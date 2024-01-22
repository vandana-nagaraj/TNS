package com.tns.day4;
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) {
		String name,dept;
		int id,salary,age;
		Employee E = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		name = sc.nextLine();
		System.out.println("Enter Dept:");
		dept = sc.next();
		System.out.println("Enter id:");
		id = sc.nextInt();
		System.out.println("Enter salary:");
		salary = sc.nextInt();
		System.out.println("Enter age:");
		age = sc.nextInt();
		
		E.setAge(age);
		E.setDept(dept);
		E.setId(id);
		E.setDept(dept);
		E.setId(id);
		E.setName(name);
		E.setSalary(salary);
		
		System.out.println(E);
		sc.close();
		

	}

}
