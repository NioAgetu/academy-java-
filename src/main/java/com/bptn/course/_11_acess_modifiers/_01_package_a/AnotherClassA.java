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
//Major keytakes
//1. We cannot access the private variable and method  outside the class but in the same package
//2. We can access default variable and method  outside the class but in the same package
//3. We can access public variable and method outside the class but in the same package
//4. We can access protected variable and method  outside the class but in the same package