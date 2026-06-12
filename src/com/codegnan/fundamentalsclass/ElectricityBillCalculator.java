package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of unite Electricity consumed");
		int units=sc.nextInt();
		System.out.println("Are You Senior Citizen?");
		boolean isSeniorCitizen=sc.nextBoolean();
		double billAmount=0;
		if(units<=100) {
			billAmount=units*1.5;
		}else {
			if(units<=200) {
				billAmount=(100*1.5)+((units-100)*2);
			}else {
				if(units<=300) {
					billAmount=(100*1.5)+(100*2)+(units-200)*3;
				}else {
					billAmount=(100*1.5)+(100*2)+(100*3)+(units-300)*5;
				}
			}
		}
		double surcharge=0;
		if(billAmount>1000) {
			surcharge=billAmount*0.10;
		}
		double discount=0;
		if(isSeniorCitizen) {
			discount=billAmount*0.05;
		}
		double totalpayable=billAmount+surcharge-discount;
		System.out.println("Electricity Bill");
		System.out.println("=========================");
		System.out.println("Units Consumed:"+units);
		System.out.println("Base Bill:"+billAmount);
		System.out.println("Surcharge:"+surcharge);
		System.out.println("Discount applied:"+discount);
		System.out.println("Total Amount:"+totalpayable);
		sc.close();

	}

}
