package com.tns.day3;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a[] = {1.9f,2.5f,3.6f,4.7f,5.7f};
		for(float f:a)
		{
			System.out.println(f);
		}
		
		int b[]= {1,2,3,4,5};
		for(int i:b)
			System.out.println(i);
		
		char c[]= {'a','b','c','d','e'};
		for(char ch:c) {
			System.out.println(ch);
		}
		
		String d[] = {"java","program","learning"};
		for(String S:d) {
			System.out.println(S);
		}
			
	}

}
