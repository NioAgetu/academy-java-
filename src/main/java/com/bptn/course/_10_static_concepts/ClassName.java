package com.bptn.course._10_static_concepts;

public class ClassName {
	// declare a static variable
	static int  staticVariable=100;
	
	//declare an instance variable
	int instanceVariable;
	
	static void staticMethod() {
		System.out.println("Static method is called..");
		
		//Note, you can not reference an instance variable or method from a static method
		//instanceMethod(); wont work neither will this.instance Variable
	}
	
	void instanceMethod() {
		System.out.println("Instance method is called..");
		
		//you can access a static variabl within an instance method
		//you can access a static method from an instance variable
		System.out.println(staticVariable);
		staticMethod();
	}
	

	//can i access and instance variable?

	//can I access a static variable?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
	}

}
