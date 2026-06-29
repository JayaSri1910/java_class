package com.codegnan.oopprogramming;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		My_Calculation obj=new My_Calculation(a,b);
		int sum=obj.addition();
		int product=obj.multiplication();
		System.out.println(sum);
		System.out.println(product);
		
		
		sc.close();
		

	}

}
