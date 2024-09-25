package com.bptn.course._02_scanner;

import java.util.Scanner;

public class javaInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare a scanner object
		Scanner scanner =  new Scanner(System.in);
		
		//create and store the user input
		String username;
		
		//read the input from the user and store it inside the variables created in step 2
		System.out.println("please enter your username. ");
		username = scanner.nextLine();
		
		System.out.println("Your name is " + username);
		
		scanner.close();
		

	};

}
