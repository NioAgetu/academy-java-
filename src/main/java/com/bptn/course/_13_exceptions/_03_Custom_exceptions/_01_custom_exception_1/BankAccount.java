package com.bptn.course._13_exceptions._03_Custom_exceptions._01_custom_exception_1;

public class BankAccount {

	private double balance;
	private String accountNumber;

	public BankAccount(double balance, String accountNumber) {

		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public void withdraw(double amount) throws InsufficientFundsException {

		if (amount > balance) {

			double needs = amount - balance;

			throw new InsufficientFundsException(needs);

		}
		balance -= amount;
		System.out.println("Withdrawal of $" + amount + " succesful" + ". Balance left is " + balance);
	}

}
