package com.codegnan.oopprogramming;

public class Emp1Calculation {
public static void main(String[] args) {
	Employee1 emp1=new FullTimeEmployee("jaya",5000);
	Employee1 emp2=new PartTimeEmployee("Appu",8000,70);
	Employee1 emp3=new ContractEmployee("Nikki",15000);
	emp1.display();
	System.out.println("Salary:"+emp1.calculateSalary());
    emp2.display();
    System.out.println("Salary:"+emp2.calculateSalary());
    emp3.display();
    System.out.println("Salary:"+emp3.calculateSalary());
	
	
	
}
}
