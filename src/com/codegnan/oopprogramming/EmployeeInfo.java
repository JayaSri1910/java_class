package com.codegnan.oopprogramming;

import java.util.Scanner;

public class EmployeeInfo extends Employee {
	double salaryPerYear;

public EmployeeInfo(){
	super("","",0);
	}
public void inputEmployeeDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Name");
	employeeName=sc.nextLine();
	System.out.println("Enter Employee DEsignation");
	designation=sc.nextLine();
	System.out.println("Enter Years of Expereince");
	yearsOfExperience=sc.nextInt();
	System.out.println("Enter salary per year");
	salaryPerYear=sc.nextDouble();
}
public void displayEmployeeInfo() {
	System.out.println("Employee Name:"+employeeName);
	System.out.println("Empoyee Designation:"+designation);
	System.out.println("Years of expereience:"+yearsOfExperience+"years");
}
public void calculateSalary() {
	double salary=yearsOfExperience*salaryPerYear;
	System.out.println("Salary:"+salary);
}
	
}



