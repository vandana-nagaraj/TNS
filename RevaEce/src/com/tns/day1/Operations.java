package com.tns.day1;
import java.util.*;

public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("int1:");
		int a = sc.nextInt();
		System.out.println("int1:");
		int b = sc.nextInt();
		System.out.println(("Addition of two numbers:" + (a+b))
				+("substraction of two numbers:" +  (a-b))
				+("Multiplication of two numbers:" + (a*b)
						+ ("Division of two numbers:" + (a/b)
								)));
		sc.close();
	}
}