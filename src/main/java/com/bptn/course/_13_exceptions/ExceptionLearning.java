package com.bptn.course._13_exceptions;

public class ExceptionLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            //  Block of code to try
            int a = 11;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException ae) {
            //  Block of code to handle errors
             System.out.println("The number cannot be divided by zero");  
        }

	}

}
