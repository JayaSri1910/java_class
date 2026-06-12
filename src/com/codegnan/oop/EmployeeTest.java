package com.codegnan.oop;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setDetails("malli",50000);
		double grossSalary=emp.grossSalary();
		System.out.println("Employee Name:"+emp.name);
		System.out.println("Employee basic salary:"+emp.basicSalary);
		System.out.println("HRA Allowance:"+emp.calculateHRA());
		System.out.println("DA Allowance:"+emp.calculateDA());
		System.out.println("Gross Salary:"+emp.grossSalary());

	}

}
