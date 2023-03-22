package com.amjad;

class Soilder{
	int id;
	String name;
	int age;
	
}

public class Mobile {
	
	void copy (Soilder s) {
		System.out.println(s.id+ " "+ s.name+" "+ s.age);
		
	}
	
	public static void main(String[] args) {
		Mobile e = new Mobile ();
		Soilder s = new Soilder ();
		s.id = 110;
		s.name = "Amjad";
		s.age = 24;
		e.copy (s);
		
	}

}
