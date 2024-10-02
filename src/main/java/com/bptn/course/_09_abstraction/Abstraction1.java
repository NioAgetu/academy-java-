package com.bptn.course._09_abstraction;

// abstract class is a class that can not be instantiated aka it can not be used to create any objects

abstract class Shape {
	// Abstract method --> a method that has no implementation
	abstract void draw();
	
	abstract void print();
	
	//normal methods which has an implementation
	void moveTo(int x, int y)  {
		System.out.println("Move to: " + x + y);
		
	}
}


//sub class(child class) extends Shape class
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Draw a circle");
	}
	
	@Override
	void print() {
		System.out.println("Print a circle");
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
		//Create objects from circle class
		Circle c1= new Circle();
		c1.draw();
		c1.print();
		
		c1.moveTo(2, 3);// this is an inherited method from the shape class
	}

}
