package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int firstterm=0;
		int secondterm=1;
		System.out.print(firstterm+" "+secondterm+" ");
		for(int i=2;i<=number;i++) {
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			System.out.print(nextterm+" ");
		}
		
		sc.close();

	}

}
