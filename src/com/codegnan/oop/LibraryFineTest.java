package com.codegnan.oop;

import java.util.Scanner;

import com.codegnan.fundamentalsclass.LibraryFineCalculator;

public class LibraryFineTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int daysOverdue=sc.nextInt();
		int days=sc.nextInt();
		String bookType=sc.nextLine();
		int staticFine=LibraryFineCalculator.calculateTotalFine(daysOverdue);
		LibraryFineCalculator calculator=new LibraryFineCalculator();
		int instanceFine=calculator.
		sc.close();
		

	}

}
