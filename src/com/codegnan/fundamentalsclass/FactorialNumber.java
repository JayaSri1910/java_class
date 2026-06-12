package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int result=1;
		for(int i=1;i<=n;i++) {
			result*=i;
		}
		System.out.println("Factorial of "+n+"is:"+result);
		sc.close();
		

	}

}
