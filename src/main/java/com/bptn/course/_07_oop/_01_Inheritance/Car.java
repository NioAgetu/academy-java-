package com.bptn.course._07_oop._01_Inheritance;

public class Car extends Vehicle {

	// instance variable for steering wheel
	String steeringWheel;

	public Car(String colour, String brand, String steeringWheel) {
		super(colour, brand);
		this.setSteeringWheel(steeringWheel);
	}

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public void print() {
		super.print();
	}

}
