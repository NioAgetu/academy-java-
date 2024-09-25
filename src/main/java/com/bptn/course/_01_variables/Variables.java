package com.bptn.course._01_variables;

public class Variables {

	public static void main(String[] args) {
		int firstNumber = 50;
		int secondNumber = 10;
		
		int sum = firstNumber + secondNumber;
		int subtract = firstNumber - secondNumber;
		int multiply =  firstNumber * secondNumber;
		double divide = firstNumber / secondNumber;
		
		System.out.print("The original variables are ");
		System.out.print(firstNumber + " and ");
		System.out.println(secondNumber);
		
		
		System.out.println("The sum of the two are " + sum);
		System.out.println(firstNumber + " minus " + secondNumber + " is " + subtract);
		System.out.println("The multiplication of both is " + multiply);
		System.out.println(firstNumber + " divided by " + secondNumber + " is " + divide);
		
		firstNumber = 80;
		secondNumber = 40;
		
		System.out.println("The new firstNumber is " + firstNumber + " new secondNumber is " + secondNumber);
		
		char letterNew = 'U';
		String myName = "Nio Agetu";
		
		System.out.println(letterNew);
		System.out.println(myName);

	}

}
