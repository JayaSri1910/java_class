package com.codegnan.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	for(int i=0;i<=10;i++) {
		v.add(i);
	}
	System.out.println(v);
	Enumeration<Integer> e=v.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}

//1.we can apply enumeration concept only for legacy classes and it is not a universal
//2.By using Enumeration we can get only read accesses and we can't perform remove operations
//to overcome these limitations sun people introduced the Iterator concept in 1.2 v
