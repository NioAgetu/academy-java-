package com.bptn.course._13_exceptions._03_Custom_exceptions._01_custom_exception_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(1000, "43589");

		try {
			ba.withdraw(200);
			ba.withdraw(600);
			ba.withdraw(600);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println("Insufficient Funds, you need: " + e.getAmount() + " to complete transaction");
		}

	}

}
