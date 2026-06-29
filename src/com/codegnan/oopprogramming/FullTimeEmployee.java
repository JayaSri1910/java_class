package com.codegnan.oopprogramming;

public  class FullTimeEmployee extends Employee1 {
	double monthlysalary;

	public FullTimeEmployee(String name, double monthlysalary) {
		super(name);
		this.monthlysalary = monthlysalary;
	}
	@Override
	public double calculateSalary() {
		
		return monthlysalary;
		
	}
}
	