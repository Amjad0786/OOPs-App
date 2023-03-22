package com.overloading;

public class Calculator {
	void add(int i , int j) {
		System.out.println(i+"--"+j);
	}
	
	void add (int i , int j, int k) {
		System.out.println(i+"--"+ j+"--"+k);
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator ();
		c.add (10,20);
		c.add(10,  20, 30);
		
		
		
	}

}
