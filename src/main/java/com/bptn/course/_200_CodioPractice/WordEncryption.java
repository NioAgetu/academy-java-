package com.bptn.course._200_CodioPractice;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner =  new Scanner(System.in);
		
		System.out.println("Enter your word");
		String word = myScanner.nextLine();
		
		for (int i=0 ; i <= word.length()-1; i++) {
			
			char c1 = word.charAt(i);
			
			
			char myChar = c1;
			
			//check if the character is a digit to ignore the change)
			if (Character.isDigit(myChar)) {
				System.out.print(myChar);
			}
			else {
			
			int myAscii = myChar;
			
			//String newWord += myChar;
			//System.out.println(c1);
			
			int newAscii  = myAscii + 1;
			

			
			//get the ASCII code of myChar
			char newChar = (char) newAscii;
			System.out.print(newChar);
			}
		}	
		
		myScanner.close();
	}
}
