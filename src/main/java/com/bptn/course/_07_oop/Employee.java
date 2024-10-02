package com.bptn.course._07_oop;

public class Employee {
	private String name;
	private int employeeId;
	private int age;
	
	public Employee() {
		name= "Nio";
		employeeId = 100;
		age=20;
	}
	
	public Employee(String name, int employeeId ) {
		//confirming that this.name is the variable defined in the instance private one
		this.name = name;
		this.employeeId = employeeId;
	}
	
	//print method
	public void printInfo() {
		System.out.println("Employeename: " + this.name + " EmployeeId: " + this.employeeId + " age: " + this.age );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.printInfo();
		
		Employee e2 = new Employee("John Doe", 1234);
		e2.printInfo();
				
		

	}

}
