package com.shapes;

public class Square extends Shape implements ITwoDShape, IThreeDShape {  // we are using both abstract and interface

	
	public Square(int side) {   // creating a constructor for passing a value 
		this.side = side;
	}
	
	@Override
	public void draw() {
		int area = side * side ;
		System.out.println("Area of a square is: " + area);
		
	}

	@Override
	public void draw2d() {
		System.out.println("We drawn a 2d square");
		
	}

	@Override
	public void draw3d() {
		System.out.println("We drawn a 2d square");
		
	}

}
