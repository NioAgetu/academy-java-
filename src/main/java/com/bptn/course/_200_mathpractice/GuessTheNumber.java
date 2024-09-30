package com.bptn.course._200_mathpractice;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		int targetNumber = 23;
		
		System.out.println("Please enter a number between 1 and 100.");

		int guess = myScanner.nextInt();
		// no while loop it will run continuously
		while (guess >= 1 && guess <= 100 ) {
		
			if (guess == targetNumber) {
				System.out.println("Please enter a number between 1 and 100.");
				break;
			}else if (guess > targetNumber) {
				System.out.println("Too high! Try again.");
				break;
			}else {
				System.out.println("Too low! Try again.");
				break;
			}
		}System.out.println("Please enter a number between 1 and 100.");
		myScanner.close();

	}

}
