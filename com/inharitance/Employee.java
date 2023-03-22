package com.inharitance;

public class Employee extends User {
	double salary;
	
	public static void main(String[] args) {
		Employee emp =new Employee ();
		emp.id = 101;
		emp.name = "Ashraf";
		
		emp.salary = 95000.00;
		
		System.out.println(emp.id+ "--"+ emp.name+"--"+ emp.salary);
	}
	

}
