package com.bptn.course._13_exceptions._02_unchecked_exceptions;

public class NestedTryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer try-catch block
		
		try {
			
			int[] nums = {1,2,3,4};
			int divisor = 0;
			String text =  null;
			
			//nested try block
			try {
				int result = 10/0; //critical statement
				System.out.println("The result is: " + result);
			}
			catch(ArithmeticException e) {
				
				System.out.println("An Arithmetic exception occured:" + e.getMessage());
			}
			
			//inner ry-catch 2
			try {
				System.out.println("The length of string is: " + text.length());
			}
			catch(NullPointerException e) {
				System.out.println("An nullPointer exception occured:" + e.getMessage());
				
			}
			//inner Try-catch 3
			try {
				System.out.println(nums[4]);//critical statement
			}
			catch(NullPointerException e) {
				System.out.println("An array of bounds exception" + e.getMessage());
				
			}
		}
		catch(Exception e) {
			System.out.println("A general exeption exception occured: " + e.getMessage());
			
		}

	}

}
