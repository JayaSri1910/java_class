package com.codegnan.oop;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static long factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0||n>20) {
			System.out.println("Invalid input. N must be 0 to 20");
		}else {
			long factorial=FactorialUsingRecursion.factorial(n);
			System.out.println(factorial);
		}
		sc.close();

	}

}
