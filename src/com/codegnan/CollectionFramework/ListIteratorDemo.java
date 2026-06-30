package com.codegnan.CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("JavaScript");
		list.add("C");
		ListIterator<String> itr=list.listIterator();
		System.out.println("Original list"+list);
		System.out.println("=========Forward Traversal==========");
		while(itr.hasNext()) {
			System.out.println("----------------------------------------");
			System.out.println("Next Index:"+itr.nextIndex());
			String value=itr.next();
			System.out.println("Element:"+value);
			if(value.equals("Python")) {
				itr.set("Python3");
				System.out.println("Python replaced with python3");
			}
			if(value.equals("C")){
				itr.add("SQL");
				System.out.println("SQL Added");
			}
			if(value.equals("JavaScript")) {
				itr.remove();
				System.out.println("JavaScript removed");
						 
			}
		}
		System.out.println("List After Forward Traversal");
		System.out.println(list);
		System.out.println("=============Backward Traversal===========");
		while(itr.hasPrevious()) {
			System.out.println("--------------------------------");
			System.out.println("Previous Index:"+itr.previousIndex());
			System.out.println("Element:"+itr.previous());
			
		}
		System.out.println("\nFinal list");
		System.out.println(list);

	}

}
