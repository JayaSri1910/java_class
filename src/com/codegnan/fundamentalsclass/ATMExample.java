package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class ATMExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance=5000.0;
		int pin=1234;
		System.out.println("Enter your pin:");
		int enteredPin=sc.nextInt();
		if(enteredPin!=pin){
			System.out.println("Incorect Pin.existing");
			return;
		}
		int choice;
		do {
			System.out.println("||===================================================================||");
			System.out.println("||=====================ATM Menu===========================||");
			System.out.println("||===================================================================||");
			System.out.println("||===================1.check balane==================================||");
			System.out.println("||===================2.Deposit=======================================||");
			System.out.println("||===================3.Withdraw=====================================||");
			System.out.println("||===================4.Exit=====================================||");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
		    switch(choice) {
		    	case 1:
		    		System.out.println("check balance:"+balance);
		    		break;
		    	case 2:
		    		System.out.println("Enter deposit amount");
		    		double depositamount=sc.nextDouble();
		    		if(depositamount%100!=0) {
		    			System.out.println("Enter amount in multiples of 100");
		    		}
		    			else {
		    				if(depositamount<500) {
		    					System.out.println("Enter more than 500");
		    				}
		    				else {
		    					balance+=depositamount;
		    					System.out.println("desposited:"+depositamount +"Amount successfully,your updates balance is:"+balance);
		    				}
		    				}
		    			break;
		    			case 3:
		    				System.out.println("Enter withdraw amount");
		    				double withdraw=sc.nextDouble();
		    				if(withdraw%100!=0) {
		    					System.out.println("Enter amount in multiples of 100");
		    				}
		    				else {
		    					if(withdraw<500) {
		    						System.out.println("Enter more than 500");
		    					}
		    					else {
		    						if(withdraw>balance) {
		    							System.out.println("Insufficient funds");
		    						}
		    						else {
		    							balance-=withdraw;
		    							System.out.println("Amount withdraw:"+withdraw+"successfully,your updated balance is:"+balance);
		    						}
		    						
		    					}
		    				}
		    				break;
		    			case 4:
		    				System.out.println("Exit");
		    				System.out.println("Thankyou for using ATM Machine");
		    				break;
		    				default:
		    					System.out.println("Invalid choice choose between (1-4)options");
		    		}
			
		}while(choice!=4);
		sc.close();

		}
	

}

