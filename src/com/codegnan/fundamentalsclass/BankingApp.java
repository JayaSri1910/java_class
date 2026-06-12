package com.codegnan.fundamentalsclass;
import java.util.Scanner;
public class BankingApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=sc.nextInt();
		int deposit=sc.nextInt();
		balance+=deposit;
		boolean isEvenAndGreaterThan1000=(balance>1000)&&(balance%2==0);
		System.out.println(balance);
		System.out.println(isEvenAndGreaterThan1000);
	}
}
		


