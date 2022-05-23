package com.shapes;

public class Rectangle extends Shape{
	
	public Rectangle(int l, int b) {
		this.length = l;
		this.breadth = b;
	}

	@Override
	public void draw() {
		int area = length * breadth;
		System.out.println("Area of the Rectangle : " + area);	
	}

}
