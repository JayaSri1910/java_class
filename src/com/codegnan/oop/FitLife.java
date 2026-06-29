package com.codegnan.oop;

import java.util.Scanner;

public class FitLife {
	int hours;
	String type;
	public FitLife(int hours) {
		super();
		this.hours = hours;
	}
	public FitLife(int hours, String type) {
		super();
		this.hours = hours;
		this.type = type;
	}
	public int calculateCalories(int hours) {
		int calories=hours*100;
		if(calories>=1000) {
			calories=1000;
		}
		return calories;
	}
	public int calculateFine(int hours,String type) {
		int calories=0;
		if(type.equalsIgnoreCase("cardino")) {
			calories=hours*120;
		}else {
			if(type.equalsIgnoreCase("strength")) {
				calories=hours*80;
			}
		}
		if(calories>=1000) {
			calories=1000;
		}
		return calories;
	}
		public int calculateFine(int hours,int fixedCalories) {
			int calories=hours*100+fixedCalories;
			if(calories>=1000) {
				calories=1000;
			}
			return calories;
		
		
	}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour1=sc.nextInt();
		int hour2=sc.nextInt();
		String type=sc.next();
		sc.nextLine();
		int hour3=sc.nextInt();
		int fixedCalories=sc.nextInt();
		int id1=sc.nextInt();
		int id2=sc.nextInt();
		String type2=sc.next();
		FitLife fc1=new FitLife(id1);
		FitLife fc2=new FitLife(id2,type2);
		System.out.println(fc1.calculateCalories(hour1));
		System.out.println(fc1.calculateFine(hour2, type2));
		System.out.println(fc1.calculateFine(hour3,fixedCalories));
		sc.close();

	};

}
