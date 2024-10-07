package com.bptn.course._200_CodioPractice._02_family_tree_teachback;

public class FamilyTree {
	
	private String name;
	private String birthday;
	private int age;
	
	public FamilyTree (String name, String birthday, int age) {
		this.name = name;
		this.birthday = birthday;
		this.age =  age;
	}
	
	//public String toString() {
	//	return "The family name is " + name + ", birthday is: " + birthday + " and age is " + age;
	//}
	
	
	
	//public int hashCode()
	//{
		//return 34567890;
	//}
	
	
	public int nextBirthday() {
		return age + 1;
	}
	
	public String relativeType() {
		return "Family Member";
	}
	
	public String relativeType(String name) {

		return this.name + "is a family member";

	}

	public static void main(String[] args) {
		FamilyTree ft1 = new FamilyTree ("Webster", "june 10 1967", 57);
		FamilyTree ft2 = new FamilyTree ("Kodi", "october 13 2007", 17);
		
		
		
		
		
		ft1.hashCode();
		System.out.println(ft1.hashCode());
		
		String printToString = ft1.toString();
		System.out.println(printToString);
		
		ft2.getClass();
		System.out.println(ft2.getClass());
		
		ft1.nextBirthday();
		System.out.println(ft1.nextBirthday());
		
		System.out.println(ft2.relativeType());
		
	
		/*public Class getClass() {
		return "Teh family name is " + name + ", birthday is: " + birthday + " and age is " + age;
	}*/
	}
	
	

}
