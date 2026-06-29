package com.codegnan.Exception;

public class ATM {
	private double balance=2000;
	private final int pin=1234;
	private int pinAttempts=0;
	public boolean verifyPin(int enteredPin) throws InvalidPinException{
		if(enteredPin==pin) {
			pinAttempts=0;
			System.out.println("Access Granted");
			return true;
		}else {
			pinAttempts++;
			if(pinAttempts>=3) {
				throw new InvalidPinException("Too Many Incorrect Attempts.Access Blocked");
			}else {
				System.out.println("Invalid Pin. Attempts Left"+(3- pinAttempts));
				return false;
			}
		}
	}
	public void deposit(double amount) throws InvalidAmountException{
		if(amount<0 || amount%100!=0) {
			throw new InvalidAmountException("Amount must be POsitive and Multiples of 100");
		}
		balance+=amount;
		System.out.println("Deposited Successful.New Balance is:" +balance);
	}
	public void withdraw(double amount)throws InvalidAmountException, InsufficientFundsException{
		if(amount<=0 || amount%100!=0) {
			throw new InvalidAmountException("Amount must be positive and multiplies of 100");
		}if(amount>balance) {
			throw new InsufficientFundsException("You can't withdraw amount more than balance");
			}
		balance-=amount;
	}
	public void checkBalance() {
		System.out.println("Balance Amount:"+balance);
		}

}
