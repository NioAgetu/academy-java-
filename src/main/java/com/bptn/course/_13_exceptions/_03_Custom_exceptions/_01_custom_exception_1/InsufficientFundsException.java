package com.bptn.course._13_exceptions._03_Custom_exceptions._01_custom_exception_1;

//can extend exception class or runtimeException class
//Exception is a checked Exception
//runtime exception is for the unchecked execption
public class InsufficientFundsException extends Exception {
	
	private static final long SerialVersionUID = 1L;
	
	private double amount;
	
	public InsufficientFundsException (double amount) {
		this.amount =  amount;
	}
	
	public double getAmount() {
		return amount;
	}
	

}
