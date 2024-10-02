package com.bptn.course._07_oop;

public class Phone {
	
	//declare the instance variables
	
	private int weight;
	private int height;
	private int width;
	private String color;
	
	//Constructor
	
	public Phone() {
		weight = 150;
		height=140;
		width=70;
		color= "Black";
	}
	
	public Phone(int w, int h, int wi, String c) {
		weight=w;
		height=h;
		width=wi;
		color=c;
	}
			
			//declare instance methods
	public void makePhoneCall() {
		System.out.println("Make a phone call");
	}
	
	public void sendTextMessage() {
		System.out.println("Send a text message");
	}
			

	public static void main(String[] args) {
		Phone myObj2= new Phone (200, 100, 50, "red");
		System.out.println("Default Phone weight: " + myObj2.weight + " " +  myObj2.color);
		
		myObj2.sendTextMessage();

	}

}
