package com.bptn.course._11_acess_modifiers._01_package_a;

public class AnotherClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA myObj= new ClassA();
		
		//myObj.privateMethod();
		
		//System.out.println("Accessing private variable: " + myObj.privateVar);
		
		myObj.defaultMehtod();
		
		System.out.println("Accessing default variable: " + myObj.defaultVariable);
		
		myObj.publicMethod();
		System.out.println("Accessing public variable: " + myObj.publicVariable);
		
		myObj.protectedMethod();
		System.out.println("Accessing public variable: " + myObj.protectedVasriable);
		
		


	}

}
