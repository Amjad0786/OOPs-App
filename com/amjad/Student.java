package com.amjad;

public class Student extends User{
	private int rank;

	void m1() {
	int rank;
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		 s.rank = 1;
		 
		 s.id =101;
		 s.Name = "Amjad";
		 
		 System.out.println(s.rank+"--"+ s.id+"--"+ s.Name);
	}
	
	 

}
