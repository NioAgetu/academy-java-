package com.bptn.course._13_exceptions._02_unchecked_exceptions;

public class BuiltInExceptionExample {
	
	//create a method-which checks if the number is positive or negative
	//throws is alwasy used in the method signature as a warning
	//method has the ability to encounter a situatiion and shoud be in a position to handle it
	
	public static void checkPositive(int number) throws IllegalArgumentException {
		if(number<0) {
			throw new IllegalArgumentException("The number must be positive");
		}
		System.out.println("The number is positive");
	}

	public static void main(String[] args) {
		
		try {
			checkPositive(10);//this should be fine
			checkPositive(-10);
		}
		catch (IllegalArgumentException e) {
			System.out.println(" Caught an exception: " + e.getMessage());
			
		}
		checkPositive(-20);

	}

}

//IllegalArgumentExceptional is a sub class of RuntimeException
//RuntimeException is a sub class of Exception

//throws is optional in case of unchecked exceptions
