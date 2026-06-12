package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class ElectricityBill2 {

	public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		       System.out.println("Enter units consumed:");
			   int units = sc.nextInt();
			   double billAmount = (units <= 100) ? (units * 2) :
									(units <= 300) ? (units * 4) :(units * 6);
				double surcharge = (units > 500) ? (billAmount * 0.05) : 0;
				double totalBillAmount = billAmount + surcharge;
				System.out.println("Total Bill: " + totalBillAmount);
				sc.close();
			}

		

	}


