package com.bptn.course._200_CodioPractice;

import java.util.Scanner;

public class BigCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		
		int pressedOne = 0;
		do  {
			System.out.println ("what operation would you like to do?\nPress 1 for addition\r\n"
					+ "Press 2 for subtraction\r\n"
					+ "Press 3 for multiplication\r\n"
					+ "Press 4 for division\r\n"
					+ "Press 5 to square a number\r\n"
					+ "Press 6 to find a square root\r\n"
					+ "Press 7 to find the reciprocal");
			int pressed = myScanner.nextInt();

		    if (pressed == 1) {
		    	System.out.println ("Enter the number to find Sum: ");
	
		    	double num1 = myScanner.nextInt();
			    double num2 = myScanner.nextInt();
			    double newPressed = num1 + num2;
		    	
		      System.out.println("The result of the calculation is: " + newPressed);
		      System.out.println("To continue calculation Press 1, else press any other number to exit");
		      pressedOne = myScanner.nextInt();
		    } else if (pressed == 2) {
		    	System.out.println ("Enter the number to find the difference: ");
	
		    	double num1 = myScanner.nextInt();
			    double num2 = myScanner.nextInt();
			    double newPressed = num1 - num2;
		    	
			     System.out.println("The result of the calculation is: " + newPressed);
			     System.out.println("To continue calculation Press 1, else press any other number to exit");
			     pressedOne = myScanner.nextInt();
			 }else if (pressed == 3) {
				 System.out.println ("Enter the number to find the product ");
	
				    double num1 = myScanner.nextInt();
				    double num2 = myScanner.nextInt();
				    double newPressed = num1 * num2;
			    	
				     System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + newPressed);
				     System.out.println("To continue calculation Press 1, else press any other number to exit");
				     pressedOne = myScanner.nextInt();
			 }else if (pressed == 4) {
				 System.out.println ("Enter the number to find the division value ");
	
				    double num1 = myScanner.nextInt();
				    double num2 = myScanner.nextInt();
				    double newPressed = num1 / num2;
				    double remainder = num1 % num2;
			    	
				     System.out.println("Dividing " + num1 + " by "  + num2 +  " the quotient is " + newPressed + "\n The remainder is " + remainder);
				     System.out.println("To continue calculation Press 1, else press any other number to exit");
				     pressedOne = myScanner.nextInt();
			 }else if (pressed == 5) {
				 System.out.println ("Enter the number to find Square: ");
	
				    double num1 = myScanner.nextInt();
				    double newPressed = num1 * num1;
			    	
				     System.out.println("The Square of the number " + num1 + " is = " + newPressed);
				     System.out.println("To continue calculation Press 1, else press any other number to exit");
				     pressedOne = myScanner.nextInt();
			 }else if (pressed == 6) {
				 System.out.println ("what number would you like to operate with? ");
	
				    double num1 = myScanner.nextInt();
				    
				    for (double j=1; j < num1; j++) {
				    	if ( j * j == num1) {
				    		double  newPressed = j;
					    	
					    	System.out.println("The Square of the number " + num1 + " is = " + newPressed);
					    	System.out.println("To continue calculation Press 1, else press any other number to exit");
					    	pressedOne = myScanner.nextInt();
				    	}
				    }
			}else if (pressed == 7) {
				 System.out.println ("what number would you like to operate with? ");
	
				    double num1 = myScanner.nextInt();
				    double newPressed = 1/num1;
			    	
				     System.out.println("The Reciprocal of the number " + num1 + " is = " + newPressed);
				     System.out.println("To continue calculation Press 1, else press any other number to exit");
				     pressedOne = myScanner.nextInt();
			 }else {
				 System.out.println ("Invalid choice! Please make a valid choice.");
	
				  
			 }
		}while (pressedOne == 1);
		myScanner.close();
	}

}
