package com.tns.day3;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=1;k<=4;k++)
		{
			for(int l=3;l>=k;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}