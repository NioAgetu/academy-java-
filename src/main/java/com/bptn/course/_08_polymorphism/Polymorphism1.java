package com.bptn.course._08_polymorphism;

//parent class
class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//sub class 
class Dog extends Animal{
	// has its own methods
	//The overide method is best practice for subclass methods to note that it already exists in the main class
	@Override
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		//create an object of animal class
		Animal a1 = new Animal();
		a1.makeSound();
		
		Dog d1 =  new Dog();
		d1.makeSound();

	}

}
