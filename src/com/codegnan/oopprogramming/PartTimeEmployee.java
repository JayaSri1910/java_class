package com.codegnan.oopprogramming;

public class PartTimeEmployee extends Employee1 {
	double hourlyrate;
	int hoursWorked;
	public PartTimeEmployee(String name, double hourlyrate, int hoursWorked) {
		super(name);
		this.hourlyrate = hourlyrate;
		this.hoursWorked = hoursWorked;
	}
	public double calculateSalary() {
		return hourlyrate*hoursWorked;
		
	}

}
