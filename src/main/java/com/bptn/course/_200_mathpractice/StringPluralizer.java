package com.bptn.course._200_mathpractice;

import java.util.Scanner;

public class StringPluralizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amt;
		String word;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("enter the amount");
	
		
		System.out.println("enter your word");
		word = myScanner.nextLine();
		
		String lastLetters = word.substring(word.length() - 2);
		String lastLetter = word.substring(word.length() - 1);
		
		System.out.println(lastLetters);
		
		
		if (lastLetters.equals("fe")) {
			System.out.println("enter the amount");
			amt = myScanner.nextInt();
			
			if (amt > 1) {
				String newName =  lastLetters.replace("fe", "ves");
				String firstletters = word.substring(0, word.length()-2);
				System.out.println(amt +" " + firstletters + newName);
			}
			else {
				System.out.println(amt +" " + word);
			}
		}
		else if (lastLetters.equals("sh") || lastLetters.equals("ch") ) {
			System.out.println("enter the amount");
			amt = myScanner.nextInt();
			
			if (amt > 1) {
				String newName = "es";
				String firstLetters = word.substring(0, word.length());
				System.out.println(amt +" " + firstLetters + newName);
			}
			else {
				System.out.println(amt +" " + word);
			}
			//checking for last letters and replacing them
		}else if (lastLetters.equals("ay") || lastLetters.equals("oy") || lastLetters.equals("ey") || lastLetters.equals("uy") ) {
			System.out.println("enter the amount");
			amt = myScanner.nextInt();
			
			if (amt > 1) {
				String newName = "s";
				String firstLetters = word.substring(0, word.length());
				System.out.println(amt +" " + firstLetters + newName);
			}
			else {
				System.out.println(amt +" " + word);
			}
		}else if (lastLetter.equals("y")) {
			System.out.println("enter the amount");
			amt = myScanner.nextInt();
			
			if (amt > 1) {
				String newName =  lastLetter.replace("y", "ies");
				String firstletters = word.substring(0, word.length()-1);
				String finalPlural=firstletters + newName;
				System.out.println(amt +" " +finalPlural);
			}
			else {
				System.out.println(amt +" " + word);
			}
			
			
		}else {
			System.out.println("enter the amount");
			amt = myScanner.nextInt();
			
			if (amt > 1) {
				String newName = "s";
				String firstLetters = word.substring(0, word.length());
				System.out.println(amt +" " +firstLetters + newName);
			}
			else {
				System.out.println(amt +" " + word);
			}
		}myScanner.close();

	}

}
