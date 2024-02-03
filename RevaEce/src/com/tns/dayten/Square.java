package com.tns.dayten;

public class Square extends Shape {
	
	private float side;

	public Square() {
		side= 4.0f;
	}

	public Square(float side) {
		super();
		this.side = side;
	}
	@Override
	void calArea()
	{
		area = side * side;
	}
	
	

}