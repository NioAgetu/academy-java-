package com.bptn.course._13_exceptions._02_unchecked_exceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = null;
		
		try {
			System.out.println(text.length());
		}
		catch(NullPointerException e) {
			System.out.println("An error occured: " + e.getMessage());
		}
		
		System.out.println("statement after the try/catch");
	}

}
