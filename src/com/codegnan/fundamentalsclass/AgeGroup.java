package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		String res=(age<12)?"Child":
			(age>12 && age<19)?"Teenager":
			(age>20&&age<64)?"Adult":"Senior";
		System.out.println(res);			
		sc.close();
		

	}

}
