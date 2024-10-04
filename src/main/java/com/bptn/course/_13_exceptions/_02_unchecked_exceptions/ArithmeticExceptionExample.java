package com.bptn.course._13_exceptions._02_unchecked_exceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		//
	
		//critical statement
		//the try can be called with brackets'try()' its a way of doing it with resources
		try {
			int result = 10/0;
			System.out.println(result);
		}catch(ArithmeticException ae){
			System.out.println("Error code" + ae.getMessage());
			}
		}

}
