package com.bptn.course._11_acess_modifiers._01_package_a;

public class ClassA {
	//private variable
	private int privateVar;
	
	//public variable
	public int publicVariable;
	
	//default variable
	int defaultVariable;
	
	//protected vvariable
	protected int protectedVasriable;
	
	//private method
	private void privateMethod() {
		System.out.println("This is a private method");
	}
	
	//public method
	public void publicMethod() {
		System.out.println("This is a public method");
		
	}
	//defaulkt method
	void defaultMehtod() {
		System.out.println("This is a default method");
		
	}
	
	//protected method
	protected void protectedMethod() {
		System.out.println("This is a protected method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA myObj= new ClassA();
		
		myObj.privateMethod();
		
		System.out.println("Accessing private variable: " + myObj.privateVar);
		
		myObj.defaultMehtod();
		
		System.out.println("Accessing default variable: " + myObj.defaultVariable);
		
		myObj.publicMethod();
		System.out.println("Accessing public variable: " + myObj.publicVariable);
		
		myObj.protectedMethod();
		System.out.println("Accessing public variable: " + myObj.protectedVasriable);
		
		

	}

}


//take away
//We can access the private variable and method within the same class
//We can access default variable and method within the same class
//We can access public variable and method within the same class
//We can access protected variable and method within the same class