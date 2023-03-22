package com.amjad;

class Player{
	int id ;
	String name;
	int age;
	
}

public class Driver1 {
    void print (Player p) {
    	  System.out.println(p.id+" "+p.name+" "+p.age);
	//  	return "p";
      }
      
      public static void main(String[] args) {
		Driver1 d = new Driver1 ();
		
		Player p = new Player ();
		p.id = 101;
		p.name = "amjad";
		p.age = 28;
		d.print(p);
	}
}
