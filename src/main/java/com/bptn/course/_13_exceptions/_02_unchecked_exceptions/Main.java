package com.bptn.course._13_exceptions._02_unchecked_exceptions;


//Coding 2.9: Program Exception
public class Main {
	
	public void method1() {
		int[] arr = {1,2,3,4};
		System.out.println(arr[4]);
	}
	
	public void method2() {
		try {
			method1();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main exceptionSolutionObject = new Main();
		exceptionSolutionObject.method2();//calling method 2 to print the code

	}

}
