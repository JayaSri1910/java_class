package com.codegnan.oop;

import java.util.Scanner;

public class Car {
	private String model;
	private int year;
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static void main(String[] args) {
		Car c1=new Car("toyota carmi",2022);
		Scanner sc=new Scanner(System.in);
		String userEnteredModel=sc.nextLine();
		c1.setModel(userEnteredModel);
		int userEnteredYear=sc.nextInt();
		c1.setYear(userEnteredYear);
		System.out.println("Model:"+c1.getModel());
		System.out.println("year:"+c1.getYear());
		sc.close();
	}
	

}
