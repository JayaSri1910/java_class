package com.codegnan.Exception;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) throws InsufficientFundsException {
		Scanner sc=new Scanner(System.in);
		ATM atm=new ATM();
		boolean authenticated=false;
		while(!authenticated) {
			System.out.println("Enter your pin:");
			int enteredPin=sc.nextInt();
			try {
				authenticated=atm.verifyPin(enteredPin);
			} catch (InvalidPinException e) {
				e.printStackTrace();
			}
		}
		while(true) {
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			try {
				switch(choice) {
				case 1:
					System.out.println("Enter Amount to deposit");
					double depositAmount=sc.nextDouble();
					atm.deposit(depositAmount);
					break;
				case 2:
					System.out.println("Enter amount to withdraw");
					double withdrawAmount=sc.nextDouble();
					atm.deposit(withdrawAmount);
					break;
				case 3:
					atm.checkBalance();
					break;
				case 4:
					System.out.println("Thankyou for using ATM Machine");
					return;
				default:
					System.out.println("Invalid Choice please enter valid option (1-4)");
					break;
				}
			}
			catch(InvalidAmountException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
