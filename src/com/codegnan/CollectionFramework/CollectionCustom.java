package com.codegnan.CollectionFramework;

import java.util.Collection;
import java.util.ArrayList;
public class CollectionCustom {
public static void main(String[] args) {
	Collection<Employee> employeeList=new ArrayList<>();
	employeeList.add(new Employee(111,"jaya",50000,"vizag"));
	employeeList.add(new Employee(222,"siri",60000,"vzm"));
	employeeList.add(new Employee(333,"nikki",70000,"hyd"));
	System.out.println("After add() of employeeList"+employeeList);
	System.out.println("---------addAll()-------");
	Collection<Employee> moreEmployees=new ArrayList<>();
	moreEmployees.add(new Employee(444,"sri",80000,"hyd"));
	moreEmployees.add(new Employee(555,"Appu",90000,"vzg"));
	moreEmployees.add(new Employee(666,"Blessy",30000,"vjy"));
	employeeList.addAll(moreEmployees);
	System.out.println("Employee after addAll()"+employeeList);
	System.out.println("---------------remove()--------------");
	employeeList.remove(444);
	System.out.println("Employee after remove(444)"+employeeList);
	Collection <Employee> removeList=new ArrayList<>();
	removeList.add(new Employee(666,"Blessy",30000,"vjy"));
	removeList.add(new Employee(555,"Appu",90000,"vzg"));
	employeeList.removeAll(removeList);
	System.out.println("Employee after removeAll :"+employeeList);
	System.out.println("-----------------retainAll()----------------");
	Collection<Employee>retainList=new ArrayList<>();
	retainList.add(new Employee(111));
	retainList.add(222);
	retainList.add(333);
	
	
	
	
	
	
	
	
}
}
