package com.org;

public class Manager extends Employee{
	int managerid;   // creating member variable to the manager class

	public Manager(int employeeid, String employeename, String employeedesignation, int managerid) {
		super(employeeid, employeename, employeedesignation); // super() method only include the parent arguments
		this.managerid = managerid;  // creating a "this" to that new added argument
	}

	@Override
	public String toString() {
		return "Manager [managerid=" + managerid + ", employeeid=" + employeeid + ", employeename=" + employeename
				+ ", employeedesignation=" + employeedesignation + "]";
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Calling details are as follows");
	}
	
}
	

