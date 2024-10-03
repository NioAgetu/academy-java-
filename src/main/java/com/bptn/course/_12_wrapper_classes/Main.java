package com.bptn.course._12_wrapper_classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Autoboxing -  converting a primitive type into wrapper class. int -> Integer
		
		Integer intObject = Integer.valueOf(100);
		
		//Alternatively, we can also convert primitive type to a Wrapper class using the below syntax
		Integer intObject1= 20;
		
		//unboxing is the process of converting a wrapper class into a primitive type
		int intPrimitive =  intObject;//a more preferred way to do so
		
		//alternatively you can also 
		int intPrimitive1 = intObject1;

	}

}

//Autoboxing - converting a primitive type into a wrtappper class example: int -> Integer
