package com.bptn.course._200_mathpractice;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumber = new Random();
		
		int codeDigit = randomNumber.nextInt(10);
		
		System.out.println("After execution the Random Number is: " + codeDigit);
		
		/*Math.random() generates a double between 0.0 (inclusive) and 1.0 (exclusive). 
		 * To get an integer between 1 and 100, multiply by 100, add 1, and cast to an 
		 * int: int randomNumber = (int)(Math.random() * 100) + 1; This scales the range to 0-99, 
		 * shifts it to 1-100, and converts to an integer.*/
		
		
	}

}
