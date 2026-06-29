package com.codegnan.CollectionFramework;

import java.util.Scanner;
import java.util.ArrayList;
public class DuplicateRemover {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> numbers=new ArrayList<>();
	while(sc.hasNextInt()) {
		numbers.add(sc.nextInt());
		
	}
	for(Integer a:numbers) {
		System.out.print(a+" ");
		}
	System.out.println();
	ArrayList<Integer>uniqueList=new ArrayList<>();
	for(Integer i:numbers) {
		if(!uniqueList.contains(i)) {
			uniqueList.add(i);
		}
	}
	for(Integer j:uniqueList) {
		System.out.println(j+" ");
	}
	sc.close();
}
}
