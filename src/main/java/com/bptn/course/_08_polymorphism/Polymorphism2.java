package com.bptn.course._08_polymorphism;
//method overiding polymorphism
//parent class
class Shape{
	
	void drawAngle() {
		System.out.println("Drawing a shape angle");
	}
}

class Rectangle extends Shape{
	
	void drawAngle() {
		System.out.println("Drawing a rectangle");
	}
}

public class Polymorphism2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle();
		r1.drawAngle();

	}

}
