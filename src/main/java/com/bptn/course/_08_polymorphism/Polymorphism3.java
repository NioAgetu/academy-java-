package com.bptn.course._08_polymorphism;
//method overloading polymorphism

public class Polymorphism3 {
	
	void print(int integer) {
		System.out.println("printing an integer: " + integer);
	}
	
	void print (String s) {
		System.out.println("printing a string: " + s);
	}
	
	int print(int a, int b) {
		return a +b;
	}
	
	double print(double a, double b) {
		return a +b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism3 p1 = new Polymorphism3();
		p1.print(5);
		
		p1.print("Hello World");
		
		System.out.println("the sum of the two integers: " + p1.print(2, 3));
		
		System.out.println("the sum of the two doubles: " + p1.print(2.0, 3.0));
		

	}

}
