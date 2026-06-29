package com.codegnan.Multithreading;

public class UserC implements Runnable {
	private BankAccount account;
	public UserC(BankAccount account) {
		this.account=account;
	}
		@Override
		public void run() {
			account.withdraw(Thread.currentThread().getName(),3000);
			
		}

}
