package com.codegnan.oopprogramming;

import java.util.Scanner;

public class Cuboid extends Shape {
  double length;
  double width;
  double height;
  public void calculateVolume() {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter lenght of cuboid");
	  double length=sc.nextDouble();
	  System.out.println("Enter width of cuboid");
	  double width=sc.nextDouble();
	  System.out.println("Enter height of cuboid");
	  double height=sc.nextDouble();
	  double volume=length*width*height;
	  System.out.printf("Volume of cuboid:%.2f\n",volume);
	  sc.close();
	  
  }
}
