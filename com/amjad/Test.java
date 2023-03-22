package com.amjad;

public class Test {
	
	public static void main(String[] args) {
		
		Account Obj = new Account();
		
		Obj.setAccNum (1234783894);
		Obj.setName("Amjad");
		
		int AccNum = Obj. getAccNum();
		String Name = Obj .getName();
		
		
		
		
		System.out.println(AccNum+ "--"+Name);
		
	}

}
