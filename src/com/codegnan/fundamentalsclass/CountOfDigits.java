package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");//123
		int n=sc.nextInt();
		int originalNumber=n;
		int count=0;
		while(n!=0) {//123!=0//12!=0//1!=0
			n=n/10; //123/10=12//12/10=1//1/10=0.1---->we take the datatype as int 
			count++;
		}
		System.out.println("The count of digits in a given number:" +originalNumber+"is"+count);
		sc.close();

	}

}
