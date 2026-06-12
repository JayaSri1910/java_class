package com.codegnan.oop;

import java.util.Scanner;

public class Book {
	int id;
	String type;
	public int getId() {
		return id;
	}
	public Book(int id) {
		super();
		this.id = id;
	}
	public Book(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public int calculateFine(int days) {
		int fine=days*5;
		if(fine>=1000) {
			fine=1000;
		}
		return fine;
	}
	public int calculateFine(int days,String type) {
		int fine=0;
		if(type.equalsIgnoreCase("regular")) {
			fine=days*2;
		}else {
			if(type.equalsIgnoreCase("premium")) {
				fine=days*3;
			}
		}
		if(fine>=1000) {
			fine=1000;
		}
		return fine;
	}
	public int calculate(int days,int fixedCost) {
		int fine=days*5+fixedCost;
		if(fine>1000) {
			fine=1000;
		}
		return fine;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int days1=sc.nextInt();
		int days2=sc.nextInt();
		String type1=sc.next();
		sc.next();
		int days3=sc.nextInt();
		int fixedCost=sc.nextInt();
		int id1=sc.nextInt();
		int id2=sc.nextInt();
		String type2=sc.next();
		Book book1=new Book(id1);
		Book book2=new Book(id2,type2);
		System.out.println(book1.calculateFine(days1));
		System.out.println(book1.calculateFine(days2, type1));
		System.out.println(book1.calculate(days3, fixedCost));
		System.out.println(book2.getId());
		sc.close();
		
	}
	

}
