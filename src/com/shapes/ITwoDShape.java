package com.shapes;

public interface ITwoDShape {   
	
	// we just give the skeleton of the method only, then the body will be given in the child class
	
	public void draw2d();  // no need to mark this method as "abstract" because interface must have abstract method only
	
	public default void message() {
		System.out.println("Welcome to the Abstract and Interface Methods");
	}

}
