package com.bptn.course._200_CodioPractice;

public class Person {
	
	  private String name;

	   public Person(String theName) {
	      this.name = theName;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Person p1 = new Person("Kairen");
	      Person p2 = new Person("Jewel");
	      Person p3 = new Person("Kairen");
	      Person p4 = p3;
	      System.out.println(p1.equals(p2));
	      System.out.println(p2.equals(p3));
	      System.out.println(p1.equals(p3));
	      System.out.println(p3.equals(p4));
	      
	}
}
	
