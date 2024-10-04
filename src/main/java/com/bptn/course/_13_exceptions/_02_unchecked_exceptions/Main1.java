package com.bptn.course._13_exceptions._02_unchecked_exceptions;

public class Main1 {
	
	void method() {
		try {
			
			try {
				int[] arr= {1,2,3,4};
				
				System.out.println(arr[0]);
				System.out.println(arr[5]);
			}
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException Occured");
			}
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException is handled in the outer block");
		}
	}

	 public static void main(String args[]) {
	        Main nestedTryBlockSolutionObject = new Main();
	        nestedTryBlockSolutionObject.method1();
	    }

}
