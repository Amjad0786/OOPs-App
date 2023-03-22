package com.inharitance;

public class Child extends Parent {
	public int hashcode() {
		return 101;
	}
	
	void m1() {
		System.out.println("Child-Class-m1() called");
	}
	
	void m2 () {
		System.out.println("Child-Class-m2() called");
		super.m2();
	}

}
 
