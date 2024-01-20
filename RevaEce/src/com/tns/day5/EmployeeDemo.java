
package com.tns.day5;
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee E = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Department:");
		String dept = sc.next();
		System.out.println("Salary:");
		int salary = sc.nextInt();
		System.out.println("Eid:");
		int eid = sc.nextInt();
		System.out.println("Age:");
		int age = sc.nextInt();
		
		E.setAge(age);
		E.setDept(dept);
		E.setId(eid);
		E.setName(name);
		E.setSalary(salary);
		
		System.out.println(E);
		sc.close();
	}

}
