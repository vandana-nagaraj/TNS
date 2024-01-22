//program to demonstrate packages and access modifiers
package com.tns.day5.firstpackage;

public class Base {
	//declaring default , public , private , protected variables
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	void methodDefault() {
		System.out.println("DefaultVariable:"+ varDefault);
		System.out.println("Default method");
	}
	
	public void methodPublic() {
		System.out.println("publicVariable:"+ varPublic);
		System.out.println("public method");
	}
	private void methodPrivate() {
			System.out.println("PrivateVariable"+varPrivate);
			System.out.println("privatemethod");
	}
	protected void methodProtected() {
		System.out.println("protectedVariable:"+ varProtected);
		System.out.println("protected method");
	}
}
