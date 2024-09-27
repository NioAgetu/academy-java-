package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		String s = "madam";
		String reversedWord = "";
	
		
		//finding the length of the string
	
		int stringLength= s.length();
		
		System.out.println("The length of the string is: "+ stringLength);
		
		//substring() method - to get to a part of the string
		
		String sub = s.substring(0, 3);
		
		System.out.println("The substring with start index 0 and end with index 8: " + sub);
		
		String sub1 = s.substring(2);
		
		System.out.println("The substring with start index 2 " + sub1);
		
		//tolowerCase() - converts all the letters of the string to lowercase
		String lowerCaseString = s.toLowerCase();
		
		System.out.println("The lowercase of the string is: " + lowerCaseString);
		
		String upperCaseString = s.toUpperCase();
		
		System.out.println("The uppercase of the string is: " + upperCaseString);
		
		//finding the index of the string. its an overloading method. it finds the 
		//first occurence of the phrase in the bracket and get's the index of the first letter
		
		int index = s.indexOf("madam");
		
		System.out.println("The index of World is: " + index);
		
		char c1 = s.charAt(3);
		
		System.out.println("The character at index 3: " + c1);
		
	
		//reversed word function
		for (int i= s.length()-1; i>=0 ; i--) {
			//concatenating the indexes
			reversedWord += s.charAt(i);
			
			
		}
		
		System.out.println("Reversed word: " + reversedWord);
		boolean isPalindrome = s.equals(reversedWord);
		
		
		if (isPalindrome) {
			System.out.println(s + " is a palindrome");
		}
		
		if (!isPalindrome) {
			System.out.println(s + " is not a palindrome");
		}
		
		String s1 = "Hi";
		String s2 = "Bye";
		int answer = s1.compareTo(s2);
		System.out.println(answer);
		
			
	}
}
