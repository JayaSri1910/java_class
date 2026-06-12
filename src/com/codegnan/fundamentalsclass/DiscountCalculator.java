package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter original price ");
		double originalprice=sc.nextDouble();
		System.out.println("Enter discont Amount");
		double discountAmount=sc.nextDouble();
		discountAmount=(originalprice*discountAmount)/100;
		double finalprice=(originalprice-discountAmount);
		System.out.println(finalprice);
		
		sc.close();
	}

}
