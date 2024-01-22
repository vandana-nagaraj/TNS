package com.tns.day4;

public class Employee {
	//Data members
		private String name;
		private String dept;
		private int salary;
		private int id;
		private int age;
		
	//getters and setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", id=" + id + ", age=" + age
					+ "]";
		}
	
	
		
		
}
