package com.tns.day3;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b =20;
		//int x =10;
		System.out.println(++a);
		int c=++a + b + a--;
		System.out.println(c);
		int d = c++ + a + b--;
		System.out.println(d);
		System.out.println("Value of a , b and c is" + " "  + a +" " + b +" " + c );
		//int z=100 ;int y =90;
		int y= b>a?b:a;
		System.out.println(y);
		

	}

}
