package com.codegnan.fundamentalsclass;
import java.util.Scanner;
public class CalculateRemainAmount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase amount");
		double purchaseAmount=sc.nextDouble();
		double discount=(purchaseAmount>100)?0.2:(purchaseAmount>50)?0.1:0.0;
		double discountAmount=purchaseAmount*discount;
		double remainingAmount=purchaseAmount-discountAmount;
		System.out.println("Discount Amount:"+discountAmount);
		System.out.println("after discount remaining amount:"+remainingAmount);
        sc.close();
	};
	

}
