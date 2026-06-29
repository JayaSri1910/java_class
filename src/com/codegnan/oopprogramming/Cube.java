package com.codegnan.oopprogramming;

import java.util.Scanner;

public class Cube extends Shape {
	double side;
	public void calculateVolume() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of the cube");
		double side=sc.nextDouble();
		double volume=side*side*side;
		System.out.printf("Volume of cube:%.2f\n",volume);
	}

}
