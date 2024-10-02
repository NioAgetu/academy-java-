package com.bptn.course._09_abstraction;
//abstraction using interface (after java 8)
// after java 8 interface methods only have abstract methods, default methods an static methods

interface Operations {
	void draw(); //abstract method - it has no implementation
	
	default int add(int a, int b) {
		return a + b;
	}
	
	//static method
	static double getRamNumber() {
		return Math.random();
	}
}

class Calculator implements Operations{
	@Override
	public void draw() {
		
		System.out.println("Draw method implemented by Calculator");
	}
}
public class Abstraction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2, 3);
		
		System.out.println("The result is: " + result);
		System.out.println("The random number is " + Operations.getRamNumber());
		
	}

}
