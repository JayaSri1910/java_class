package com.codegnan.oopprogramming;

public class ContractEmployee extends Employee1 {
	double contractamount;

	public ContractEmployee(String name, double contractamount) {
		super(name);
		this.contractamount = contractamount;
	}
	@Override
	public double calculateSalary() {
		return contractamount;
	}

}
