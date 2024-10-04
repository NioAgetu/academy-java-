package com.bptn.course._07_oop._01_Inheritance;

public class Vehicle {
	
	protected String colour;
	protected String brand;
	
	public Vehicle() {
        this("Black", "Tesla");
    }
	//public parameterized constructors to take in values for the instance variables
	public Vehicle (String colour, String brand) {
		this.colour = colour;
		this.brand = brand;
	}
	
	 public void print() {
	        System.out.println(this.colour + " " + this.brand);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("White", "Audi", "Chromecoloured");
        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
        System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
        System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);
        car.print();

	}

}
