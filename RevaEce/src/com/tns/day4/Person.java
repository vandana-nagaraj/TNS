package com.tns.day4;

public class Person {
	//data members
	private String name;
	private int tax;
	private String gender;
	private int age;
	private int income;
	
	//getters and setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", tax=" + tax + ", gender=" + gender + ", age=" + age + ", income=" + income
				+ "]";
	}
	
}
