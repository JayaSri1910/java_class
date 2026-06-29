package com.codegnan.Multithreading;

public class BankAccount {
private double balance;

public BankAccount(double balance) {
	super();
	this.balance = balance;
}
public synchronized void withdraw(String user,double amount) {
	System.out.println(user+"Trying to withdraw "+amount);
	if(balance>=amount) {
		System.out.println(user+"is processing withdrawl");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
		   e.printStackTrace();
		}
		balance-=amount;
		System.out.println(user+"completed withdrawl remaining balance"+balance);
	}
	else {
		System.out.println(user+"Insufficient funds.available balance"+balance);
	}
	System.out.println("----------------------------------------------");
}
}
