package com.bptn.course._09_abstraction;
//Abstraction using interface-Before Java 8
//before java 8 interface methods only have abstract and constant methods

interface ShapeInterface{
	
	void draw();
	double getArea();
}

//to implement the abstract methods from the interface-we need to create a sub-class
class RectangleClass implements ShapeInterface{
	private double width;
	private double height;
	
	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	
}


public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
