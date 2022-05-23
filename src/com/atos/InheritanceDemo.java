package com.atos;


import org.w3c.dom.css.Rect;

import com.org.*;   // in "org" package its default, so we couldn't access the class in that 
						  // "org" package in the main class , that's why we are importing that 
						 // "org" package in the "atos" package  

import com.shapes.*;
public class InheritanceDemo {

	public static void main(String[] args) {
/*		Employee emp1= new Employee(101, "Surya", "Asso Con");
		System.out.println(emp1); // we are printing the object, so we can override it in the "org" package
		Employee emp2 = new Employee(102, "Meena", "Asso Con");
		System.out.println(emp2);   // to print the object directly that's why we override the toString() method
*/		
//      early binding
		
/*		Manager mgr = new Manager(101, "Surya", "Junior developer", 202);
		Manager mgr1 = new Manager(202, "Vidhesh", "Associate Consultant", 301);
		System.out.println(mgr);
		System.out.println(mgr1);
		mgr1.display();
		
		// late binding  -- dynamic polymorphism
		Employee mgr2 = new Manager(103, "Vidhya", "MBA", 200);
		mgr2.display();
		System.out.println(mgr2); */
		
		
		// FOR STUDENT CLASS
		
/*		Student st = new Student();

		st.setStudentid(1);
		st.setStudentname("Meena");
		st.setStudentmarks(55);
		st.setStudentstatus(false);
		System.out.println(st);

		
		st.setStudentmarks(89);
		System.out.println(st);
		System.out.println("=================================");
		Student st1 = new Student(2, "surya", 80, true);
		System.out.println(st1);
		st1.setStudentmarks(100);
		System.out.println(st1);    */
		
		
		// FOR SHAPE (ABSTRACT) AND ITWODSHAPE (INTERFACE) CLASSES
		
//		Circle obj = new Circle(6);
//		obj.draw();
//		obj.display();
//		
//		Rectangle obj1 = new Rectangle(4, 6);
//		obj1.draw();
		
		Square obj2 = new Square(5);
		obj2.display();
		obj2.draw();
		obj2.draw2d();
		obj2.message();
		obj2.draw3d();
		
		System.out.println("Welcome to github");

	}

}
