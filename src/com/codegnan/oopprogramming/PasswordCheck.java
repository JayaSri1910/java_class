package com.codegnan.oopprogramming;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=sc.nextLine();
		PasswordChecker simpleChecker=new SimplePasswordChecker();
		System.out.println(simpleChecker.checkLength(password));
		System.out.println(simpleChecker.checkComplexity(password));
		
		
		sc.close();
	}

}
