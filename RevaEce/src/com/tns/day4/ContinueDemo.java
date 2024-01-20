package com.tns.day4;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int k=5;k<15;k++)
		{
			if(k%2!=1)
				continue;
			System.out.println(k+"");
		}
	}

}
