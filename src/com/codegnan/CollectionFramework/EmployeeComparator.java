package com.codegnan.CollectionFramework;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmpName().compareTo(o2.getEmpName());
		return o1.getEmpAddress().compareTo(o2.getEmpAddress());
		return Integer.o1.getEmpId().compareTo(o2.getEmpId());
		return Double.o1.getEmpSlaary().compareTo(o2.getEmpSlaary());
	}
	

}
