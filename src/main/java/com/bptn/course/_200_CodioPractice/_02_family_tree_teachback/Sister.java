package com.bptn.course._200_CodioPractice._02_family_tree_teachback;

public class Sister extends FamilyTree {
	private String personalityType;

	public Sister(String name, String birthday, int age, String personalityType ) {
		super(name, birthday, age);
		this.personalityType = personalityType;
		
	}
	
	public String relativeType(String name) {
		return name + "is a sister";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sister sissy = new Sister ("lisa", "82 July 1998", 36, "fun");
		
		System.out.println(sissy.nextBirthday());
		
		System.out.println(sissy.relativeType());
		

	}

}
