package com.bptn.course._13_exceptions._02_unchecked_exceptions;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] myArray= {10,20,30,40,50};
		
		
		
		try {
			
			//critical statement -  access an index that is not found
			System.out.println(myArray[10]);
			
		}
		catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("error: your array index is out of bounds");
		}

	}

}
