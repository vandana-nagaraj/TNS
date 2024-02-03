package com.tns.day5.secondpackage;
import com.tns.day5.firstpackage.*;

public class PersonDemo {

	public static void main(String[] args) {

		Person p = new Person();
		p.setAge(23);
		p.setCity("banglore");
		p.setName("Robin");
		System.out.println(p);
		
		Base B1 = new Base();
		B1.varPublic=100;
		B1.methodPublic();
	}

}
