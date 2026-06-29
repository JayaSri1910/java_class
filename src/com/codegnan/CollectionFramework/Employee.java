package com.codegnan.CollectionFramework;

import java.util.Objects;

public class Employee {
	private int empId;
	private String empName;
	private double empSlaary;
	private String empAddress;
	//no args constructor, all-arg constructor, getters,setters, equals,and hashcode,toString
	public Employee(int empId, String empName, double empSlaary, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSlaary = empSlaary;
		this.empAddress = empAddress;
	}
	public Employee() {
		super();
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSlaary() {
		return empSlaary;
	}
	public void setEmpSlaary(double empSlaary) {
		this.empSlaary = empSlaary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSlaary=" + empSlaary + ", empAddress="
				+ empAddress + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empAddress, empId, empName, empSlaary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empAddress, other.empAddress) && empId == other.empId
				&& Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(empSlaary) == Double.doubleToLongBits(other.empSlaary);
	}
	

}
