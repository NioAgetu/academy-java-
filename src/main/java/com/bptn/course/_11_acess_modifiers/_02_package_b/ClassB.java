package com.bptn.course._11_acess_modifiers._02_package_b;

import com.bptn.course._11_acess_modifiers._01_package_a.ClassA;

public class ClassB extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA myObj = new ClassA();
	
				// private variable can not be accessed
				// myObj.privateMethod();

				// System.out.println("Accessing private variable: " + myObj.privateVar);

				//default method can not be accessed tside of package
				// myObj.defaultMethod();
				// System.out.println("Accessing default variable: " + myObj.defaultVar);

				//public method and variablele can be accessed
				myObj.publicMethod();
				System.out.println("Accessing public variable: " + myObj.publicVariable);

				
				
				ClassB myObj1= new ClassB(); //create an object of ClassB
				
				//protected method can be accessed through a sub-class from a different package
				myObj1.protectedMethod();
				
				//protected variable can be accesses through a sub-class from a different package
				System.out.println("Accessing protected variable: " + myObj1.protectedVasriable);// No we cannot access the private method outside the class in a different
	
					
			}

// Major key takes
// 1. We cannot access the private variable and method outside the class and
// from different package
// 2. We cannot access the default variable and method outside the class and
// from different package
// 3. default --> package private
// 3. We can access public variable and method outside the class and from
// different package
// 4. We can access protected method and variable through a sub-class from a
// different package
// 5. When we create an object of ClassA(package_a) in ClassB(package_b), we
// need to add the import);

}


